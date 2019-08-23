package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCUtil;

public class Test05_login {
	public static void main(String[] args) {
		System.out.println("	로그인 처리		");
		
		Connection con = null;
		//Statement st = null; // ? 처리 안됨.
		PreparedStatement ps = null; // ?를 처리할수 있는 관리 객체.
		ResultSet rs = null;
		
		String id = "aa";
		String pw = "aa";
		
		//String sql = "select * from users where id ='"+id+"' and password ='"+pw+"'";
	
		String sql = "select * from users where id =? and password =?";
		// ? 처리를 하게되면 Statement를 사용 할수 없다.
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString("id")+"로그인 성공");
				System.out.printf("%s / %s",rs.getString("id"),rs.getString("name"));
			}else {
				System.out.println("로그인 실패");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs); // ps는 기존에 st의 자식으로 바로 변경 가능
		}
	}
	

}

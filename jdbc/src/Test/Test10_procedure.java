package Test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class Test10_procedure {

	public static void main(String[] args) {
		//execute InsertBook(1,'java ~~~','한빛',27000);
		
		String sql = "{call InsertBook(?,?,?,?)}"; // 프로시저를 호출하는 sql구문. {call 프로시저명}
		Connection con= null;
		CallableStatement ps= null;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareCall(sql);
			// ? 셋팅
			ps.setInt(1, 1);
			ps.setString(2, "자바");
			ps.setString(3, "홍길동");
			ps.setInt(4, 4);
			// 실행 및 결과값 핸들링
 			ps.execute();
 			System.out.println("call InsertBook 수행");
			//ps.executeUpdate();
 			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, null);
		}
	}

}

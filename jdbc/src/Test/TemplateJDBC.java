package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class TemplateJDBC {
	public static void main(String[] args) {
		String sql = "";
		Connection con= null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		int result = 0 ;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 셋팅
			
			// 실행 및 결과값 핸들링
 			rs = ps.executeQuery();
			//ps.executeUpdate();
 			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
	}

}





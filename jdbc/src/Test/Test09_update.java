package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class Test09_update {
	public static void main(String[] args) {
		Emp9 emp = new Emp9();
		emp.updateEmp(2000,"smith");
		System.out.println("=== end ===");
		
	}

}
class Emp9{
	public int updateEmp(int sal, String ename) {
		String sql = "update emp set sal = ? where lower(ename) = ?";
		Connection con= null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 셋팅
			ps.setInt(1,sal) ;
			ps.setString(2, ename);
			// 실행 및 결과값 핸들링
				result = ps.executeUpdate();
			//ps.executeUpdate();
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	 }
	
}
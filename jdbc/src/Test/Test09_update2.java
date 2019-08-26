package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;
import vo.Dept;

public class Test09_update2 {
	public static void main(String[] args) {
		Emp99 emp = new Emp99();
		Dept d = new Dept();
		d.setDeptno(50);
		d.setDname("기술부");
		d.setLoc("제주도");
		int count = emp.updateEmp(d);
		System.out.println(count + "=> 갱신");
		
	}

}
class Emp99{
	public int updateEmp(Dept dept) {
		String sql = "update dept set dname = ?, loc = ? where deptno =? ";
		Connection con= null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 셋팅
			ps.setString(1, dept.getDname()) ;
			ps.setString(2, dept.getLoc());
			ps.setInt(3, dept.getDeptno());
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
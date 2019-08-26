package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class Test08_delete {
	public static void main(String[] args) {
		Emp8 emp = new Emp8();
		emp.deleteEmp(1111);
	}

	
}

class Emp8{
	
	public int deleteDept(int deptno) { //?
		int result = 0;
		
		return result;
	}
	public int deleteEmp(int empno) {
	String sql = "delete from emp where empno = ?";
	Connection con= null;
	PreparedStatement ps= null;
	ResultSet rs = null;
	int result = 0;
	
	try {
		con = JDBCUtil.getConnection();
		ps = con.prepareStatement(sql);
		// ? 셋팅
		ps.setInt(1, empno);
		// 실행 및 결과값 핸들링
			result = ps.executeUpdate();
		//ps.executeUpdate();
			
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		JDBCUtil.close(con, ps, rs);
	}
	return result;
 }
}

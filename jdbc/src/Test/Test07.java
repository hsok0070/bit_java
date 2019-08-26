package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.JDBCUtil;
import vo.Employee;

public class Test07 {

	public static void main(String[] args) {
		Emp7 emp = new Emp7();
		//int count = Emp7.insertDept(80, "교육부", "서울");
		//System.out.println(count + " : insert ");
		System.out.println("========================");
		System.out.println(" end ");

//		Employee data = new Employee(9999,"구구구",9999,99);
		Employee data = new Employee();
		data.setEmpno(1111);
		data.setEname("이순신");
		data.setSal(9900);
		data.setDeptno(50);
		
		int count  = emp.insertEMP(data);
		System.out.println(count + " : insert");
		
	
	}
}

class Emp7{
	public int insertDept(int deptno, String dname, String loc) {
		String sql = "insert into dept(deptno,dname,loc) values(?,?,?)";
		Connection con= null;
		PreparedStatement ps= null;
		int result = 0 ;
		try {
		con = JDBCUtil.getConnection();
		ps = con.prepareStatement(sql);
		// ? 셋팅
		ps.setInt(1, deptno);
		ps.setString(2, dname);
		ps.setString(3, loc);
		
		// 실행 및 결과값 핸들링
		//rs = ps.executeQuery();
		result=ps.executeUpdate();
			
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		JDBCUtil.close(con, ps, null);
	}
		return result;
}
	
	
	public int insertEMP(Employee emp) {
		String sql = "insert into emp(empno,ename,hiredate,sal,deptno) values (?,?,sysdate,?,?)";
		Connection con= null;
		PreparedStatement ps= null;
		int result = 0 ;
		try {
		con = JDBCUtil.getConnection();
		ps = con.prepareStatement(sql);
		// ? 셋팅
		ps.setInt(1, emp.getEmpno());
		ps.setString(2, emp.getEname());
		ps.setInt(3, emp.getSal());
		ps.setInt(4, emp.getDeptno());
		
		
		// 실행 및 결과값 핸들링
		//rs = ps.executeQuery();
		result=ps.executeUpdate();
			
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		JDBCUtil.close(con, ps, null);
	}
		return result;
	}
}
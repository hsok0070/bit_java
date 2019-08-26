package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.Dept;

public class DeptDao {
	
	//Dept 테이블의 모든 레코드 정보
	public List<Dept> getAllDeptRec() {
		String sql = "select * from dept order by deptno";
		Connection con= null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		
		List<Dept> list = new ArrayList<Dept>();
		
		try {
			System.out.println("con 할당");
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 셋팅
			
			// 실행 및 결과값 핸들링
 			rs = ps.executeQuery();
 			while (rs.next()) {
 				list.add(new Dept(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc")));
 				
 			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
			System.out.println("자원반납");
		}
		return list;
	}
	
	//update
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
//	=====================================================================
//	insert
	public int insertDept(Dept dept) {
		String sql = "insert into dept(deptno,dname,loc) values(?,?,?)";
		Connection con= null;
		PreparedStatement ps= null;
		int result = 0 ;
		try {
		con = JDBCUtil.getConnection();
		ps = con.prepareStatement(sql);
		// ? 셋팅
		ps.setInt(1, dept.getDeptno());
		ps.setString(2, dept.getDname());
		ps.setString(3, dept.getLoc());
		
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

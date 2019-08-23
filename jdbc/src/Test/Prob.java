package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class Prob {
    private static void show(int DEPARTMENT_ID) {
	// 문제 조건에 맞게 구현하시오.
    	Connection con = null;
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	
 
    	String sql = "select avg(salary) as 평균급여 from employees e, departments d where e.department_id = d.department_id and d.department_id = ?";
    	
    	try {			
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, DEPARTMENT_ID);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.printf("%d ",rs.getInt("평균급여"));
			}else {
				System.out.println("department ID 확인");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);// ps는 기존에 st의 자식으로 바로 변경 가능
		}
	}



public static void main(String[] args) {
	show(10);
	System.out.println("============================");
	show(50);
}
}


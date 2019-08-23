package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Test03 {
	public static void main(String[] args) {
		int deptno = 10;
		if(args.length != 0) {
		deptno = Integer.parseInt(args[0]);	
		}
		String sql = "select * from emp where deptno = "+deptno;
		//db 연동시 필수 변수


		Connection con = null;
		Statement st = null;
		ResultSet rs = null; // select 의 결과값 즉 테이블 형식
		int result = 0 ; // dml의 결과 값
		
		System.out.println("***********JDBC TEST***********"); 
		//1. JDBC드라이버 필수!! : ojdbc6.jar파일을 classpath에 추가 작업
		//String driver = "oracle.jdbc.OracleDriver";
		
		try {
			con = JDBCUtil.getConnection();
			//2. 드라이버 로딩 작업.(classpath 확인 > driver name 확인)
			//3. db로 연결
			//4. sql 구분을 관리해 주는 관리 객체
			st = con.createStatement();
			//5. sql 실행
			rs = st.executeQuery(sql);
			//System.out.println(rs.getMetaData().getColumnCount());
			
			//6. 결과값 핸들링 (열이름 확인 , 열속성에 따라서 get타입 바꿔주기!)
			while(rs.next()) {
				System.out.print(rs.getString("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getString("mgr")+"\t");
				System.out.print(rs.getString("deptno")+"\t");
				System.out.print(rs.getDate("hiredate")+"\n");
			}
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//7. 자원반납		
			try {
				JDBCUtil.close(con, st, rs);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		
		
		
		
		
		
		System.out.println("***********END***********");
	}

}

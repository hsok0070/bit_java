package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test02 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.136:1521:xe";
		String user = "SCOTT";
		String pw = "TIGER";
		
		String sql = "select e.ename as \"사원명\", e.sal as e급여  , m.ename as 상사명, m.sal as m급여 from emp e  left outer join emp m on e.mgr = m.empno\r\n" + 
				"join dept on e.deptno = dept.deptno where e.sal > m.sal ";
		
		

//		"select e.ename, e.sal ,dname,loc , m.ename, m.sal"+
//		"from emp e  left outer join emp m on e.mgr = m.empno"+
//		"join dept on e.deptno = dept.deptno where e.sal > m.sal";
		
		//db 연동시 필수 변수


		Connection con = null;
		Statement st = null; // 객체 관리.
		ResultSet rs = null; // select 의 결과값 즉 테이블 형식
		int result = 0 ; // dml의 결과 값
		
		System.out.println("***********JDBC TEST***********"); 
		//1. JDBC드라이버 필수!! : ojdbc6.jar파일을 classpath에 추가 작업
		//String driver = "oracle.jdbc.OracleDriver";
		
		try {
			//2. 드라이버 로딩 작업.(classpath 확인 > driver name 확인)
			Class.forName(driver);
			//3. db로 연결
			con =DriverManager.getConnection(url, user, pw);
			//4. sql 구분을 관리해 주는 관리 객체
			st = con.createStatement();
			//5. sql 실행
			rs = st.executeQuery(sql);
			//System.out.println(rs.getMetaData().getColumnCount());
			
			//6. 결과값 핸들링 (열이름 확인 , 열속성에 따라서 get타입 바꿔주기!)
			while(rs.next()) {
				System.out.print(rs.getString("사원명")+"\t");
				System.out.print(rs.getString("e급여")+"\t");
				System.out.print(rs.getString("상사명")+"\t");
				System.out.print(rs.getString("m급여")+"\n");
			}
				
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver check");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//7. 자원반납		
			try {
				if(rs!= null) rs.close();
				if(st!= null) st.close();
				if(con!= null) con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		System.out.println("***********END***********");
	}

}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.UsersVO;

public class UsersDao {
	public static void main(String[] args) {
		int count=login("a1","a1");
		System.out.println(count);
	}
	public static int login(String id, String pw) {
		int a=0;
		Connection con =null;
		Statement st =null; // ?표 처리를 못함 
		PreparedStatement ps =null; // sql구문의 ?를 처리할 수 있는 녀석이다. , 보안상 
		//오라클 딴에서는 st보다 ps가 성능이 훨 씬 ~ 좋다 ~ 
		ResultSet rs =null;
		//String sql = "select * from users where id='"+id+"' and password='"+pw+"'";
		String sql = "select * from users where id=? and passwd=?";
		//?가 드가면 Statement가 사용불가다
		try {
			con =JDBCUtil.getConnection();
			ps =con.prepareStatement(sql); //sql이 여기 드감 
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery(); //여기 바뀐부분!! 잘 보기
			
			if(rs.next()) {
				a=1;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {JDBCUtil.close(con, ps, rs); // ps는 st의 자식이므로 형 변환을 안해주고 바로 넣어도 ㄱㅊ
			
		}
		return a;
	}
	
	public String searchUser(String id) {
//		String sql="select * from emp where lower(ename) like lower('%'||?||'%')"; //오라클에서는 ||로 연결시킴
		String sql="select * from users where lower(id) like lower('%'||?||'%')";
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs =null;
		int result =0;
		String role = null;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1,id);
			//이 방법도 있다.
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				role=rs.getString("role");
				
			}
			
			
			// ? 세팅
			
			//실행 및 결과값 핸들링 
			ps.executeQuery();
//			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		return role;
	}
	
	//Dept 테이블의 모든 레코드 정보
	public List<UsersVO> getAllUserRec() {
		List<UsersVO> lsm = new ArrayList<UsersVO>();
		String sql = "select * from users order by id";
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs =null;
		
		try {
			System.out.println(" con 할당 ");
		con = JDBCUtil.getConnection();
		ps = con.prepareStatement(sql);
		rs =ps.executeQuery();

		while(rs.next()) {
			lsm.add(new UsersVO(rs.getString("id"),rs.getString("passwd"),rs.getString("name"),rs.getString("role")));
		}
		// ? 세팅
		// 실행 및 결과값 핸들링
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		return lsm;
	}
	
	public int updateUser(String id,String passwd) {
		String sql = "update users set passwd=? where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);

			// ? 세팅
			ps.setString(1,passwd);
			ps.setString(2, id);
			
			// 실행 및 결과값 핸들링
			result = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception

		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}
	
	public int deleteUser(String id) {
		String sql ="delete from users where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);

			// ? 세팅
			ps.setString(1, id);
			// 실행 및 결과값 핸들링
			result = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception

		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}
	
	public int insertUser(UsersVO user) {
		String sql="insert into users(id,passwd,name,role) values(?,?,?,?)";
		Connection con =null;
		PreparedStatement ps =null;
		int result =0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			// ? 세팅
			ps.setString(1, user.getId());
			ps.setString(2, user.getPasswd());
			ps.setString(3, user.getName());
			ps.setString(4, user.getRole());
			
			//실행 및 결과값 핸들링 
			result=ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		
		}finally {
			JDBCUtil.close(con, ps, null);//반납할 rs가 없어서 null을 넘겨줌 이클립스는 나머지만 반납하라는 의미로 해석함 
		}
		
		return result;
	}
	
}

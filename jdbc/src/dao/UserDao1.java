package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.Book;
import vo.User;

public class UserDao1 {
	public List<User> getAllUserRec() {
	String sql = "select * from users orber by id";
	Connection con= null;
	PreparedStatement ps= null;
	ResultSet rs = null;
	
	List<User> list = new ArrayList<User>();
	
	try {
		System.out.println("con 할당");
		con = JDBCUtil.getConnection();
		ps = con.prepareStatement(sql);
		// ? 셋팅
		
		// 실행 및 결과값 핸들링
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new User(rs.getString("id"),rs.getString("name"),rs.getString("role"),rs.getInt("passwd")));
				
			}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		JDBCUtil.close(con, ps, rs);
		System.out.println("자원반납");
	}
	return list;
}

public int DeleteUser(User user) {
String sql = "delete from user where id = ?";
Connection con= null;
PreparedStatement ps= null;
int result = 0;

try {
	con = JDBCUtil.getConnection();
	ps = con.prepareStatement(sql);
	// ? 셋팅
	ps.setString(1, user.getId());
	
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

//insert
public int InsertUser(User user) {
	String sql = "insert into user(id,name,role,passwd) values(?,?,?,?)";
	Connection con= null;
	PreparedStatement ps= null;
	int result = 0 ;
	try {
	con = JDBCUtil.getConnection();
	ps = con.prepareStatement(sql);
	// ? 셋팅
	ps.setString(1, user.getId());
	ps.setString(2, user.getName());
	ps.setString(3, user.getRole());
	ps.setInt(4, user.getPasswd());
	
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


public int UpdateUser(User user) {
	String sql = "update  set passwd = ? where id =? ";
	Connection con= null;
	PreparedStatement ps= null;
	ResultSet rs = null;
	int result = 0;
	try {
		con = JDBCUtil.getConnection();
		ps = con.prepareStatement(sql);
		// ? 셋팅
		ps.setInt(1, user.getPasswd()) ;
		ps.setString(2, user.getId());
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


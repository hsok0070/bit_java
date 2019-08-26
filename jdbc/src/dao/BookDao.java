package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.Book;
import vo.Dept;

public class BookDao {
	public List<Book> getAllBookRec() {
		String sql = "select * from Book order by bookid";
		Connection con= null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		
		List<Book> list = new ArrayList<Book>();
		
		try {
			System.out.println("con 할당");
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 셋팅
			
			// 실행 및 결과값 핸들링
 			rs = ps.executeQuery();
 			while (rs.next()) {
 				list.add(new Book(rs.getInt("bookid"),rs.getString("bookname"),rs.getInt("price"),rs.getString("PUBLISHER")));
 				
 			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
			System.out.println("자원반납");
		}
		return list;
	}
	
	public int DeleteBook(Book book) {
	String sql = "delete from book where bookname = ?";
	Connection con= null;
	PreparedStatement ps= null;
	int result = 0;
	
	try {
		con = JDBCUtil.getConnection();
		ps = con.prepareStatement(sql);
		// ? 셋팅
		ps.setString(1, book.getBookname());
		
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
	public int InsertBook(Book book) {
		String sql = "insert into Book(bookid,bookname,price,publisher) values(?,?,?,?)";
		Connection con= null;
		PreparedStatement ps= null;
		int result = 0 ;
		try {
		con = JDBCUtil.getConnection();
		ps = con.prepareStatement(sql);
		// ? 셋팅
		ps.setInt(1, book.getBookid());
		ps.setString(2, book.getBookname());
		ps.setInt(3, book.getPrice());
		ps.setString(4, book.getPublisher());
		
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
	
	
	public int UpdateBook(Book book) {
		String sql = "update Book set bookname = ?, price = ? where bookid =? ";
		Connection con= null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 셋팅
			ps.setString(1, book.getBookname()) ;
			ps.setInt(2, book.getPrice());
			ps.setInt(3, book.getBookid());
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
	
	
	public void SeachBookname(Book book) {
		//String sql = "select * from emp where lower(ename) like lower('%'||?||'%') ";
		String sql = "select * from Book where lower(bookname) like ? ";
		Connection con= null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			//ps.setString(1, ename);
			ps.setString(1, "%"+book.getBookname().toLowerCase()+"%");
			// ? 셋팅
			
			// 실행 및 결과값 핸들링
 			rs = ps.executeQuery();
			//ps.executeUpdate();
			
 			while (rs.next()) {
 				System.out.print(rs.getInt("bookid")+" ");
 				System.out.print(rs.getString("bookname")+" ");
 				System.out.print(rs.getInt("price")+" ");
 				System.out.print(rs.getString("Publisher")+" ");
 				System.out.println();
 			}
 			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
	
	}
}

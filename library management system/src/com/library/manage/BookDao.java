package com.library.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class BookDao {
	public static boolean insertBookToDB(books b) {
		boolean flag = false;

		try {
			try {
				Connection con = CP.createC();
				String q = "insert into books(bname,bcopy,bfine) values(?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(q);
				pstmt.setString(1, b.getBookName());
				pstmt.setInt(2, b.getBookCopies());
				pstmt.setInt(3, b.getBookFines());
				pstmt.executeUpdate();
				flag = true;

			} catch (Exception e) {

				e.printStackTrace();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return flag;
	}

	public static boolean deleteBook(int bookId) {
		boolean flag = false;

		try {
			try {
				Connection con = CP.createC();
				String q = "delete from books where bid=?";
				PreparedStatement pstmt = con.prepareStatement(q);
				pstmt.setInt(1, bookId);
				
				pstmt.executeUpdate();
				flag = true;

			} catch (Exception e) {

				e.printStackTrace();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return flag;

	}

	public static void showAllBooks() {
		
		

		try {
			try {
				Connection con = CP.createC();
				String q = "select * from books";
				java.sql.Statement stmt=con.createStatement();
				ResultSet set=stmt.executeQuery(q);
				while(set.next()) {
					int id=set.getInt(1);
					String name=set.getString(2);
					int copies=set.getInt(3);
					int fines=set.getInt(4);
					System.out.println(id);
					System.out.println(name);
					System.out.println(copies);
					System.out.println(fines);
					System.out.println("*****************************");
					
				}
				
				
				

			} catch (Exception e) {

				e.printStackTrace();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		
	}

}

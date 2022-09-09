package com.library.manage;

public class books {
	private int bookId;
	private String bookName;
	private int bookCopies;
	private int bookFines;
	public books(int bookId, String bookName, int bookCopies, int bookFines) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCopies = bookCopies;
		this.bookFines = bookFines;
	}
	public books(String bookName, int bookCopies, int bookFines) {
		super();
		this.bookName = bookName;
		this.bookCopies = bookCopies;
		this.bookFines = bookFines;
	}
	public books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookCopies() {
		return bookCopies;
	}
	public void setBookCopies(int bookCopies) {
		this.bookCopies = bookCopies;
	}
	public int getBookFines() {
		return bookFines;
	}
	public void setBookFines(int bookFines) {
		this.bookFines = bookFines;
	}
	@Override
	public String toString() {
		return "books [bookId=" + bookId + ", bookName=" + bookName + ", bookCopies=" + bookCopies + ", bookFines="
				+ bookFines + "]";
	}
	

}

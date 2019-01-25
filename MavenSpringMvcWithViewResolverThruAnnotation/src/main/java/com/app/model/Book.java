package com.app.model;

public class Book {
	
	private int bookId;
	
	private String bookName;
	
	private int length;
	
	private int width;

	public Book(int bookId, String bookName, int length, int width) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.length = length;
		this.width = width;
	}

	/**
	 * @return the bookId
	 */
	public int getBookId() {
		return bookId;
	}

	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
}

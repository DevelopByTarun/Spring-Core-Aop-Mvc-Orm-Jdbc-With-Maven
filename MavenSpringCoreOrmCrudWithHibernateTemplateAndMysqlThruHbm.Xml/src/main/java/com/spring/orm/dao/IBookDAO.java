package com.spring.orm.dao;

import java.util.ArrayList;

import com.spring.orm.dto.BookDTO;

public interface IBookDAO {
	
	public void saveBook(BookDTO book);
	
	public void updateBook(BookDTO book);
	
	public void deleteBook(BookDTO book);
	
	public BookDTO getBookById(int id);
	
	public ArrayList<BookDTO> getAllBooks();
}

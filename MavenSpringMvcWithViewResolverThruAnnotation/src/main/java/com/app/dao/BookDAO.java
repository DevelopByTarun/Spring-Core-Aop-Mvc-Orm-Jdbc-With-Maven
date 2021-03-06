package com.app.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.app.model.Book;

@Repository
public class BookDAO {
	
	List<Book> bookList = new ArrayList<Book>();
	{
		Book book1 = new Book(1, "Ramayana",5,4);
		Book book2 = new Book(2, "Mahabharat",6,3);
		bookList.add(book1);
		bookList.add(book2);
	}
	
	public Book getBook(int id) {
		//In real time, use database to fetch data
		return bookList.get(id);
	}
}

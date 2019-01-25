package com.spring.orm.dao;

import java.util.ArrayList;
import com.spring.orm.dto.BookDTO;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class BookDAO implements IBookDAO {

	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void saveBook(BookDTO book) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(book);
	}

	public void updateBook(BookDTO book) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(book);
	}

	public void deleteBook(BookDTO book) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(book);
	}

	public BookDTO getBookById(int id) {
		// TODO Auto-generated method stub
		BookDTO bookDTO = hibernateTemplate.get(BookDTO.class, id);
		return bookDTO;
	}

	public ArrayList<BookDTO> getAllBooks() {
		// TODO Auto-generated method stub
		ArrayList<BookDTO> bookList = new ArrayList<BookDTO>();
		bookList = (ArrayList<BookDTO>) hibernateTemplate.loadAll(BookDTO.class);
		return bookList;
	}
}

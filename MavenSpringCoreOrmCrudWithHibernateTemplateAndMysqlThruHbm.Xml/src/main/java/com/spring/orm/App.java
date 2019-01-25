package com.spring.orm;

import java.util.ArrayList;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.dto.BookDTO;
import com.spring.orm.dao.IBookDAO;

public class App 
{
    @SuppressWarnings({ "resource", "unused" })
	public static void main( String[] args ) {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	IBookDAO dao = (IBookDAO) ac.getBean("bookDaoObject");    	
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("");
    		System.out.println("1. Add Book");
    		System.out.println("2. Update Book");
    		System.out.println("3. Delete Book");
    		System.out.println("4. Fetch All Books");
    		System.out.println("5. Fetch Book By Id");
    		System.out.println("6. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			System.out.print("Enter Book Name :: ");
    			String name = sc.next();
    			
    			System.out.print("Enter Book Author :: ");
    			String author = sc.next();
    			
    			System.out.print("Enter Book Publisher :: ");
    			String publisher = sc.next();
    			
    			System.out.print("Enter Book Price :: ");
    			int price = sc.nextInt();
    			
    			BookDTO add = new BookDTO();
    			add.setName(name);
    			add.setAuthor(author);
    			add.setPublisher(publisher);
    			add.setPrice(price);
    			dao.saveBook(add);
    			if(add != null) {
    				System.out.println("Book Added Successfully");
    			}
    			else {
    				System.out.println("Unable To Add Book");
    			}
    		}
    		else if(choice == 2) {
    			System.out.print("Enter Book Name :: ");
    			String name = sc.next();
    			
    			System.out.print("Enter Book Author :: ");
    			String author = sc.next();
    			
    			System.out.print("Enter Book Publisher :: ");
    			String publisher = sc.next();
    			
    			System.out.print("Enter Book Price :: ");
    			int price = sc.nextInt();
    			
    			System.out.print("Enter Book Id Want To Update :: ");
    			int id = sc.nextInt();
    			
    			BookDTO update = new BookDTO();
    			update.setName(name);
    			update.setAuthor(author);
    			update.setPublisher(publisher);
    			update.setPrice(price);
    			update.setId(id);
    			dao.updateBook(update);
    			if(update != null) {
    				System.out.println("Book Updated Successfully");
    			}
    			else {
    				System.out.println("Unable To Update Book");
    			}
    		}
    		else if(choice == 3) {
    			System.out.print("Enter Book Id Want To Delete :: ");
    			int id = sc.nextInt();
    			
    			BookDTO delete = new BookDTO();
    			delete.setId(id);
    			dao.deleteBook(delete);
    			if(delete != null) {
    				System.out.println("Book Deleted Successfully");
    			}
    			else {
    				System.out.println("Unable To Delete Book");
    			}
    		}
    		else if(choice == 4) {
    			ArrayList<BookDTO> bookList = dao.getAllBooks();
    			for(BookDTO books : bookList) {
    				System.out.println("Book Id Is :: "+books.getId());
    				System.out.println("Book Name Is :: "+books.getName());
    				System.out.println("Book Author Is :: "+books.getAuthor());
    				System.out.println("Book Publisher Is :: "+books.getPublisher());
    				System.out.println("Book Price Is :: "+books.getPrice());
    				System.out.println("");
    			}
    		}
    		else if(choice == 5) {
    			System.out.print("Enter Book Id Want To Fetch Record :: ");
    			int id = sc.nextInt();
    			
    			BookDTO search = dao.getBookById(id);
    			if(search != null) {
    				System.out.println(search);
    			}
    			else {
    				System.out.println("Unable To Search Book");
    			}
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
    	}
    }
}

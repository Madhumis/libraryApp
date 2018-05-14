package service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bean.Book;

public class BookService implements Serializable {

	static HashMap<Integer,Book> bookIdMap=getBookIdMap();
	
	public BookService() {
		// TODO Auto-generated constructor stub
		
			  super();
			 
			  if(bookIdMap==null)
			  {
			   bookIdMap=new HashMap<Integer,Book>();
			   // Creating some object of books while initializing
			   Book windBook=new Book(1, "Wind","John Dawson");
			   Book lastsummerBook=new Book(2, "Last Summer","Anne Lara");
			   Book crossroadsBook=new Book(3, "Cross Roads","A. Lawrence");
			   Book bestDaysBook=new Book(4, "Best Days","Kenneth Silva");
			 
			 
			   bookIdMap.put(1,windBook);
			   bookIdMap.put(2,lastsummerBook);
			   bookIdMap.put(3,crossroadsBook);
			   bookIdMap.put(4,bestDaysBook);
			  }
			 }
			 
			 public List getAllBooks()
			 {
			  List books = new ArrayList(bookIdMap.values());
			  return books;
			 }
			 
			 public Book getBook(int id)
			 {
			  Book book= bookIdMap.get(id);
			 /*
			  if(book == null)
			  {
			   throw Exception("Book with id "+id+" not found");
			  }
			  */
			  return book;
			 }
			 public Book addBook(Book book)
			 {
			  book.setId(getMaxId()+1);
			  bookIdMap.put(book.getId(), book);
			  return book;
			 }
			 
			 public Book updateBook(Book book)
			 {
			  if(book.getId()<=0)
			   return null;
			  bookIdMap.put(book.getId(), book);
			  return book;
			 
			 }
			 public void deleteBook(int id)
			 {
			  bookIdMap.remove(id);
			 }
			 
			 public static HashMap<Integer, Book> getBookIdMap() {
			  return bookIdMap;
			 }
			 
			 // Utility method to get max id
			 public static int getMaxId()
			 {   int max=0;
			 for (int id:bookIdMap.keySet()) {  
			  if(max<=id)
			   max=id;
			 
			 }  
			 
			 return max;
			 }
	}



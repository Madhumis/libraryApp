package controller;

import java.io.Serializable;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import bean.Book;
import service.BookService;
import java.net.URI;

@Path("/books")
public class BookController implements Serializable {

		BookService bookService=new BookService();
		 
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Book> getBooks()
	    
	    {
	   
	    	List listOfBooks = bookService.getAllBooks();
	    	return listOfBooks;	
	    
	    }
	    
	    @GET
	    @Path("/{id}")
	    @Produces(MediaType.APPLICATION_JSON)
	 public Book getBookById (@PathParam("id") int id)
	 {
	  return bookService.getBook(id);
	 }
		
	    @POST
	    @Produces(MediaType.APPLICATION_JSON)
	 public Book addBook(Book book)
	 {
	  return bookService.addBook(book);
	 } 
	    
	    @PUT
	    @Produces(MediaType.APPLICATION_JSON)
	 public Book updateBook(Book book)
	 {
	  return bookService.updateBook(book);
	  
	 }
	    
	    @DELETE
	    @Path("/{id}")
	    @Produces(MediaType.APPLICATION_JSON)
	 public void deleteBook(@PathParam("id") int id)
	 {
	   bookService.deleteBook(id);
	  
	 }
	    
	}



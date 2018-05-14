/**
 * 
 */
package bean;

import java.io.Serializable;

/**
 * @author Madhumi
 *
 */
public class Book implements Serializable {

	/**
	 * 
	 */
	
	int id;
	String bName; 
	String bAuthor; 
	
	Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int id, String bName, String bAuthor) {
		  super();
		  this.id = id;
		  this.bName = bName;
		  this.bAuthor = bAuthor;
		 }
	
	public int getId() {
		  return id;
		 }
		 public void setId(int id) {
		  this.id = id;
		 }
		 public String getbName() {
		  return bName;
		 }
		 public void setbName(String bName) {
		  this.bName = bName;
		 }
		 public String getbAuthor() {
		  return bAuthor;
		 }
		 public void setbAuthor(String bAuthor) {
		  this.bAuthor = bAuthor;
		 } 

}


















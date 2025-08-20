package assignment3.Inheritance;

public class Book extends Item{
	
	private String author;

	public Book(long id, String title,String author) {
		super(id, title);
		this.author = author;
	}
	
	@Override
	void displayInfo() {
		System.out.println("Book: "+"[ Id: "+getId()+" , Title: "+getTitle()+" , Author: "+author+" ]");
	}
	

}

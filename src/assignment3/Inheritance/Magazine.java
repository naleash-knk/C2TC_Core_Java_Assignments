package assignment3.Inheritance;

public class Magazine extends Item{
	
	private int issueNumber;
	
	public Magazine(long id,String title,int issueNumber) {
		super(id,title);
		this.issueNumber=issueNumber;
	}
	
	@Override
	void displayInfo() {
		System.out.println("Magazine: "+"[ Id: "+getId()+" , Title: "+getTitle()+" , IssueNumber: "+issueNumber+" ]");
	}
}

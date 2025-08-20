package assignment3.Inheritance;

public class Item {
	private long id;
	private String title;
	
	public Item(long id, String title) {
		this.setId(id);
		this.setTitle(title);
	}
	
	void displayInfo() {
		System.out.println(id+" "+getTitle());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id=id;
	}

}

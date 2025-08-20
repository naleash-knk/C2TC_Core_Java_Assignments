package assignment3.Composition;
import java.util.ArrayList;

public class Library {
    ArrayList<Item> lib = new ArrayList<Item>();

    public void addItem(Item item) {
        lib.add(item);
    }

    public void displayAllItems() {
        for (Item i : lib) {
            i.displayInfo();
        }
    }
}

class Item {
    private String title;
    private long id;
    private String author;
    private int issueNumber;

    public Item(long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

  
    public Item(long id, String title, int issueNumber) {
        this.id = id;
        this.title = title;
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }



    public String getAuthor() {
        return author;
    }

 

    public String getTitle() {
        return title;
    }



    public long getId() {
        return id;
    }



    public void displayInfo() {
        if (author == null) {
            System.out.println("Magazine: [ Id: " + getId() + " , Title: " + getTitle() + " , IssueNumber: " + issueNumber + " ]");
        } else {
            System.out.println("Book: [ Id: " + getId() + " , Title: " + getTitle() + " , Author: " + author + " ]");
        }
    }
}

package assignment3.Inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		Book newbook = new Book(12457,"DSA Algorithms","Naleash");
		
		newbook.displayInfo();
		
		Magazine newmag = new Magazine(87542,"Journey of Charles",88);
		
		newmag.displayInfo();
	}

}

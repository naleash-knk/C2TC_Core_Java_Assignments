package assignment3.Composition;

public class CompositionMain {
    public static void main(String[] args) {
        Library lib = new Library();

        Item book = new Item(12457, "DSA Algorithms", "Naleash");
        Item magazine = new Item(87542, "Journey of Charles", 88);

        lib.addItem(book);
        lib.addItem(magazine);

        lib.displayAllItems();
    }
}

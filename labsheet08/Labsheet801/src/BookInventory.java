import javax.swing.*;

public class BookInventory {
    public static void main(String[] args) {
        book[] books = new book[3];
        for (int i = 0; i < books.length; i++) {
            String booktitle = JOptionPane.showInputDialog("Enter book title: ");
            int totalbook = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number: "));
            books[i] = new book(booktitle, totalbook);
            showInfo(books[i]);
        }
    }
    static void showInfo(book books) {
        System.out.println(books.getTitle() + " has " + books.getTotalbook() + " books, can borrow " + books.getAvailablebook() + " books.");
    }
}
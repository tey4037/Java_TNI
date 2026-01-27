import javax.swing.*;

public class Borrowbooktest {
    public static void main(String[] args) {
        book books = new book("C#Programming",5);
        int Confirm = JOptionPane.showConfirmDialog(null,"Would you like to borrow a book?","borrow book", JOptionPane.YES_NO_OPTION);
        while (Confirm == JOptionPane.YES_OPTION){
            if (books.getAvailablebook() != 0 ){
                books.borrowBook();
                System.out.println("Borrowed 1 book, available " + books.getAvailablebook()+ " books.");
                break;
            }
            if (books.getAvailablebook() == 0 ){
                JOptionPane.showMessageDialog(null, "No books available to borrow...", null, JOptionPane.WARNING_MESSAGE);
                break;
            }
        }
        if (Confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"End program");
        }
    }
}

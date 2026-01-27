import javax.swing.*;

public class Returnbooktest {
    public static void main(String[] args) {
        book book = new book("Java Programming",5);
        int returnbook = JOptionPane.showConfirmDialog(null,"Would you like to borrow /return","borrow/return", JOptionPane.YES_NO_OPTION);
        while (returnbook == JOptionPane.YES_OPTION){
            int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Press 1 to borrow"+"\n"+"Press 2 to return"));
            if (num < 1 || num > 2 ){
                JOptionPane.showMessageDialog(null,"END PROGRAM");
                break;
            }
            if (num == 1) {
                book.borrowBook();
                System.out.println("Borrowed 1 book, available " + book.getAvailablebook() + " books.");
            }
            if (num == 2) {
                book.returnBook();
                System.out.println("Return 1 book, available " + book.getAvailablebook() + " books.");
            }
            if (book.getAvailablebook() == 0 ){
                JOptionPane.showMessageDialog(null, "No books available to borrow...", null, JOptionPane.WARNING_MESSAGE);
            }
            if (book.getAvailablebook() == 5 ){
                JOptionPane.showMessageDialog(null, "No books to return", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        if (returnbook == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"End program");
        }
    }
}

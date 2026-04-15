
/**
 * Lab 1 Exercise 3 activity of class TestStrList .
 *
 * Nicholas Langit
 * 8/6/2024
 *
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class lab1Exercise3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1. create an array list of type Book
        ArrayList<Book> bookList = new ArrayList<Book>();
        //2. create 5 book objects and store in the list
        System.out.println("Enter 5 books (title, author, year,type):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.print("Title:");
            String title = scan.nextLine();
            System.out.print("Price:");
            double price = Double.parseDouble(scan.nextLine());
            System.out.print("Year:");
            int year = Integer.parseInt(scan.nextLine());

            System.out.print("Type (t/w/o):");
            char type = scan.nextLine().charAt(0);
            Book book = new Book(title, year, price, type);
            bookList.add(book);
        }
        //3. display all book objects in the list
        System.out.println("Book List:");
        for (Book book : bookList) {
            System.out.println(book);
        }
        //4.  update book year 2025 with discount
        System.out.println("Update book year 2025 with discount:");
        for (Book book : bookList) {
            if (book.getYear() == 2025) {
                book.setPrice(book.getPrice() - 5.0);
            }
            System.out.println(book);
        }
        //5. replace new book info
        System.out.println("Replace new book info:");
        System.out.print("Enter book title to replace:");
        String titleToReplace = scan.nextLine();
        for (Book book : bookList) {
            if (book.getTitle().equals(titleToReplace)) {
                System.out.print("Enter new title:");
                String newTitle = scan.nextLine();
                System.out.print("Enter new price:");
                double newPrice = Double.parseDouble(scan.nextLine());
                System.out.print("Enter new year:");
                int newYear = Integer.parseInt(scan.nextLine());
                System.out.print("Enter new type (t/w/o):");
                char newType = scan.nextLine().charAt(0);
                book.setTitle(newTitle);
                book.setPrice(newPrice);
                book.setYear(newYear);
                book.setType(newType);
            }
        }
        System.out.println("Book List:");
        for (Book book : bookList) {
            System.out.println(book);
        }
        //6. find expensive book and display
        System.out.println("Expensive book:");
        Book expensiveBook = null;
        for (Book book : bookList) {
            if (expensiveBook == null || book.getPrice() > expensiveBook.getPrice()) {
                expensiveBook = book;
            }
        }
        System.out.println(expensiveBook);
        //7. count total price of all books in the list
        double totalT = 0.0, totalW = 0.0, totalO = 0.0;
        for (Book book : bookList) {
            switch (book.getType()) { //get type
                case 't' -> //if type is t, add price to totalT
                    totalT += book.getPrice();//add price to totalT
                case 'w' ->
                    totalW += book.getPrice();
                case 'o' ->
                    totalO += book.getPrice();
                default -> {
                }
            }
        }
        System.out.println("Total price of all books:");
        System.out.println("Type T: " + totalT);
        System.out.println("Type W: " + totalW);
        System.out.println("Type O: " + totalO);
        //8. display all
        System.out.println("Book List:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}

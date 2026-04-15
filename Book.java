
public class Book {

    private String title;
    private int year;
    private double price;
    private char type;

    //constructors
    public Book() {
        this.title = "";
        this.year = 0;
        this.price = 0.0;
        this.type = ' ';
    }

    public Book(String title, int year, double price, char type) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    //toString method
    public String toString() {
        return "\nTitle :\t" + "\tYear :\t" + "\tPrice :\t" + "\tType :\n" + title + "\t\t" + year + "\t\t" + price + "\t\t" + type;
    }
}

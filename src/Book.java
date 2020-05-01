public class Book {
    private String title;
    private String author;
    private String desc;
    private double price;
    private boolean inStock;

    public Book(){ //Default Constructor // Create an empty copy

    }

    public Book(String title){ // This is the overloaded constructor
        // giving title an value immediately
        this.title = title;
    }

    public String getTitle() { // This method is public
        // and it will return a string value of the title//
        return title; // this will return the value of title from private field
    }

    public void setTitle(String title){ // This is an method is public
        // and it will set the string value of title.
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    public String getDisplayText() {
        return "Author: " + getAuthor() + "\n" + "Title: " + getTitle() + "\n" + "Description: " + getDesc();
    }

}
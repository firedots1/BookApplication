public class BookApp {
    public static void main(String[] args) {

        Book book2 = new Book("The Sea");
        book2.setAuthor("Zhi");
        book2.setDesc("Book about the Sea");
        System.out.println(book2.getDisplayText());

        System.out.println();
        Book book3 = new Book();
        book3.setAuthor("Joe");
        book3.setTitle("The Far Lands");
        book3.setDesc("Talks about the Far Lands");
        System.out.println(book3.getDisplayText());
    }
}

import java.util.Comparator;
import java.util.TreeSet;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Book book1 = new Book("Ishmael",263,"Daniel Quinn",LocalDate.of(1992,9,1));
        Book book2 = new Book("To Kill a Mockingbird", 281, "Harper Lee",LocalDate.of(1960,7,11));
        Book book3 = new Book("1984", 328, "George Orwell",LocalDate.of(1949,6,8));
        Book book4 = new Book("One Hundred Years of Solitude", 417, "Gabriel García Márquez", LocalDate.of(1967,5,30));
        Book book5 = new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", LocalDate.of(1925,4,10));

        TreeSet<Book> booksSortedByTitle = new TreeSet<Book>();
        booksSortedByTitle.add(book1);
        booksSortedByTitle.add(book2);
        booksSortedByTitle.add(book3);
        booksSortedByTitle.add(book4);
        booksSortedByTitle.add(book5);    

        System.out.println("Books sorted by name: ");
        for (Book b : booksSortedByTitle) {
            System.out.println(b);
        }

        TreeSet<Book> booksSortedByPage = new TreeSet<Book>(new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Integer.compare(book1.getPageNumber(), book2.getPageNumber());
            }
        });

        booksSortedByPage.add(book1);
        booksSortedByPage.add(book2);
        booksSortedByPage.add(book3);
        booksSortedByPage.add(book4);
        booksSortedByPage.add(book5);


        System.out.println("\nBooks sorted by page number: \n");
        for (Book b : booksSortedByPage) {
            System.out.println(b);
        }
        

    }

}

import java.time.LocalDate;

public class Book implements Comparable<Book>{

    private String title;
    private int pageCount;
    private String author;
    private LocalDate publishDate;

    public Book(String title, int pageCount, String author, LocalDate publishDate){
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publishDate = publishDate;
    }

    public int getPageNumber(){
        return this.pageCount;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return title + " by " + author + ", " + pageCount + " pages, published on " + publishDate;
    }

}

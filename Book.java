import java.util.Comparator;

public class Book implements Comparable<Book> {


    private String name;
    private int pageNumber;
    private String writer;
    private int pubDate;

    public Book(String name, int pageNumber,String writer,int pubDate){
        this.name=name;
        this.pageNumber=pageNumber;
        this.writer=writer;
        this.pubDate=pubDate;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int pubDate) {
        this.pubDate = pubDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }


    @Override
    public int compareTo(Book book) {
        return this.name.compareTo(book.getName());
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageNumber=" + pageNumber +
                ", writer='" + writer + '\'' +
                ", pubDate=" + pubDate +
                '}';
    }
}

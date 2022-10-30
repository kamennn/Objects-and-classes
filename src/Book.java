public class Book {
    private String bookName;
    private int yearPublication;
    private final Author author;

    public Book(String bookName, int yearPublication, Author author) {
        this.bookName = bookName;
        this.yearPublication = yearPublication;
        this.author = author;
    }


    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

}

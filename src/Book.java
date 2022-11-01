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

    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Object.equals(bookName, book.bookName) && Object.equals(author, book.author);
    }

    public int hashCode() {
        return Object.hash(bookName, author, yearPublication);
    }

    public String toString() {
        return this.bookName + " " + this.yearPublication + " " + this.author;
    }
}

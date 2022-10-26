public class Book {
    private String nameAuthor;
    private String name;
    private int yearPublication;

    public Book(String name,String nameAuthor, int yearPublication) {
        this.name = name;
        this.yearPublication = yearPublication;
        this.nameAuthor = nameAuthor;
    }

    public String getName() {
        return this.name;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}

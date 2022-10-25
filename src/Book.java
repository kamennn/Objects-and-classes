public class Book {
    private String name;
    private int yearPublication;

    public Book(String name, int yearPublication) {
        this.name = name;
        this.yearPublication = yearPublication;
    }

    public String getName() {
        return this.name;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}

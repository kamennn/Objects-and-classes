public class Author {
    private String name;
    private String middleName;

    public Author(String name, String middleName) {
        this.name = name;
        this.middleName = middleName;
    }

    public String getName() {
        return this.name;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Object.equals(name, author.name) && Object.equals(middleName, author.middleName);
    }

    public int hashCode() {
        return Object.hash(name, middleName);
    }

    public String toString() {
        return this.name + " " + this.middleName;
    }

}



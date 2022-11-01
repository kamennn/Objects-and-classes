public class Main {


    public static void main(String[] args) {
        Book stalker = new Book("S.T.A.L.K.E.R.", 2007, new Author("Sergey", "Nedorubov"));
        System.out.println(stalker);
        Author andrzej = new Author("Andrzej", "Sapkowski");
        Book witcher = new Book("Witcher",1986, andrzej);
        System.out.println(witcher.getBookName() + " " + witcher.getYearPublication() + " " + andrzej);
        witcher.setYearPublication(2013);
        System.out.println(witcher.getBookName() + " " + witcher.getYearPublication() + " " + andrzej);

        Author sergey = new Author("Sergey", "Nedorubov");
        Author andrzej1 = new Author("Andrzej", "Sapkowski");
        Author andrzej2 = new Author("Andrzej", "Sapkowski");
        System.out.println("Author copies equal: " + andrzej1.equals(andrzej2));
        System.out.println(("Author copies equal be hashCode: " + (andrzej1.hashCode() == andrzej2.hashCode())));
        System.out.println("Author equal: " +andrzej1.equals(sergey));
        System.out.println("Author equal be hashCode: " + (andrzej1.hashCode() == sergey.hashCode()));
        System.out.println(andrzej1);
        System.out.println(sergey);
    }
}
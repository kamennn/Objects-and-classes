public class Main {


    public static void main(String[] args) {
        Book stalker = new Book("S.T.A.L.K.E.R.", 2007, new Author("Sergey", "Nedorubov"));
        Author andrzej = new Author("Andrzej", "Sapkowski");
        Book witcher = new Book("Witcher",1986, andrzej);
        System.out.println(stalker.getBookName() + " " + stalker.getYearPublication() + " " + Author.getName() + " " + Author.getMiddleName()  );
        System.out.println(witcher.getBookName() + " " + witcher.getYearPublication() + " " + andrzej.getName() + " " + andrzej.getMiddleName());
        witcher.setYearPublication(2013);
        System.out.println(witcher.getBookName() + " " + witcher.getYearPublication() + " " + andrzej.getName() + " " + andrzej.getMiddleName());
    }
}
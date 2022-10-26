public class Main {


    public static void main(String[] args) {
        Book stalker = new Book("S.T.A.L.K.E.R.", "Sergey Nedorubov",2007);
        Author sergey = new Author("Sergey", "Nedorubov");
        System.out.println(stalker.getName() + " " + stalker.getYearPublication() + " " + stalker.getNameAuthor());
        Book witcher = new Book("Witcher","Andrzej Sapkowski" ,1986);
        Author andrzej = new Author("Andrzej", "Sapkowski");
        System.out.println(witcher.getName() + " " + witcher.getYearPublication() + " " + andrzej.getName() + " " + andrzej.getMiddleName());
        witcher.setYearPublication(2013);
        System.out.println(witcher.getName() + " " + witcher.getYearPublication() + " " + andrzej.getName() + " " + andrzej.getMiddleName());
    }
}
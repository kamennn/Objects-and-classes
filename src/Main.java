public class Main {


    public static void main(String[] args) {
        Book stalker = new Book("S.T.A.L.K.E.R.", 2007, new Author("Sergey","Nedorubov" ));
        Book witcher = new Book("Witcher",1986, new Author("Andrzej", "Sapkowski"));
        Author andrzej = new Author("Andrzej", "Sapkowski");
        System.out.println(stalker.getName() + " " + stalker.getYearPublication() + " " +  );
        System.out.println(witcher.getName() + " " + witcher.getYearPublication() + " " + andrzej.getName() + " " + andrzej.getMiddleName());
        witcher.setYearPublication(2013);
        System.out.println(witcher.getName() + " " + witcher.getYearPublication() + " " + andrzej.getName() + " " + andrzej.getMiddleName());
    }
}
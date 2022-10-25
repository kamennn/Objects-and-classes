public class Main {


    public static void main(String[] args) {
        String nameJohn = "John";
        int ageJohn = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя - " + names[i] + " Возраст - " + ages[i]);
        }
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John", 13);


        Book stalker = new Book("S.T.A.L.K.E.R.", 2007);
        Author sergey = new Author("Sergey", "Nedorubov");
        System.out.println(stalker.getName() + " " + stalker.getYearPublication() + " " + sergey.getName() + " " + sergey.getMiddleName());
        Book witcher = new Book("Witcher", 1986);
        Author andrzej = new Author("Andrzej", "Sapkowski");
        System.out.println(witcher.getName() + " " + witcher.getYearPublication() + " " + andrzej.getName() + " " + andrzej.getMiddleName());
        witcher.setYearPublication(2013);
        System.out.println(witcher.getName() + " " + witcher.getYearPublication() + " " + andrzej.getName() + " " + andrzej.getMiddleName());
    }
}
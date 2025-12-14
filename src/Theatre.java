import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        System.out.println("Поехали!");

        Actor americanActor = new Actor("Meryl", "Streep", Gender.FEMALE, 168d);
        Actor russianActor = new Actor("Alexander", "Marakulin", Gender.MALE, 190d);
        Actor britishActor = new Actor("Gary", "Oldman", Gender.MALE, 174d);
        Director russianDirector = new Director("Anton", "Chekhov", Gender.MALE, 17);
        Director sovietDirector = new Director("Yury", "Grigorovich", Gender.MALE, 8);
        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);

        Show threeSisters = new Show("Три сестры", 120d, russianDirector, new ArrayList<>());
        Opera theQueenOfSpades = new Opera("Пиковая дама", 180d, sovietDirector, new ArrayList<>(), musicAuthor, "Все умирают. Аплодисменты!", 50);
        Ballet sleepingBeauty = new Ballet("Спящая красавица", 180d, sovietDirector, new ArrayList<>(), musicAuthor, "Все спят, а потом женятся. Аплодисменты!", choreographer);

        threeSisters.addActor(britishActor);
        theQueenOfSpades.addActor(russianActor);
        sleepingBeauty.addActor(americanActor);

        threeSisters.printActors();
        theQueenOfSpades.printActors();
        sleepingBeauty.printActors();

        theQueenOfSpades.changeActor(britishActor, russianActor.surname);
        theQueenOfSpades.printActors();

        sleepingBeauty.changeActor(russianActor, "Захарова");

        theQueenOfSpades.printLibrettoText();
        sleepingBeauty.printLibrettoText();
    }
}

import java.util.ArrayList;

public class Show {
    protected String title;
    protected double duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirector() {
        System.out.println(director.toString());
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }
//
    public void addActor(Actor actor) {
        if (actor == null || actor.isMissed()) {
            System.out.println("Укажите корректные сведения об актере и повторите попытку.");
            return;
        }
        for (Actor someActor : listOfActors) {
            if (someActor.equals(actor)) {
                System.out.println("Данный актер уже участвует в спектакле, повторное добавление невозможно.");
                return;
            }
        }
        listOfActors.add(actor);
        System.out.println("Актер " + actor + " успешно добавлен в список.");
    }

    public void changeActor(Actor actor, String replacedSurname) {
        if (actor == null || actor.isMissed() || replacedSurname.isBlank()) {
            System.out.println("Укажите корректные сведения об актерах и повторите попытку.");
            return;
        } else {
            for (Actor someActor : listOfActors) {
                if (someActor.surname.equals(replacedSurname)) {
                    listOfActors.set(listOfActors.indexOf(someActor), actor);
                    System.out.println("Замена произведена.");
                    return;
                }
            }
            System.out.println("Актер " + replacedSurname + " в списках не значится, проверьте правильность ввода.");
        }
    }
}

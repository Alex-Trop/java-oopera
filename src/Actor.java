import java.util.Objects;

public class Actor extends Person {
    private final double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }
    //метод, чтобы отлавливать некорректное заполнение полей имени и фамилии актера. В отношении пола и роста не стала писать, т.к. с этим сам компилятор справляется
    public boolean isMissed() {
        boolean isMissed = false;
        if (this.name.isBlank() || this.surname.isBlank()) isMissed = true;
        return isMissed;
    }

    @Override public String toString() {
        return name + " " + surname + " (рост " + height + ")";
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor anotherActor = (Actor) obj;
        return Objects.equals(name, anotherActor.name) && Objects.equals(surname, anotherActor.surname) && (height == anotherActor.height);
    }

    @Override public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}

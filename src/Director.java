import java.util.Objects;

public class Director extends Person{
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return Objects.equals(name, director.name) && Objects.equals(surname, director.surname) && Objects.equals(gender, director.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }
}

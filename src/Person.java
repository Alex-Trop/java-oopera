import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
    
    @Override public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Person anotherPerson = (Person) obj;
        return Objects.equals(name, anotherPerson.name) && Objects.equals(surname, anotherPerson.surname) && Objects.equals(gender, anotherPerson.gender);
    }

    @Override public int hashCode() {
        return Objects.hash(name, surname, gender);
    }
}

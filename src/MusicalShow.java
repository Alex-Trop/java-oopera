import java.util.ArrayList;

public class MusicalShow extends Show {
    protected final String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, double duration, Director director, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}

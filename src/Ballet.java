import java.util.ArrayList;

public class Ballet extends MusicalShow{
    protected final String choreographer;

    public Ballet(String title, double duration, Director director, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}

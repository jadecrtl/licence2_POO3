import java.util.LinkedList;
import java.util.List;

public class Pseudo {
    private String content;
    private List<ChangePseudoHistory> observateurs;
    
    public Pseudo(String content) {
        this.content = content;
        observateurs = new LinkedList<>();
    }

    public void addObs(ChangePseudoHistory obs) {
        observateurs.add(obs);
    }

    public void set(String nouvContent) {
        for (ChangePseudoHistory obs : observateurs) {
            obs.notify(content, nouvContent);
        }
        content = nouvContent;
    }
}

/* Correction Exo 2
import java.util.LinkedList;
import java.util.List;

public class Pseudo<T> {
    private T content;
    private List<ChangePseudoHistory<T>> observateurs;
    
    public Pseudo(T content) {
        this.content = content;
        observateurs = new LinkedList<>();
    }

    public void addObs(ChangePseudoHistory obs) {
        observateurs.add(obs);
    }

    public void set(T nouvContent) {
        for (ChangePseudoHistory obs : observateurs) {
            obs.notify(content, nouvContent);
        }
        content = nouvContent;
    }
}
*/

/*Correction Exo 3
import java.util.LinkedList;
import java.util.List;

public class Pseudo<T> extends Observable{
    private T content;
    private List<ChangePseudoHistory<T>> observateurs;
    
    public Pseudo(T content) {
        this.content = content;
        observateurs = new LinkedList<>();
    }

    public void addObs(ChangePseudoHistory obs) {
        observateurs.add(obs);
    }

    public void set(T nouvContent) {
        T old = content;
        content = nouvContent;
        setChanged();
        notifyObservers(old);
    }
}
*/



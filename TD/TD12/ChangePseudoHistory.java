import java.util.LinkedList;
import java.util.List;

public class ChangePseudoHistory {

    private class Modif {
        String old;
        String nouveau;

        public Modif(String s1, String s2) {
            old = s1;
            nouveau = s2;
        }

        public String toString() {
            return old + "-->" + nouveau;
        }
    }

    List<Modif> modifs = new LinkedList<>();

    public void notify(String old, String nouveau) {
        modifs.add(new Modif(old, nouveau));
    }

    public String toString() {
        String s = "";
        for (Modif m : modifs) {
            s += m.toString() + "\n";
        }
        return s;
    }
}


/* Correction Exo 2
import java.util.LinkedList;
import java.util.List;

public class ChangePseudoHistory<T> {

    private class Modif {
        T old;
        T nouveau;

        public Modif(T s1, T s2) {
            old = s1;
            nouveau = s2;
        }

        public String toString() {
            return old + "-->" + nouveau;
        }
    }

    List<Modif<T>> modifs = new LinkedList<>();

    public void notify(T old, T nouveau) {
        modifs.add(new Modif(old, nouveau));
    }

    public String toString() {
        String s = "";
        for (Modif m : modifs) {
            s += m.toString() + "\n";
        }
        return s;
    }
}
*/

/*Correction Exo 3
import java.util.LinkedList;
import java.util.List;

public class ChangePseudoHistory<T> implements Observable{

    private class Modif {
        T old;
        T nouveau;

        public Modif(T s1, T s2) {
            old = s1;
            nouveau = s2;
        }

        public String toString() {
            return old + "-->" + nouveau;
        }
    }

    List<Modif<T>> modifs = new LinkedList<>();

    public void notify(T old, T nouveau) {
        modifs.add(new Modif(old, nouveau));
    }

    public String toString() {
        String s = "";
        for (Modif m : modifs) {
            s += m.toString() + "\n";
        }
        return s;
    }

    public void update(Observable à, Object arg) {
        Pseudo<T> o.cast = (Pseudo<T>)o;
        T.arg.cast = (T)arg;
        notify(arg.cast, o.getContent());
    }
}
*/
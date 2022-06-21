import java.util.LinkedList;
import java.util.List;

public abstract class MonObservable {
    List<MonObservable> observateur = new LinkedList<>();
    boolean hasChanged = false;
    void setChanged() { hasChanged = true;}
    boolean hasChanged() { return hasChanged;}
    void clearChanged() { hasChanged = false;}
    void addObserver(MonObserver o) { observateur.add(o);}
    void notifyObserver(Object param) {
        for (MonObservateur o : observateur) o.update(this, param);
        clearChanged();
    }
}

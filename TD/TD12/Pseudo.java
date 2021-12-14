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

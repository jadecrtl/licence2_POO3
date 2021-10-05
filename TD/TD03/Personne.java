public class Personne {
    private String name ;
    private int argent=1;
    
    public Personne ( String name ) {
        this.name = name ;
    }
    
    public int getArgent() {
        return argent;
    }

    public void setArgent(int n) {
        this.argent = n;
    }

    public String toString ( ) {
        return " Je m’appelle " + this.name + "." ;
    }    

    public void recevoirArgent(int i) {
        this.argent += i;
    }

    public boolean donnerArgent(int i) {
        if (argent - i >= 0) {
            argent -= i;
            return true;
        }
        return false;
    }

}

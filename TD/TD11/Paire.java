public class Paire<K, V> implements AUneClef<K>{

    private K clef;
    private V valeur;

    public Paire(K clef, V valeur) {
        this.clef = clef;
        this.valeur = valeur;
    }

    public K getClef() {
        return this.clef;
    }

    public V getValeur() {
        return this.valeur;
    }

    public String toString() {//Le compilateur ne comprend pas les types K et V
        return clef + "->" + valeur;//Donc à l'exécution du programme ce sera la methode 
    }//toString de la classe object

    public Paire<V, K> renverse (K clef, V valeur) {
        return new Paire<V, K>(valeur, clef);
    }

}

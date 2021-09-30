import java.util.Random;
public class plateau {
    int hauteur;
    int largeur;
    int nbMines;
    int nbDrapeaux;
    private boolean[][] mines; // ou son placé les mines
    private int[][] etats; //0 = caché sans drapeau, 1 = cachée avec drapeau et 2 = révélée.
    private int[][] adja; // nombre de mines adjacentes à chaque case

    public plateau(int ha, int la, int mi){

        this.hauteur = ha;
        this.largeur = la;
        this.nbMines = mi;

        this.mines = new int[(ha+2)*(la+2)];
        this.etats = new int[(ha+2)*(la+2)];
        this.adja = new int[(ha+2)*(la+2)];

    }
    public boolean [][] getMines(){
        return this.mines;
    }
    public int[][] getEtats(){
        return this.etats;
    }
    public int [][] getAdja(){
        return this.adja;
    }

    private void ajouteMinesAlea(){

        Random rd = new Random();
        for(int i=0; i<mines.length; i++){
           
            int line = rd.nextInt(nbMines);
            int colonne = rd.nextInt(nbMines); 

            if(!(mines[line][colonne])){

                mines[line][colonne] = true;
            }
            nbMines--;
        }
    }
    private boolean coordonneesLegales(int i, int j) {
        return (i >= 0 && i < this.hauteur
            && j >= 0 && j < this.largeur);
    }

    private void calculeAdjacence(){

        int autour=0;

        for(int i=0; i<hauteur;i++){
            for(int j=0; j<largeur; j++){

                for(int k=1; k<mines.length; k++) {
                    for(int l=1; l<mines.length; l++) {
                        if (coordonneesLegales(k, l) &&
                        this.mines[k][l]) {
                        autour++;
                    }
                    }
                }

            }
        }        
    }
}

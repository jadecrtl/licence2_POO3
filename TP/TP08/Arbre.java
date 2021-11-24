import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

/*
Aide : Consulter la javadoc de la classe File pour plus d’informations. On se
servira notamment des méthodes exists(), getName(), length(), isDirectory()
et listFiles().
*/


public class Arbre {

    public Arbre(String cheminRacine) {
        
    }

    private class Noeud{
        String nom;
        int taille;
        boolean repertoire;
        ArrayList<Noeud> fils;
        Noeud racine;

        public Noeud(File file)throws Exception{
            try {
                this.nom = file.getName(); 
                this.taille = (int)file.length();
                this.repertoire = file.isDirectory();
                if (this.repertoire) {
                    this.fils = new ArrayList<Noeud>();
                    for (File f : file.listFiles()) {
                        this.fils.add(new Noeud(f));
                    }
                }
                else {
                    this.fils = null;
                }
            }
            catch(IOException e) {
                System.out.print("Pas de fichier");
            }
        }
    }




}
import java.util.ArrayList;
import java.util.LinkedList;

public class Mediatheque {
	private LinkedList<Media> baseDeDonnees;
	
	public Mediatheque() {
		this.baseDeDonnees = new LinkedList<Media>();
	}
	
	public void ajouter(Media doc) {
		if(this.baseDeDonnees.size() == 0) {
			this.baseDeDonnees.add(doc);
		} else {
			for(Media e: this.baseDeDonnees) {
				if(!e.plusPetit(doc)) {
					this.baseDeDonnees.add(this.baseDeDonnees.indexOf(e), doc);
					return;
				}
			}
			this.baseDeDonnees.add(doc);
		}
	}
	
	public void tousLesDictionnaires() {
		for(Media e: this.baseDeDonnees) {
			if(e instanceof Dictionnaire) {
				System.out.println(e);
			}
		}
	}
	
	public ArrayList<Media> recherche(Predicat p){
		ArrayList<Media> m = new ArrayList<Media>();
		for(Media e: this.baseDeDonnees) {
			if(p.estVrai(e)) {
				m.add(e);
			}
		}
		return m;
	}
	
	public static void main(String[] args) {
		Predicat p1 = new EstUnLivre();
		Predicat p2 = new TitreCommencePar('s');
		Et et = new Et(p1,p2);
		Dictionnaire d0 = new Dictionnaire("Le Petit Robert","Français",6);
		DictionnaireBilingue d = new DictionnaireBilingue("Larousse","Français",5,"Espagnol");
		Dictionnaire d2 = new DictionnaireBilingue("Larousse","Français",7,"Italien");
		Manga m2 = new Manga("Dragon ball", "Akira",70,"Shonen");
		Manga m = new Manga("One piece", "Oda",60,"Shonen");
		Manga m3 = new Manga("Sailor moon", "Naoko Takeuchi",30,"Fantastique");
		BandeDessinee b = new BandeDessinee("Astérix","René Goscinny",30,"Aventure");
		BandeDessinee b2 = new BandeDessinee("Superman","Jerry Siegel",30,"Super-héros");
		Mediatheque med = new Mediatheque();
		med.ajouter(d0);
		med.ajouter(m3);
		med.ajouter(b);
		med.ajouter(m2);
		med.ajouter(m);
		med.ajouter(b2);
		med.ajouter(d2);
		med.ajouter(d);
		for(Media e: med.baseDeDonnees) {
			System.out.println(e);
		}
		System.out.println("===============");
		med.tousLesDictionnaires();
		System.out.println("===============");
		for(Media f: med.recherche(et)) {
			System.out.println(f);
		}
	}

}

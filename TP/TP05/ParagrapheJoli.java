public class ParagrapheJoli extends Paragraphe{
	int taille;
	
	public ParagrapheJoli(int taille) {
        super();
        Espace e=new Espace();
        paragraphe.add(e);//tabulation 
		this.taille = taille;
	}
	
	public boolean isEmpty() {
		boolean vide= false;
		if(paragraphe!=null) {
			for(int i = 0 ; i < paragraphe.size(); i++){ 
				if(paragraphe.get(i)==null) vide=true;
			}
		}else {
			vide=true;
		}
		return vide;
	}
	
	public void addChaine(ChaineCar c) {
		if(!isEmpty()) {
            int tmp =paragraphe.get(0).len(); //tmp prend la taille du premier mot
            for(int i=0;i<paragraphe.size();i++){//on parcours le tableau 
			if(tmp<this.taille){//pour avoir la concaténation de la taille des mot
				tmp =tmp+paragraphe.get(i).len();
			}
            }
                if((tmp+c.len())<=this.taille){//comparer pour voir si on ajoute le mot ca va depasser la raille max
                    paragraphe.addLast(c); //ajouter à la suite de la ligne 
                }else{ // si oui
					//Mot l=new Mot("\n");// on revient a la ligne
					//paragraphe.add(l);// donc on l'ajoute en tant que mot(fils de ChaineCar)
					paragraphe.addLast(c);// puis on ajoute c
					//Je sais pas si cst bon mais jai pensé a sa 
				}
            
		}else {
			paragraphe.add(c);
		}
	}
	
	public void addChaine2(ChaineCar c) {
		int tmp=paragraphe.get(0).len();
		if(!isEmpty()) {//Si la chaine de caractere n'est pas vide
		for(int i=1;i<paragraphe.size()-1;i++) { //alors on parcours la List
			if((tmp+c.len())<=this.taille) {//Si la concaténation+le mot qui suit est plus petit que la taille 
				paragraphe.addLast(c); //alors on ajoute le mot
				tmp=tmp+paragraphe.get(i).len();// et on concatene
			}else {
				Mot l=new Mot("\n");//sinon on retourne a la ligne
				paragraphe.add(l);
				paragraphe.addLast(c);//puis on ajoute le mot
				tmp=c.len();// et on initalise tmp a la valeur du mot ajouté
			}	
		}
		}else {
			paragraphe.add(c);// si la liste est vide on ajoute le mot
		}
	}
	
	public String toString() {
		String l="";
		for(int i=0;i<paragraphe.size();i++) {
			l=l+paragraphe.get(i).toString();
		}
		return l;
	}
	

}

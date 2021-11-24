package main;

public class Personne {
	private String nom;
	private String prenom;
	private int monnaie;
	public int age;
	private Compte[] comptes;
	
	public Personne(String nom, String prenom, int age, int monnaie, int comptes) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.monnaie = monnaie;
		this.comptes = new Compte[comptes];
		for(int i=0;i<this.comptes.length;i++)
		{
			this.comptes[i] = new Compte(this, 0);
		}
	}
	
	public boolean retrait(int val)
	{
		if(comptes == null || comptes.length == 0)
			return false;
		int somme = 0;
		for(Compte c : comptes)
		{
			somme += c.getSolde();
		}
		if(somme < val)
			return false;
		somme = 0;
		for(Compte c : comptes)
		{
			if(somme + c.getSolde() >= val)
			{
				c.debite(val - somme);
				break;
			}
			somme += c.getSolde();
			c.debite(c.getSolde());
		}
		return true;
	}
	
	public void setPrenom(String p) {
		this.prenom = p;
	}
	
	public int getMonnaie()
	{
		return monnaie;
	}
	
	public static boolean donne(Personne p1, Personne p2, int montant)
	{
		if(p1 == null || p2 == null || p1.monnaie < montant)
			return false;
		p2.monnaie += montant;
		p1.monnaie -= montant;
		return true;
	}
	
	public boolean donne(Personne p, int montant)
	{
		return donne(this, p, montant);
	}
	
	public void anniversaire() {
		this.age ++;
	}
	
	public String toString() {
		return "Je m’appelle : " + this.prenom
		+ " " + this.nom + ". J’ai " + this.age + " ans.";
	}
	
}

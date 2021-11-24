package main;

public class Compte
{
	private static int nbComptes = 0;
	private int numero;
	private int solde;
	private Personne personne;
	
	public Compte(Personne personne, int solde)
	{
		this.personne = personne;
		this.solde = solde;
		this.numero = nbComptes++;
	}
	
	public int getSolde()
	{
		return solde;
	}
	
	public void credite(int solde)
	{
		if(solde < 0)
			return;
		this.solde += solde;
	}
	
	public boolean debite(int argent)
	{
		if(argent < 0)
			return false;
		if(solde - argent < 0)
			return false;
		solde -= argent;
		return true;
	}
	
}

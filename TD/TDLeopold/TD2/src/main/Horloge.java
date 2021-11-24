package main;

public class Horloge
{
	private CompteurCyclique heures, minutes;
	
	public Horloge()
	{
		heures = new CompteurCyclique(23);
		minutes = new CompteurCyclique(59);
	}
	
	public Horloge(CompteurCyclique heures, CompteurCyclique minutes)
	{
		this.heures = heures;
		this.minutes = minutes;
	}
	
	public void setHeure(int h, int m)
	{
		heures.setVal(h);
		minutes.setVal(m);
	}
	
	public void setHeure(int h)
	{
		heures.setVal(h);
	}
	
	public void ticTac()
	{
		if(minutes.incrementer())
			heures.incrementer();
	}
	
	public String toString()
	{
		return "Il est "+heures+":"+minutes;
	}
	
}

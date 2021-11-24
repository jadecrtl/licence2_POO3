import java.util.LinkedList;

public class Condottiere extends Personne
{
	private LinkedList<Archer> archers;
	private LinkedList<Fantassin> fantassins;
	
	public Condottiere(String name, int argent, int pdv, LinkedList<Archer> archers,
			LinkedList<Fantassin> fantassins)
	{
		super(name, argent, pdv);
		this.archers = archers;
		this.fantassins = fantassins;
	}

	public void attaque(Village v)
	{
		if(v == null || v.roturiers == null || v.roturiers.size() == 0)
			return;
		int argent = 0;
		for(Roturier r : v.roturiers)
		{
			argent += r.argent/2;
			r.donnerArgent(-r.argent/2);
		}
		int total = archers.size()+fantassins.size();
		this.donnerArgent(argent/2);
		argent -= argent/2;
		int argentParPers = argent/total;
		for(Archer arch : archers)
		{
			arch.donnerArgent(argentParPers);
		}
		for(Fantassin fanta : fantassins)
		{
			fanta.donnerArgent(argentParPers);
		}
	}
	
}


public class Chevalier extends Noble
{
	private static final int prixLiberte=50;
	protected Personne geolier;
	
	public Chevalier(String name, int argent, int pdv)
	{
		super(name, argent, pdv);
	}

	@Override
	public void attaque(Personne p)
	{
		if(p == null || geolier != null)
			return;
		if(p instanceof Chevalier)
		{
			((Chevalier) p).geolier = this;
		}
	}
	
	public boolean acheteLiberte()
	{
		if(geolier == null)
			return false;
		if(argent >= prixLiberte)
		{
			geolier.donnerArgent(prixLiberte);
			geolier = null;
			return true;
		}
		return false;
	}
	
}

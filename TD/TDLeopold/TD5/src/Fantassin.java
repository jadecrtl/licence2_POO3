
public class Fantassin extends Roturier
{
	protected int degats;
	
	public Fantassin(String name, int argent, int pdv, int degats)
	{
		super(name, argent, pdv);
		this.degats = degats;
	}

	@Override
	public void attaque(Personne p)
	{
		if(p == null)
			return;
		if(p instanceof Chevalier)
		{
			((Chevalier)p).geolier = this;
		}
		else
			p.blessure(degats);
	}
	
}

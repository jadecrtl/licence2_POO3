
public class Archer extends Roturier
{

	public Archer(String name, int argent, int pdv)
	{
		super(name, argent, pdv);
	}

	@Override
	public void attaque(Personne p)
	{
		p.blessure(p.pdv);
	}
	
}

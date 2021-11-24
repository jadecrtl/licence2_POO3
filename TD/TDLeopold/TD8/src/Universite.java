import java.util.Random;

public class Universite
{
	private int nbEtu;
	private int capALL;
	private int capSHS;
	private int capSTS;
	
	public Universite(int nbEtu, int capALL, int capSHS, int capSTS)
	{
		this.nbEtu = nbEtu;
		this.capALL = capALL;
		this.capSHS = capSHS;
		this.capSTS = capSTS;
		if(nbEtu < 0 || capALL < 0 || capSHS < 0 || capSTS < 0)
			throw new IllegalArgumentException();
		if(nbEtu > capALL + capSHS + capSTS)
			throw new IllegalArgumentException();
	}
	
	public void restructuration(int capALL, int capSHS, int capSTS) throws DirectiveMinisterielleException
	{
		int total = capALL+capSHS+capSTS;
		if(total < nbEtu)
			throw new TropPeuDeCapaciteException((nbEtu-total));
		if(capALL > capSHS+capSTS)
			throw new DirectiveMinisterielleException("capALL trop élevé !");
		else if(capSHS > capALL+capSTS)
			throw new DirectiveMinisterielleException("capSHS trop élevé !");
		else if(capSTS > capALL+capSHS)
			throw new DirectiveMinisterielleException("capSTS trop élevé !");
	}
	
	public void restrictionBudgetaire() throws DirectiveMinisterielleException
	{
		Random rd = new Random();
		int nCapALL = capALL - rd.nextInt((int) (0.5 * capALL));
		int nCapSHS = capALL - rd.nextInt((int) (0.5 * capSHS));
		int nCapSTS = capALL - rd.nextInt((int) (0.5 * capSTS));
		try {
			this.restructuration(nCapALL, nCapSHS, nCapSTS);
		}
		catch(TropPeuDeCapaciteException e) {
			nbEtu -= e.surplus();
			System.out.println("Il y a "+e.surplus()+" étudiants de trop !");
		}
		catch(DirectiveMinisterielleException e) {
			nCapALL = capALL - rd.nextInt((int) (0.5 * capALL));
			nCapSHS = capALL - rd.nextInt((int) (0.5 * capSHS));
			nCapSTS = capALL - rd.nextInt((int) (0.5 * capSTS));
		}
		finally {
			this.restructuration(capALL, nCapSHS, nCapSTS);
		}
	}
	
	public void reduction(int nb)
	{
		nbEtu -= nb;
	}
	
	public static class TropPeuDeCapaciteException extends RuntimeException
	{
		private static final long serialVersionUID = 1L;

		private int surplus;
		
		public TropPeuDeCapaciteException(int surplus)
		{
			super();
			this.surplus = surplus;
		}
		
		public int surplus()
		{
			return surplus;
		}
		
	}
	
	public static class DirectiveMinisterielleException extends Exception
	{
		private static final long serialVersionUID = 1L;
		
		public DirectiveMinisterielleException(String string) {
			super(string);
		}
	
	}

	
}

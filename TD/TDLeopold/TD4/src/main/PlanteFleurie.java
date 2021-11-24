package main;

public class PlanteFleurie extends Plante
{
	private static int nbPlanteSansEngrais;
	private boolean engrais=false;
	
	public PlanteFleurie()
	{
		super();
		nbPlanteSansEngrais++;
	}
	
	public int Etat()
	{
		return PlanteSoif;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" "+nbPlanteSansEngrais;
	}
	
}

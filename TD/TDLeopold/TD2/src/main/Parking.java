package main;

public class Parking
{
	private int nbPlaces;
	private int nbPlacesLibres;
	private String[] emplacements;
	float pourcentageRemplissage;
	
	public Parking(int nbPlaces)
	{
		this.nbPlaces = nbPlaces;
		this.nbPlacesLibres = nbPlaces;
		emplacements = new String[nbPlaces];
		String letter = "A";
		for(int i=0;i<nbPlaces;i++)
		{
			if(i%10 == 0 && i != 0)
				letter = (char)(letter.charAt(0)+1)+"";
			emplacements[i] = letter+(i%10);
		}
	}
	
	public void dispPlaces()
	{
		for(String str : emplacements)
			System.out.println(str);
	}
	
}

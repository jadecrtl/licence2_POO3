package main;

public class Main
{

	public static void main(String[] args)
	{
		Horloge h = new Horloge();
		for(int i=0;i<=60;i++)
		{
			System.out.println(h);
			h.ticTac();
		}
		
		Parking parking = new Parking(200);
		parking.dispPlaces();
		
	}

}

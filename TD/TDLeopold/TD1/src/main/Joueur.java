package main;

import java.util.ArrayList;
import java.util.List;

public class Joueur 
{
	private List<Jeton> sac;
	private int score;
	
	public Joueur()
	{
		this.score = 0;
		sac = new ArrayList<Jeton>();
	}
	
}

package main;

import java.util.ArrayList;
import java.util.List;

public class Jeu
{
	private Plateau plateau;
	private List<Jeton> sac;
	private Joueur[] joueurs;
	
	public Jeu()
	{
		plateau = new Plateau();
		sac = new ArrayList<Jeton>();
		joueurs = new Joueur[2];
	}
	
}
 
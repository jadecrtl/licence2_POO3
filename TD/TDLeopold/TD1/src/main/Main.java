package main;

public class Main
{

	public static void main(String[] args)
	{
		/*
	
		Exo 1:
		
		1) Je m'appelle Tony Parker. J'ai 29 ans.
		Je m'appelle Mickael Parker. J'ai 29 ans.
		
		2) Non. mickael.setNom("Gekabale");
			Non.
		   
		3) Oui
		
		Exo 2 :
		
		3) La methode non static.
		
		Exo 3 :
		
		1) Egal
		Egal
		Egal
		Egal
		Egal
		Different
		Different
		attribut:2
		attribut:2
		
		Exercice 4:
		1) Non car c'est un type primitif
		2) int[] tab = {};
		4) A[] tab2 = new A[10];
		ça affiche null 10 fois;
		On obtient une erreur Null exception.
		
		Exercice 5 :
		
		a = 3;
		Pour b il manque un constructeur pour Exo1 et un setter pour changer b.
		"c" est final, donc non modifiable.
	
	*/
		Personne p1 = new Personne("Test", "unTest", 25, 20);
		Personne p2 = new Personne("Test2", "unTest2", 35, 40);
		
		System.out.println(p1.getMonnaie()+" "+p2.getMonnaie());
		System.out.println(p1.donne(p2, 15));
		System.out.println(p1.getMonnaie()+" "+p2.getMonnaie());
		System.out.println(Personne.donne(p2, p1, 30));
		System.out.println(p1.getMonnaie()+" "+p2.getMonnaie());
		
		int[] tab = {};
		
		A[] tab2 = new A[10];
		
		
	}

}

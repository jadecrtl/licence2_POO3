package main;

public class Exercice1
{
	/*
	 * Quand on fait b.f(c)
	 * 
	 * Pour l'objet sur lequel on appel la fonction , on regarde uniquement,
	 * le type dynamique. Par contre pour le parametre a, on regarde uniquement,
	 * le type declaré.
	 * 
	 * Exercice 2 :
	 * 
	 * a.g() -> A.f(a)
	 * b.g() -> B.f(a)
	 * c.g() -> B.f(a)
	 * 
	 * a.f(a) -> A.f(a)
	 * a.f(b) -> A.f(a)
	 * a.f(c) -> A.f(a)
	 * b.f(a) -> B.f(a)
	 * b.f(b) -> B.f(b)
	 * b.f(c) -> B.f(a)
	 * c.f(a) -> B.f(a)
	 * c.f(b) -> B.f(a)
	 * c.f(c) -> B.f(a)
	 * 
	 * 2)
	 * 
	 * a.g() -> A.f(a)
	 * b.g() -> B.f(a)
	 * c.g() -> B.f(a)
	 * 
	 * a.f(a) -> A.f(a)
	 * a.f(b) -> A.f(b)
	 * a.f(c) -> A.f(a) /
	 * b.f(a) -> B.f(a)
	 * b.f(b) -> B.f(b)
	 * b.f(c) -> B.f(a)
	 * c.f(a) -> B.f(a)
	 * c.f(b) -> B.f(b)
	 * c.f(c) -> B.f(a) /
	 * 
	 */
	
	public static void main(String[] args)
	{
		
	}
	
}

package main;

public class Plateau
{
	Case[][] cases;
	
	public Plateau()
	{
		this.cases = new Case[15][15];
		for(int i=0;i<cases.length;i++)
			for(int j=0;j<cases[i].length;i++)
				cases[i][j] = new Case(j%5);
	}
	
}

package main;

public class CompteurCyclique
{
	private final int max;
	private int val;

	public CompteurCyclique(int max)
	{
		this(0, max);
	}
	
	public CompteurCyclique(int val, int max)
	{
		this.val = val;
		this.max = max;
	}
	
	public void reinitialiser()
	{
		val = 0;
	}
	
	public boolean incrementer()
	{
		if(val == max)
		{
			reinitialiser();
			return true;
		}
		else
		{
			val++;
			return false;
		}
	}
	
	public String toString()
	{
		String str = String.format("%0"+(""+max).length()+"d", val);
		return str;
	}
	
	public boolean setVal(int val)
	{
		if(val > max)
			return false;
		this.val = val;
		return true;
	}
	
	public int getVal()
	{
		return val;
	}
}

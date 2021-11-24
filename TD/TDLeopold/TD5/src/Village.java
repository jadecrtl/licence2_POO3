import java.util.LinkedList;

public class Village 
{
	protected LinkedList<Roturier> roturiers;
	
	public Village(LinkedList<Roturier> roturiers)
	{
		this.roturiers = roturiers;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == null)
			return false;
		if(!(o instanceof Village))
			return false;
		Village v = (Village)o;
		if(roturiers.size() != v.roturiers.size())
			return false;
		for(int i=0;i<roturiers.size();i++)
		{
			if(!roturiers.get(i).equals(v.roturiers.get(i)))
				return false;
		}
		return true;
	}
	
    @Override
    public Village clone() throws CloneNotSupportedException
    {
    	LinkedList<Roturier> list = new LinkedList<Roturier>();
    	for(Roturier r : roturiers)
    		list.add(r.clone());
    	
    	return new Village(list);
    }
	
}

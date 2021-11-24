public class Roturier extends Personne implements Cloneable
{

    public Roturier (String name, int argent, int pdv) {
        super(name, argent, pdv);
    }

    public String toString() {
        return super.toString()+" Je suis un roturier.";
    }
    
	@Override
	public boolean equals(Object o)
	{
		if(o == null)
			return false;
		if(!(o instanceof Roturier))
			return false;
		Roturier r = (Roturier)o;
		return r.name.equals(name) && r.argent == argent &&
			   r.pdv == pdv;
	}
    
    @Override
    public Roturier clone() throws CloneNotSupportedException
    {
    	return (Roturier)super.clone();
    }
    
}

public class Personne {
    protected String name ;
    protected int argent=1;
    protected int pdv;
    
    public Personne (String name, int argent, int pdv) {
        this.name = name;
        this.argent = argent;
        this.pdv = pdv;
    }
    
    public void blessure(int n)
    {
    	this.pdv -= n;
    	if(this.pdv <= 0)
    	{
    		this.pdv = 0;
    		System.out.println(name+" est mort !");
    	}
    }
    
   public void attaque(Personne p)
   {
	   p.blessure(0);
   }
    
    public int getArgent() {
        return argent;
    }
    
    public void setArgent(int n) {
        this.argent = n;
    }

    public String toString ( ) {
        return " Je m’appelle " + this.name + "." ;
    }    

    public void recevoirArgent(int i) {
        this.argent += i;
    }

    public boolean donnerArgent(int i) {
        if (argent - i >= 0) {
            argent -= i;
            return true;
        }
        return false;
    }

}

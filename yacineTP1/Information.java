
public class Information {
	
	private int vitalite;
	private int force;
	private int agilite;
	
	public Information(int v, int f, int a) {
		this.vitalite=v;
		this.force=f;
		this.agilite=a;
	}
	
	public Information(Information inf) {
		this.vitalite = inf.vitalite;
		this.force = inf.force;
		this.agilite = inf.agilite;
	}
	
	public int getVitalite() {
		return this.vitalite;
	}
	
	void setVitalite(int n) {
		this.vitalite = n;
	}
	
	public int getForce() {
		return this.force;
	}
	
	void setForce(int n) {
		this.force = n;
	}
	
	public int getAgilite() {
		return this.agilite;
	}
	
	void setAgilite(int n) {
		this.agilite = n;
	}
	
	public String toString() {
		return "Vitalite : "+this.vitalite+", Force : "+this.force+", Agilite : "+this.agilite;
	}
}

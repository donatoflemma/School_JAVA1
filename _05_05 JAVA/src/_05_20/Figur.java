package _05_20;

public abstract class Figur  {
	protected Punkt mittelpunkt;
	
	public Punkt getMittelpunkt() {
		return mittelpunkt;
	}
	public void setMittelpunkt(Punkt mittelpunkt) {
		this.mittelpunkt = mittelpunkt;
	}
	public Figur(Punkt mittelpunkt) {
		super();
		this.mittelpunkt = mittelpunkt;
	}
	@Override
	public abstract String toString();
	
	
}

package _06_17;

class NennerIstZeroException extends Exception{
	private int nenner;
	public NennerIstZeroException(int nenner, String message) {
		super(message);
		this.nenner = nenner;
	}
	@Override
	public String getMessage() {
		
		return super.getMessage() + " : " + nenner + " !";
	}
}
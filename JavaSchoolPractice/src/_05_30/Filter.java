package _05_30;

public abstract class Filter implements SampleProvide {
	
	protected SampleProvide sp;
	
	public Filter(SampleProvide sp) {
		this.sp = sp;
	}

}

class AvgFilter extends Filter{
	
	
	public AvgFilter(SampleProvide sp) {
		super(sp);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fetchSample(double[] messdaten) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sampleSize() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class MaxFilter extends Filter{

	public MaxFilter(SampleProvide sp) {
		super(sp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fetchSample(double[] messdaten) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sampleSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
package _05_30;

public class TemperaturSensor  implements SampleProvide{

	@Override
	public String getType() {
		
		return "Temperatur";
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

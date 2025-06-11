package _05_30;

import Prog1Tools.IOTools;

public class DruckSensor implements SampleProvide{

	@Override
	public String getType() {
	
		return "Druck";
	}

	@Override
	public void fetchSample(double[] messdaten) {
		for (int i = 0; i < messdaten.length; i++) {
			messdaten[i] = IOTools.readDouble("Messwert: "); // Eigentlich aus einem Sensor
		}
		
	}

	@Override
	public int sampleSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}

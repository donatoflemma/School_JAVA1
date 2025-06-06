package _05_30;

public class Cs {
	public static void main(String[] args) {
		SampleProvide x = new DruckSensor();
		AvgFilter avgf = new AvgFilter(x);
	}

}

package _05_30;

import java.util.Arrays;

public class Client {
	
	public static void m(int i) {
		i = 100;
	}
	
	public static void f(int[] ia) {
		ia[0] = 100;
	}
	public static void main(String[] args) {
		int x = 50;
		int[] a = {50,20,30};
		
		System.out.println("x = " + x); // x =  50
		System.out.println(Arrays.toString(a)); //[50,20,30]
		
		m(x);
		f(a);
		System.out.println("x = " + x);// x = 50
		System.out.println(Arrays.toString(a)); //
		
//		SampleProvide ds = new DruckSensor();
//		String s = ds.getType();
//		
//		int ss = ds.sampleSize();
//		
//		double [] md = new double[5];// [0.0, 0.0, 0.0, 0.0, 0.0]
//		System.out.println(Arrays.toString(md));
//		
//	    ds.fetchSample(md);
//		
//		System.out.println("s = " + s);
//		System.out.println("Sample size = " + ss);
//		
//		System.out.println(Arrays.toString(md));
	}

}

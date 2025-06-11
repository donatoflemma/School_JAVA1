package _05_12;

import Prog1Tools.IOTools;

public class Input {
	static double readWeightFromConsole(String s) {
		double weight = IOTools.readDouble(s);
		while(weight <= 0) {
			weight = IOTools.readDouble(s);
		}
		return weight;
		
	}

	static int readHeightFromConsole(String s) {
		int height = IOTools.readInt(s);
		while(height <= 0)
			height = IOTools.readInt(s);
		return height;
	}
}

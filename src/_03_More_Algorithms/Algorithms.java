package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		return null;
	}

	public static int findBrokenEgg(List<String> eggs) {

		int index = 0;
		for (int i = 0; i < eggs.size(); i++) {
			String e = eggs.get(i); // e = what it says at each index
			if (e == "cracked") {
				index = eggs.indexOf(e);
				return index;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;

		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				count++;
			}
		}
		return count;

	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;

		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				double t = peeps.get(i);
				tallest = t;
			}
		}
		return tallest;
	}

	public static int findLongestWord(List<String> words) {
		String e = "Hi";
		for (int i = 0; i < words.size(); i++) {

		}

		return 0;
	}

	public static boolean containsSOS(List<String> message1) {

		for (int i = 0; i < message1.size(); i++) {
			if (message1.contains("... --- ...")) {
				return true;
			}

		}
		return false;
	}

	public static double sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.size() - 1; j++) {
				if (results.get(j) > results.get(j + 1)) {
					double t = results.get(j);
					results.get(j).equals(results.get(j+1));
					results.get(j+1).equals(t);
							
 				}
			}
		}

		return 0;
	}

}

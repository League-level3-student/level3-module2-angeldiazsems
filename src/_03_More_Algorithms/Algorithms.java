package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {

		int product = num1 * num2;
		String result = num1 + " x " + num2 + " = " + product;

		return result;

	}

	public static boolean isPrime(int num1) {
		for (int i = 2; i < num1; i++) {
			if ((num1 % i) == 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean isSquare(int num1) {

		double square = Math.sqrt(num1);
		if ((square * 10) % 10 == 0) {
			return true;
		}
		return false;

	}

	public static boolean isCube(int num1) {

		double cube = Math.cbrt(num1);
		if ((cube * 30) % 30 == 0) {
			return true;
		}

		return false;

	}

	public static int findBrokenEgg(List<String> eggs) {

		int index = 0;
		for (int i = 0; i < eggs.size(); i++) {
			String currentValue = eggs.get(i);
			if (currentValue == "cracked") {
				index = eggs.indexOf(currentValue);

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

	public static String findLongestWord(List<String> words) {
		String longest = "long";
		String e = "Hi";
		int length = e.length();
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > length) {
				length = words.get(i).length();
				longest = words.get(i);
			}
		}

		return longest;
	}

	public static boolean containsSOS(List<String> message1) {

		for (int i = 0; i < message1.size(); i++) {
			if (message1.contains("... --- ...")) {
				return true;
			}

		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.size() - 1; j++) {
				double currentScore = results.get(j);
				double nextScore = results.get(j+1);
				if(currentScore > nextScore) {
					results.set(j, nextScore);
					results.set(j + 1, currentScore);
				}
				
			}
		}

		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {

		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size() - 1; j++) {
				int currentLength = unsortedSequences.get(j).length();
				int aheadLength = unsortedSequences.get(j + 1).length();
				if (currentLength > aheadLength) {
					String currentString = unsortedSequences.get(j);
					String aheadString = unsortedSequences.get(j + 1);
					unsortedSequences.set(j, aheadString);
					unsortedSequences.set(j + 1, currentString);

				}
			}
		}

		return unsortedSequences;

	}

	public static List<String> sortWords(List<String> words) {

		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size() - 1; j++) {
				String currentWord = words.get(j);
				String nextWord = words.get(j + 1);
				if (currentWord.compareTo(nextWord) > 0) {
					words.set(j, nextWord);
					words.set(j + 1, currentWord);
				}
			}
		}

		return words;
	}

}

package com.pradeep.StringAlgorithmQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printDuplicateWords("Programming");
		printDuplicateWords("Combination");
		printDuplicateWords("Java");

	}

	private static void printDuplicateWords(String words) {
		
		System.out.println("Dupliactes in Words :"+words);

		char[] caharcters = words.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char ch : caharcters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		
		
		Set<Map.Entry<Character, Integer>> entrySet= charMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet) {
			if (entry.getValue()>1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}

	}

}

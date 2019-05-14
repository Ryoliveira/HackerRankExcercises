package JavaAnagrams;
import java.util.Scanner;

public class Solution {

	static boolean isAnagram(String a, String b) {
		java.util.Map<Character, Integer> mapA = getMap(a.toLowerCase());
		java.util.Map<Character, Integer> mapB = getMap(b.toLowerCase());
		return (mapA.equals(mapB)) ? true : false;
	}

	static java.util.Map<Character, Integer> getMap(String s) {
		java.util.Map<Character, Integer> map = new java.util.HashMap<Character, Integer>();
		for (Character c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		// HackerRank Code
//	        Scanner scan = new Scanner(System.in);
//	        String a = scan.next();
//	        String b = scan.next();
//	        scan.close();
		String a = "hello";
		String b = "eohll";
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}

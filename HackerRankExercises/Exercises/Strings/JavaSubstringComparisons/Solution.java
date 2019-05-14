package JavaSubstringComparisons;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for(int i=0;i<k;i++) {
            int start = 0 + i;
            while(start < s.length()) {
                if(start+k <= s.length()) {
                    String sub = s.substring(start, start+k);
                    if(sub.compareTo(smallest) < 0 || smallest == "") smallest = sub;
                    if(sub.compareTo(largest) > 0) largest = sub;
                }
                start = start+k;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
    	  //Hacker Rank code
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();
    	
    	String s = "welcometojava";
    	int k = 3;
        System.out.println(getSmallestAndLargest(s, k));
    }
}



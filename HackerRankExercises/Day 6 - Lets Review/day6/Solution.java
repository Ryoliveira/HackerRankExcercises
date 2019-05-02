import java.io.*;
import java.util.*;


//Day 6: Let's Review
public class Day6LetsReview {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i=0;i<n;i++){
            String odd = "";
            String even = "";
            String s = input.nextLine();
            for(int j=0;j<s.length();j++){
                if(j%2==0) even += s.charAt(j);
                else odd += s.charAt(j);
            }
            System.out.printf("%s %s\n", even, odd);
        }
        input.close();
	}

}

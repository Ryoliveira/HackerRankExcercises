import java.io.*;
import java.util.*;

//Java String Tokens
public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		if (s.length() > 400000 || s.length() == 0) {
			System.out.println(0);
			return;
		}
		String delims = "[ !,?.\\_'@]+";
		String[] tokens = s.split(delims);
		System.out.println(tokens.length);
		for (String token : tokens) {
			System.out.println(token);
		}
		scan.close();
	}

}

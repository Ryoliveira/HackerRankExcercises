import java.util.*;


public class Day3IntrotoConditionalStatements {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String res = ((N%2==0 && N>=2 && N<=5) || (N%2==0 && N>20)) ? "Not Weird" : "Weird";
        System.out.println(res);

        scanner.close();
    }

}

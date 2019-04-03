import java.util.*;


public class JavaStringReverse {
	
public static void main(String[] args) {
          //HackerRank Code            
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
	    String A = "madam";
        System.out.println((A.equals(new StringBuilder(A).reverse().toString())) ? "Yes" : "No");
        
    }

}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//Day 10: Binary Numbers
public class Day10BinaryNumbers {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int s = 0;
        int y = 0;
        while(n>0){
            int r = n%2;
            n = n/2;
            if(r == 1 ){
                s++;
                if(s > y) y = s;
            }else{
                s = 0;
            }  
        }
        System.out.println(y);
        

        scanner.close();
    }
    
    


}

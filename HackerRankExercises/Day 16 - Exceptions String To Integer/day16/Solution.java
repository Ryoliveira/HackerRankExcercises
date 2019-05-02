import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//Day 16: Exceptions - String to Integer
public class Day16ExceptionsStringToInteger {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        try{
	            int res = Integer.parseInt(S);
	            System.out.println(res);
	        }catch(NumberFormatException e){
	            System.out.print("Bad String");
	        }
	    }
}

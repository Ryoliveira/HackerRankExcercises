package JavaExceptionHandlingTryCatch;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        try{
            int a = input.nextInt();
            int b = input.nextInt();
            int res = a/b;
            System.out.println(res);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}



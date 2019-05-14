package JavaBigInteger;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Java BigInteger
public class JavaBigInteger {
	
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();

        BigInteger b1, b2;
        b1 = a.add(b);
        b2 = a.multiply(b);
        System.out.println(b1 + "\n" + b2);
    }

}

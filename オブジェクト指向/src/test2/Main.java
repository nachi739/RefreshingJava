package test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	 int n = s.length();
    	 String result = s.substring(2);
    	if( 1<= n || n <= s.length()) {
    		System.out.println(result);
    	}
    }
}
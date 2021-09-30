package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
        int M = scanner.nextInt();

        if ( 1 <= N || M <= 100) {
			if (M < N) {
				System.out.println( N % M);
			}

    }
}
}
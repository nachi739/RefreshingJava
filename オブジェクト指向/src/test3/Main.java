package test3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		if (1100<= N || N <= 5000) {
			if (1 <= M || M <= 200) {
				System.out.println(N * M);
			}
		}
	}
}

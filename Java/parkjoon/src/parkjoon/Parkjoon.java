package parkjoon;

import java.util.Scanner;

public class Parkjoon {

	public static void main(String[] args) {
	int A = 0;
	int B = 0;
	Scanner a = new Scanner(System.in);
	A = a.nextInt();
	B = a.nextInt();
	if(A >=1 && B <= 10000) {
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}
	}
	

}

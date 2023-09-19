package _230919;

import java.util.Scanner;

public class _07_Arrays {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i, j, m, su;
		
		System.out.print("출력 문자 수 입력 : ");
		su = scanner.nextInt();
		
		for(i = 1; i<=su; i++)
			System.out.printf("%d", i%10);
		System.out.println();
		for(i = su; i>=1; i--) {
			for(j=1; j<=i; j++)
				System.out.printf("%c",'*');
			System.out.println();
		}
	}
}

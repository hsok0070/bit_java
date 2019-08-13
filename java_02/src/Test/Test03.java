package Test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a, b를 입력하세요:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		if (a > b) {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
			System.out.println(sum);
		} else if (a < b) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
			System.out.println(sum);
		} else {
			sum = a;
			System.out.println("두 수의 값은 같습니다.");
		}

	}

}

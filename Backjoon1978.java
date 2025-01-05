package codingtest;

import java.util.Scanner;

// 소수 찾기 
public class Backjoon1978 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int a = sc.nextInt();
			result += isPrime(a);
		}
		
		System.out.println(result);
	}
	
	// 소수찾기 메서드 외워버리기 
	public static int isPrime(int n) {
		if(n <= 1) {
			return 0;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
	        if (n % i == 0) {
	            return 0; // 소수가 아님
	        }
	    }
	    return 1; // 소수임
	}
}

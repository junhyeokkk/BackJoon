package coding_test;

import java.util.Scanner;

public class Backjoon1085 {
	
	// 문제 핵심 
	// x - 0 || y - 0 || w - x || h - y ==> 이중에 가장 작은값 구하기 
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int w = sc.nextInt();
	        int h = sc.nextInt();
	        
	        // 네 가지 경우 중 최소값을 한 번에 찾기
	        System.out.println(Math.min(Math.min(x, y), Math.min(w - x, h - y)));
	        
	        sc.close();
	}
}

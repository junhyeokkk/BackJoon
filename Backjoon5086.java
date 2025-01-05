package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backjoon5086 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		List<String> result = new ArrayList();
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}
			
			if(b % a == 0) {
				result.add("factor");
			} else if(a % b == 0) {
				result.add("multiple");
			} else {
				result.add("neither");
			}
		}
		
		for(String s : result) {
			System.out.println(s);
		}
	}
}

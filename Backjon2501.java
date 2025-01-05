package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backjon2501 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		List<Integer> nums = new ArrayList<Integer>(); 
		for(int i=1; i<=a; i++) {
			if(a % i == 0) {
				nums.add(i);
			}
		}
		
		if(nums.size() < b) {
			System.out.println(0);
		} else {
			System.out.println(nums.get(b-1));
		}
	}

}

package codingtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// 약수 찾기 
public class Backjoon9506 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		List<String> results = new ArrayList<>();
		
		Map<Integer, String> res = new HashMap<Integer, String>();
		while(true) {
			
			int num = sc.nextInt();
			
			List<Integer> result = new ArrayList();
			int sum = 0;
			
			// -1이면 종료하기
			if(num == -1) {
				break;
			}
			
			for(int i= 1; i<= num / 2; i++) { // 약수는 해당수의 1/2에만 존재
				if(num % i == 0) {
					result.add(i);
					sum += i;
				}
			}

			if(sum == num) {
				StringBuilder resstr = new StringBuilder(num + " = "); // 가변 문자열 객체 생성
				for(int i=0; i<result.size(); i++) {
					resstr.append(result.get(i));
					if(i<result.size() -1) { // 마지막엔 + 붙이지 않기 
						resstr.append(" + ");
					}
				}
				results.add(resstr.toString());
			}
			else {
				results.add(num + " is NOT perfect.");
			}
		}
		
		for(String str : results) {
			System.out.println(str);
		}
		
	}
	
}

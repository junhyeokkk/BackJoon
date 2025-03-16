package coding_test;

import java.util.Scanner;

public class Backjoon11653 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close(); // 스캐너 리소스 해제 (최적화)

        // 1. 먼저 2로 나누기 (짝수 처리)
        while (num % 2 == 0) {
            System.out.println(2);
            num /= 2;
        }

        // 2️. 3부터 √num까지 홀수만 체크
        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                System.out.println(i);
                num /= i;
            }
        }

        // 3️. 남은 숫자가 1이 아니면 소수 (자기 자신 출력)
        if (num > 1) {
            System.out.println(num);
        }
    }
}


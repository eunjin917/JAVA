package practice;

//연습문제 - break,continue
//1~100사이의 정수 한개 n을 입력받고
//1부터 n까지의 소수를 출력하시오.
//소수 조건 : 1과 자신만 나누어 떨어지는 수
//입력 예)
//6
//출력 예)
//2
//3
//5
// 소수의 개수는 3개

import java.util.Scanner;

public class pr16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        for (int i=1; i<=n; i++) {
            for (int j=2; j<=i; j++) {
                if (i==j) {
                    System.out.println(i);
                    count++;
                }
                else if (i%j == 0)
                    break;
            }
        }
        System.out.println("소수의 개수는 "+count+"개");
    }
}

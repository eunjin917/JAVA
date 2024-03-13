package practice;

// 9번 문제 - 숫자 스무고개
// https://codinggangsa.notion.site/8ecf0e44f25e4639b60a5c1dbc9b1918

import java.util.Scanner;

public class pr22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = (int)(Math.random()*100) + 1;

        while (true) {
            System.out.println("번호를 입력하세요.");
            int input = scanner.nextInt();

            if (input > answer)
                System.out.println("번호가 정답보다 큽니다.");
            else if (input < answer)
                System.out.println("번호가 정답보다 작습니다.");
            else
                break;
        }
        System.out.println("정답입니다.");
    }
}

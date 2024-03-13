package practice;

// 4번 문제 - 컴퓨터와 함께 369게임하기
// https://codinggangsa.notion.site/8ecf0e44f25e4639b60a5c1dbc9b1918

import java.util.Scanner;

public class pr9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] answer = new String[40];

        for (int i=0; i<40; i++) {
            String str = String.valueOf(i+1);
            answer[i] = str.replaceAll("3|6|9", "X");
        }

        for (int i=0; i<40; i++) {
            if (i%2 == 0)
                System.out.println("컴퓨터 : "+answer[i]);
            else {
                System.out.print("나 : ");
                String input = scanner.nextLine();
                if (!input.equals(answer[i])) {
                    System.out.println("컴퓨터 승!");
                    break;
                }
            }

            if (i==39) {
                System.out.println("무승부!");
            }
        }
        System.out.println("게임종료");
    }
}

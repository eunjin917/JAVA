package practice;

// 1번문제 - 알바천국
// https://codinggangsa.notion.site/8ecf0e44f25e4639b60a5c1dbc9b1918
// 알바가는 날 : 월1 수3 금5 일7 => 홀수일 때 알바

import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요일의 번호(1~7)을 입력하세요 : ");
        int day = scanner.nextInt();
        System.out.println(day%2==1 ? "oh my god" : "enjoy");
    }
}

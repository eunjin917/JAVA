package practice;

// 3번 문제 - 369 게임 달인

import java.util.Scanner;

public class pr8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~10 중 입력하세요 : ");
        int num = scanner.nextInt();
        for (int i = 1; i<num+1; i++)
            System.out.print(i%3==0 ? "X " : i+" ");
    }
}

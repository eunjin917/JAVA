package practice;

// 6번 문제 - 별찍기
// https://codinggangsa.notion.site/8ecf0e44f25e4639b60a5c1dbc9b1918

import java.util.Scanner;

public class pr19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i=n/2; i>=0; i--) {
            for (int j=0; j<i; j++)
                System.out.print(" ");
            for (int j=0; j<n-2*i; j++)
                System.out.print("*");
            for (int j=0; j<i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
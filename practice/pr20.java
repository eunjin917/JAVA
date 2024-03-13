package practice;

// 7번 문제 - 수열의 합
// https://codinggangsa.notion.site/8ecf0e44f25e4639b60a5c1dbc9b1918

import java.util.Scanner;

public class pr20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for (int i=0; i<n; i++)
            sum += (i+1)*(n-i);
        System.out.println(sum);
    }
}

package practice;

// 8번 문제 - 자리 배치
// https://codinggangsa.notion.site/8ecf0e44f25e4639b60a5c1dbc9b1918

import java.util.Arrays;
import java.util.Scanner;

public class pr21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int C = scanner.nextInt();

        int[] students = new int[N];
        for (int i=0; i<N; i++)
            students[i] = scanner.nextInt();

        Arrays.sort(students);

        for (int i=1; i<=N; i++) {
            System.out.print(students[i-1]+" ");
            if (i%C == 0)
                System.out.println();
        }
    }
}

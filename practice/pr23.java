package practice;

// 10번 문제 - 괄호의 개수
// https://codinggangsa.notion.site/8ecf0e44f25e4639b60a5c1dbc9b1918

import java.util.Scanner;

public class pr23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openCount = 0;
        int closeCount = 0;

        char[] input = scanner.nextLine().toCharArray();
        for (int i=0; i<input.length; i++) {
            if (input[i] == '(') openCount++;
            else if (input[i] == ')') closeCount++;
        }

        System.out.println(openCount+" "+closeCount);
    }
}

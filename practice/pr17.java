package practice;

//연습문제 - 별찍기

import java.util.Scanner;

public class pr17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //1. 다음과 같이 출력하시오.
        // 입력 예)
        // 5
        // 출력 예)
        //*****
        //*****
        //*****
        //*****
        //*****
        // 입력 예)
        // 3
        // 출력 예)
        //***
        //***
        //***
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //2. 별찍기2
        //입력 예)
        //3
        //출력 예)
        //  *
        // **
        //***
        //입력 예)
        //5
        //출력 예)
        //    *
        //   **
        //  ***
        // ****
        //*****
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //3. 별찍기3
        //입력 예) 5이상의 홀수
        //5
        //출력 예)
        //*****
        //*  **
        //* * *
        //**  *
        //*****
        //입력 예)
        //7
        //출력 예)
        //*******
        //*    **
        //*   * *
        //*  *  *
        //* *   *
        //**    *
        //*******
        for (int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i=0; i<n-2; i++) {
            System.out.print("*");
            for (int j=0; j<n-i-3; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

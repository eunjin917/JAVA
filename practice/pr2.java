package practice;

//1. short형 변수 num1을 선언하고 10값을 넣어서 초기화 한다.
//   int형 변수 num2를 선언하고 20값을 넣어서 초기화 한다.
//   num1을 float형 변수 num3에 넣어서(대입) 자동형변환 시키자.
//2. num2를 num1에 대입해서 강제 형변환 시킨 후 그 값을 출력하자.
//3. num3와 num2값을 곱하기 연산(*)한 후 자동 형변환 한 값을 출력하자.

public class pr2 {
    public static void main(String[] args) {
        //1. short형 변수 num1을 선언하고 10값을 넣어서 초기화 한다.
        //   int형 변수 num2를 선언하고 20값을 넣어서 초기화 한다.
        //   num1을 float형 변수 num3에 넣어서(대입) 자동형변환 시키자.
        short num1 = 10; // short
        int num2 = 20;  // int
        float num3 = num1;  // float

        //2. num2를 num1에 대입해서 강제 형변환 시킨 후 그 값을 출력하자.
        num1 = (short)num2; // short = (short)int
        System.out.println(num1);

        //3. num3와 num2값을 곱하기 연산(*)한 후 자동 형변환 한 값을 출력하자.
        System.out.println(num2*num3);  // int*float => float
    }
}

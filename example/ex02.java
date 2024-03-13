package example;

public class ex02 {
    public static void main(String[] args) {
        // 한줄 주석문
        /*
        여러줄
        주석문
         */
        System.out.println("안녕하세요");
        System.out.println("Digital HANA에 오신 것을 환영 합니다.");

        // 출력문
        // +연산자 : 왼쪽이나 오른쪽에 문자열이 있으면 -> 문자열 연결 연산자로 동작
        //        : 둘 다 숫자이면 -> 산술 연산자로 동작
        System.out.println("화면"+10+20); // 화면1020
        System.out.println(10+20+"화면"); // 30화면
        // 연산자 우선순위가 헷갈리면 -> 소괄호로 묶어준다
        System.out.println(10+(20+"화면")); // 1020화면

        // println print printf
        System.out.println("1줄 출력 후 줄바꿈");   // 문자열 1줄 출력 + 줄바꿈
        System.out.print("1줄 출력만");         // 문자열 1줄 출력만
        // printf : 형식화된 출력문
        // - \n : 줄바꿈 특수문자
        System.out.printf("%d\n", 30);   // 30 - 10진수
        System.out.printf("%o\n", 30);   // 36 - 8진수
        System.out.printf("%x\n", 30);   // 1e - 16진수
        System.out.printf("%f\n", 30.0); // 30.0 - 실수
        System.out.printf("%e\n", 30.0); // 3.000000e+01 - 지수형 출력 (실수만 가능, 정수X)
        System.out.printf("%s\n", "30"); // 30 - 문자열
    }
}

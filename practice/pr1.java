package practice;

// 다음과 같이 출력하시오.
// 1. "Coding is Good!"
// 2. "Java"문자와 "Programming"문자를  +연결연산자로
//     연결해서 출력하시오.
// 3. 십진 정수 123을 printf를 이용하여 출력하시오.
// 4. 십진 정수 123을 printf를 이용하여 "00123"으로 출력하시오.
// 5. 실수형 123.45f를 printf를 이용하여 "123.450"로 출력하시오.

public class pr1 {
    public static void main(String[] args) {
        // 1. "Coding is Good!"
        System.out.println("Coding is Good!");

        // 2. "Java"문자와 "Programming"문자를  +연결연산자로
        //     연결해서 출력하시오.
        System.out.println("Java"+"Programming");

        // 3. 십진 정수 123을 printf를 이용하여 출력하시오.
        System.out.printf("%d\n", 123);

        // 4. 십진 정수 123을 printf를 이용하여 "00123"으로 출력하시오.
        System.out.printf("%05d\n", 123);   // %0<총자리수> : 0이 없으면 공백으로 채움

        // 5. 실수형 123.45f를 printf를 이용하여 "123.450"로 출력하시오.
        System.out.printf("%.3f\n", 123.45f);   // %.<소수점이하자리수> f : float 리터럴을 정의하는 것 (f가 없으면 double)
    }
}

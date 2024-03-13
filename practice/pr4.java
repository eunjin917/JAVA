package practice;

//연습문제 - 나머지연산자를 이용하여
// int k = 123;
//1. 일의 자릿수 3을 출력하시오.
//2. 십의 자릿수 2를 출력하시오.
//3. 백의 자릿수 1을 출력하시오.
// double d = 3.567;
//4. 소숫점 첫째자리를 출력하시오.
//5. 소숫점 첫째자리에서 반올림하여 출력하시오. (4.0)
//6. 소숫점 둘째자리에서 반올림하여 출력하시오. (3.6)

public class pr4 {
    public static void main(String[] args) {
        int k = 123;
        //1. 일의 자릿수 3을 출력하시오.
        System.out.println(k%10);
        //2. 십의 자릿수 2를 출력하시오.
        System.out.println((k / 10) % 10);
        //3. 백의 자릿수 1을 출력하시오.
        System.out.println(k/100);

        double d = 3.567;
        //4. 소숫점 첫째자리를 출력하시오.
        System.out.println((int)((d*10) % 10));
        //5. 소숫점 첫째자리에서 반올림하여 출력하시오. (4.0)
        System.out.println((double)Math.round(d));
        //6. 소숫점 둘째자리에서 반올림하여 출력하시오. (3.6)
        System.out.println(Math.round(d*10)/10.0);

        // 소숫점 없애기
        // 1. Math.floor()
        // 2. (int) 형변환연산자

        // Math.round() : 첫째자리에서 반올림
        // 내부동작은
        // 1. 0.5를 더해준다
        // 2. (int) 형변환연산자로 소수점을 날린다
        // 3. 결과적으로 반올림이 된다
        // ex. 3.49 => 3 +0.5 -> (int)3.999 => 3
        // ex. 3.5 => 4 +0.5 -> (int)4.0 => 4
        // ex. 3.99 => 4
    }
}

package example;

public class ex07 {
    public static void main(String[] args) {
        // 연산자

        // 연산자 우선순위
        // 1. 단항연산자 : ++(증감) !(NOT) (int)(형변환) ~(비트반전) =(대입) +=(복합대입)
        //      - 오른쪽부터 왼쪽으로 연산된다
        int i = 10;
        int j = 20;
        int k = i = j;
        System.out.println(k);
        // 2. 다항연산자 : +(이항) ?:(삼항)
        //      - 왼쪽부터 오른쪽으로 연산된다
        int m = i + j + k;
        System.out.println(m);

        // 연산자 우선순위를 소괄호로 구분하여 -> 코드를 심플하게 + 난독성코드 방지
        int n = i + j / (k * 10 / 7) + 10;

        // 나눗셈 시 => 몫은 /로 + 나머지는 %로

        // 연산자의 종류 - 이항연산자는 삼비논대
        // 단항 : ++ -- !(논리반전) (int)(형변환) ~(비트반전) - 우선순위가 제일 높다
        // 산술 : + - * / %   << >> <<< (쉬프트)
        // 비교 : < <= == !=  instanceof(객체비교)
        // 논리 : && ||       & | ^ (비트논리)
        // 삼항 : ?:
        // 대입 : = +=(복합대입)                           - 우선순위가 제일 낮다

        // 비교, 논리 => 결과값이 true/false로 나온다
        //                  : 조건절에 주로 사용
        // 나머지         => 결과값이 값으로 나온다


        String binaryString = String.format("%32s", Integer.toBinaryString(k)).replace(" ","0");
        System.out.println(binaryString);
    }
}

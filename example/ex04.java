package example;

public class ex04 {
    public static void main(String[] args) {
        // 형변환 type casting

        // 형변환 공식
        // 1. 작은 정수형 -> 큰 정수형 => 문제 없음
        // 2. 큰 정수형 -> 작은 정수형 => 표현범위 벗어나면 값이 잘림
        // 3. 실수형 -> 정수형 => 값이 잘림(소수점 날아감)
        // 4. 정수형 -> 실수형 => 문제 없음

        // 자동 형변환 : 대입(산술) 연산자를 통해 자동으로 형변환됨
        // 1. 같은 타입끼리 연산 시
        //      - int*int => int
        //      - long*long => long
        int i = 10;
        int j = 20;
        int k = i * j;  // int
        // 2. 다른 타입끼리 연산 시 => 더 큰 타입으로 변환
        //      - int*long => long
        //      - long*float => float
        long m = 10 * 20L;  // long
        // 3. 작은 타입에서 큰 타입으로 대입될 때 => 큰 타입으로 변경
        int a = 10; // int
        // 4. 큰 타입에서 작은 타입으로 대입될 때 => 형변환 불가, 수동 형변환 필요
//        int b = 20L; // 형변환 불가

        // 수동(강제) 형변환 : 형변환 연산자를 통해 형변환됨
        // - 작은타입 = (작은타입)큰타입;
        // - 주의할 점! 표현 범위를 벗어나면 => 값이 잘림 (쓰레기값)
        int c = (int)20L;
    }
}

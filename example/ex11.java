package example;

public class ex11 {
    public static void main(String[] args) {
        // 비교연산자
        // A > B: A가 B보다 큰가? true/false
        //   <  : 작은가?
        //   == : 같은가?
        //   != : 같지 않은가?
        //   >= : A가 B보다 크거나(OR) 같은가?
        //      : A > B || A == B
        //   <= : A가 B보다 작거나(OR) 같은가?
        //      : A < B || A == B


        //논리연산자
        //AND && : ~이고, ~이면서
        //OR ||  : ~이거나, 또는, ~중의 하나
        //NOT !  : ~아니다

        // T && T : T  둘다 참이면 참
        // T && F : F
        // F && T : F
        // F && F : F

        // T || T : T
        // T || F : T
        // F || T : T
        // F || F : F  둘다 거짓이면 거짓

        // !T : F
        // !F : T

        // XOR ^ : 비트단위 연산자
        // 1 ^ 1 = 0
        // 1 ^ 0 = 1 서로 값이 다르면 1
        // 0 ^ 1 = 1
        // 0 ^ 0 = 0
    }
}

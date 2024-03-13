package example;

public class ex10 {
    public static void main(String[] args) {
        // 산술 : << >> <<< (쉬프트)

        // 최상위비트(MSB) : 0이면 양수, 1아면 음수

        // 컴퓨터가 음수를 만드는 방법
        // 2의 보수 : 1의 보수 + 1
        // 1의 보수 : 0->1 1->0

        // +1 -> -1 로 만드는 과정
        // 0000...0001 -> 1111...1110 -> 1111...1111

        //   00000...0001
        // + 11111...1111
        // =>00000...0000 => 컴퓨터가 연산하기 쉽다


        // << : 왼쪽으로 비트 이동 => *2의 효과
        //    : LSB(맨왼쪽)은 0이 들어옴
        //    : MSB는 0이면 0, 1이면 1로 지켜짐

        //0 000...0001
        //0 000...0010
        System.out.println( 1 << 1 );
        //1 111...1111
        //1 111...1110
        System.out.println( -1 << 1 );


        // >> : 오른쪽으로 비트 이동 => /2의 효과
        //    : 양수이면 MSB(맨오른쪽)에 0이 들어옴
        //    : 음수이면 MSB에 1이 들어옴

        //0 000...0001
        //0 000...0000
        System.out.println( 1 >> 1 );
        //1 111...1111
        //1 111...1111
        System.out.println( -1 >> 1 );


        // >>> : 오른쪽으로 비트 이동하되, 논리적 이동
        //     : 양수든 음수든 0이 들어옴

        // 0 000...0001
        // 0 000...0000
        System.out.println(1 >>> 1);
        // 1 111...1111
        // 0 111...1111
        System.out.println(-1 >>> 1);
    }
}

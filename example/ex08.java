package example;

public class ex08 {
    public static void main(String[] args) {
        // 단항 : ++ -- !(논리반전) (int)(형변환) ~(비트반전)

        int i = 10;
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);

        boolean b = true;
        System.out.println(!b); // 논리 비교 => 과값이 true/false로 나온다
        System.out.println(!!b);    // 좋지 않은 코드

        int j = 20;
        short s = (short)j;    // 작은 타입 -> 큰 타입 => 강제형변환

        int k = 10; // 32bit 000000....1010
        int m = ~k; //       111111....0101
        System.out.println( Integer.toBinaryString(k) );
        System.out.println( Integer.toBinaryString(m) );

        // 0을 채우기
        String binaryString = String.format("%32s", Integer.toBinaryString(k)).replace(" ","0");
        System.out.println(binaryString);
    }
}

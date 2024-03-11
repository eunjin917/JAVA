package example;

public class ex18 {
    public static void main(String[] args) {
        //반복문의 제어문 : break continue
        //break : 반복문 중단
        //continue : 증감식으로 이동

        for (int i = 0; i < 10; i++) {
            if (i > 5)
                break;
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

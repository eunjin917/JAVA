package practice;

// 2번 문제 - 로또 번호 발생기
// https://codinggangsa.notion.site/8ecf0e44f25e4639b60a5c1dbc9b1918
// 1~45 랜덤수 6개
// 중복수가 나오면 재추첨!

public class pr7 {
    public static void main(String[] args) {
        final int MAX = 6;
        int[] lotto = new int[MAX];

        for (int i=0; i<MAX; i++) {
            int num = (int) (Math.random() * 45) + 1;
            System.out.print(num);
            for (int j=0; j<i; j++) {
                if (lotto[j] == num) {
                    System.out.print("(중복발생! 재추첨)");
                    i--;
                    break;
                }
            }
            lotto[i] = num;
            System.out.print(" ");
        }
    }
}

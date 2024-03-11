package practice;

// 2번 문제 - 로또 번호 발생기
// 1~45 랜덤수 6개
// 중복수가 나오면 재추첨!

// TODO : 강사님코드로고치기

public class pr7 {
    public static void main(String[] args) {
        final int MAX = 6;
        int[] lotto = new int[MAX];
        for (int i=0; i<MAX; i++) {
            int num = (int) (Math.random() * 45) + 1;
            System.out.print(num);
            if (i>0 && lotto[i]==num) {
                System.out.print("(중복발생! 재추첨)");
                i--;
            }
            System.out.print(" ");
        }
    }
}

package practice;

// 연습문제1
// 철수와 영희가 주사위 놀이를 하고 있다.
// 주사위 2개를 던져서,
// 두개 다 짝수가 나오면 철수 승!
// 두개 다 홀수가 나오면, 영희 승!
// 그외의 경우는 무승부! 이다.
// 게임의 결과를 출력하시오.

public class pr11 {
    public static void main(String[] args) {
        int chulsoo = (int)(Math.random()*6) + 1;
        int younghee = (int)(Math.random()*6) + 1;

        System.out.println("철수는 "+chulsoo+", 영희는 "+younghee);
        if (chulsoo%2==0 && younghee%2==0) {
            System.out.println("철수 승!");
        } else if  (chulsoo%2==1 && younghee%2==1) {
            System.out.println("영희 승!");
        } else {
            System.out.println("무승부!");
        }
    }
}

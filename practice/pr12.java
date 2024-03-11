package practice;

// 연습문제2
// 철수와 영희가 주사위게임을 하고 있다.
// 주사위 2개를 철수가 던지고,
// 주사위 2개를 영희도 던진다.
// 게임룰 : 첫번째 주사위는 십의 자릿수로하고,
//        두번째 주사위는 일의 자릿수로 해서,
// 더 높은 점수를 가진 사람이 승리한다.
// 출력값 예시 :
//        철수 주사위1 수 : 1
//        철수 주사위2 수 : 3
//        철수의 점수는 13
//        영희 주사위1 수 : 3
//        영희 주사위2 수 : 4
//        영희의 점수는 34
//        영희 승!

public class pr12 {
    public static void main(String[] args) {
        int chulsoo1 = (int)(Math.random()*6) + 1;
        int chulsoo2 = (int)(Math.random()*6) + 1;
        int younghee1 = (int)(Math.random()*6) + 1;
        int younghee2 = (int)(Math.random()*6) + 1;

        System.out.println("철수 주사위1 수 : "+chulsoo1);
        System.out.println("철수 주사위2 수 : "+chulsoo2);
        int chulsooTotal = chulsoo1*10 + chulsoo2;
        System.out.println("철수의 점수는 "+chulsooTotal);

        System.out.println("영희 주사위1 수 : "+younghee1);
        System.out.println("영희 주사위2 수 : "+younghee2);
        int youngheeTotal = younghee1*10 + younghee2;
        System.out.println("영희의 점수는 "+youngheeTotal);

        if (chulsooTotal > youngheeTotal) {
            System.out.println("철수 승!");
        } else if  (chulsooTotal < youngheeTotal) {
            System.out.println("영희 승!");
        } else {
            System.out.println("무승부!");
        }
    }
}

package practice;

//연습문제
//철수가 AI로봇과 가위바위보 게임을 한다.
//철수가 가위를 낼 확률은 1/10이고, 바위를 낼 확률은 5/10,
//보를 낼 확률은 4/10이다.
//AI로봇은 동일한 확률로 가위바위보를 낸다.
// 팁) 1~10까지 랜덤수를 발생하여 1이면 10%, 2~6이면 50%,
//    7~10이면 40%의 확률임.
//철수가 이길 때까지 가위바위보 게임을 한다고 할때
//과정과 결과를 출력하시오.
//출력결과
//철수:가위 AI로봇:가위
//무승부
//철수:바위 AI로봇:보
//로봇 승
//철수:보 AI로봇:주먹
//철 수 승!

public class pr18 {
    public static void main(String[] args) {
        while (true) {
            int chulsoo = 0;
            int num = (int) (Math.random() * 10) + 1;
            if (num == 1) chulsoo = 0;
            else if (2 <= num && num <= 6) chulsoo = 1;
            else if (num >= 7) chulsoo = 2;

            int AI = (int) (Math.random() * 3);

            System.out.println("철수: "+getResult(chulsoo)+" AI로봇:"+getResult(AI));

            if (chulsoo == AI) System.out.println("무승부");
            else if (chulsoo > AI || (chulsoo==0 && AI==3)) {
                System.out.println("철수 승!");
                break;
            }
            else System.out.println("로봇 승!");
        }
    }

    public static String getResult(int num) {
        switch (num) {
            case 0:
                return "가위";
            case 1:
                return "바위";
            case 2:
                return "보";
        }
        return "";
    }
}

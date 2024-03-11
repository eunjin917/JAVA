package practice;

// 5번 문제 - 텍스트 야구 게임

import java.util.Random;

public class pr10 {
    public static void main(String[] args) {
        Random random = new Random();

        int hitter = 1;
        int strikeCount = 0;
        int ballCount = 0;
        int outCount = 0;
        System.out.println("게임시작!");

        while(true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("에러 발생!");
            }

            if (outCount == 3) {
                System.out.println("게임 종료!");
                break;
            }
            else if (strikeCount == 0 && ballCount == 0) {
                System.out.println(hitter+"번타자");
            }

            int ball = random.nextInt(2);
            if (ball == 0) {
                System.out.println("스트라이크!");
                strikeCount++;
            }
            else if (ball == 1) {
                System.out.println("볼~");
                ballCount++;
            }

            if (strikeCount == 3) {
                System.out.println("삼진 아웃!");
                strikeCount = 0;
                ballCount = 0;
                outCount++;
                hitter++;
            }
            else if (ballCount == 4) {
                System.out.println("1루 진루!");
                strikeCount = 0;
                ballCount = 0;
                hitter++;
            }
        }

    }
}

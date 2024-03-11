package practice;

// 연습문제2 - switch문 연습
// 달을 나타내는 랜덤수 1~12까지의 정수를 발생시켜,
// 3,4,5이면 봄
// 6,7,8이면 여름
// 9,10,11이면 가을
// 12,1,2이면 겨울 이라고 출력하시오.

public class pr14 {
    public static void main(String[] args) {
        int month = (int) (Math.random() * 12)+1;
        String output = "";
        switch (month) {
            case 3, 4, 5:
                output = "봄";
                break;
            case 6, 7, 8:
                output = "여름";
                break;
            case 9, 10, 11:
                output = "가을";
                break;
            case 12, 13, 1:
                output = "겨울";
                break;
            default:
                output = "잘못된 월 입니다.";
        }
        System.out.println(output);
    }
}

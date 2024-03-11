package practice;

// 연습문제1 - switch문 연습
// 애완견 똘이를 기쁘게 해줄 애완용 로봇을 프로그램해보자.
// 코드 0를 입력하면 "음악을 틀어준다."콘솔 출력
// 코드 1 : 간식을 준다.
// 코드 2 : 주인의 영상을 틀어준다.
// 코드 3 : 산책을 시켜준다.
// 그외의 코드 : 잘못된 코드입니다. 출력
// 랜덤수(코드)를 0~5까지 발생시켜, 코드에 맞는 출력문을
// 작성하시오.

public class pr13 {
    public static void main(String[] args) {
        int code = (int)(Math.random()*6);
        String output = "";
        switch (code) {
            case 0:
                output = "음악을 틀어준다.";
                break;
            case 1:
                output = "간식을 준다.";
                break;
            case 2:
                output = "주인의 영상을 틀어준다.";
                break;
            case 3:
                output = "산책을 시켜준다.";
                break;
            default:
                output = "잘못된 코드입니다.";
        }
        System.out.println(output);
    }
}

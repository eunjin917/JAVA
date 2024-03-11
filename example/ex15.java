package example;

public class ex15 {
    public static void main(String[] args) {
        // 조건문 - switch문
        // 패턴
        //     정수,문자,문자열
        int a = 10;
        switch ( a ) {
            case 9:
                System.out.println("9");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("그외의 값");
                break;
        }

        int a2 = 11;
        switch ( a2 ) {
            case 9:
            case 10:
                System.out.println("9 or 10");
                break;
            default:
                System.out.println("그외의 값");
                break;
        }
    }
}

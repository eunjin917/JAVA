package example;

public class ex05 {
    public static void main(String[] args) {
        String str1 = new String("안녕"); // 새로운 문자열 객체
        String str2 = "안녕"; // 같은 내용의 리터럴 객체가 있는지 확인함 => 있으면, 새로 생성 안 하고 주소값만 복사
        String str3 = "안녕"; // 새로운 문자열 객체
        String str4 = new String("안녕"); // 같은 내용의 리터럴 객체가 있는지 확인함 => 있으면, 새로 생성 안 하고 주소값만 복사

        System.out.println(str1==str2); // false
        System.out.println(str2==str3); // true
        System.out.println(str3==str4); // false
        System.out.println(str4==str1); // false

        // 문자열 연결 연산자 +
        // 산술 연산자 +
        System.out.println("한글"+"만세");  // 문자열+문자열 => 문자열 연결
        System.out.println("한글"+10);     // 문자열 + 기본자료형 => 기본자료형을 문자열로 변환 + 문자열 연결
        System.out.println(10+"한글");     // 기본자료형 + 문자열 => 기본자료형을 문자열로 변환 + 문자열 연결
        System.out.println(10+20);        // 산술연산자
        System.out.println("한글"+10+20);  // 한글1020 => 연산자 우선순위 : 좌->우
        System.out.println(10+20+"한글");  // 30한글 => 연산자 우선순위 : 좌->우

        // 기본자료형 -> 문자열형 변환
        String str = String.valueOf(10);
        System.out.println(str);
        // 문자열형 -> 정수형 변환
        int num = Integer.parseInt("10");
        System.out.println(num);
    }
}

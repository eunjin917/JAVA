package example;

public class ex03 {
    public static void main(String[] args) {
        // 데이터 타입(자료형)
        // - 기본 자료형 8개
        // 정수형 : byte(1), short(2), int(4), long(8)
        // 실수형 : float(4), double(8)
        // 논리형 : boolean(1)
        // 문자형 : char(2) - 내부적으로 숫자형
        // - 참조 자료형 4개
        // 문자열
        // 배열
        // 클래스(객체)
        // 열거형

        // [기본 자료형]
        // 정수형
        int myInt = 10;
        System.out.println(myInt);
        long myLong = 20L;  // long 리터럴로 초기화
        System.out.println(myLong);
        short myShort = 30;
        System.out.println(myShort);
        byte myByte = 40;
        System.out.println(myByte);

        // 실수형
        float myFloat = 6.14f;  // float 리터럴로 초기화
        System.out.println(myFloat);
        double myDouble = 3.14d;    // double 리터럴로 초기화 (d는 생략해도 됨)
        System.out.println(myDouble);

        // 논리형
        boolean myBoolean = true;
        System.out.println(myBoolean);

        // 문자형
        char myChar1 = 'A'; // 65(시작)
        System.out.println(myChar1);
        char myChar2 = '가'; // 44032(시작)
        System.out.println(myChar2);
        // - 내부적으로 문자형 : 유니코드표에 숫자값으로 정해져있음
        System.out.println((int)myChar1);
        System.out.println((int)myChar2);
        System.out.println((char)0xAC00);   // 0x : 16진수

        // [참조 자료형]
        // 문자열
        String myString1 = new String("문자열1");  // 원래는 이렇게 해야하지만
        System.out.println(myString1);
        String myString2 = "문자열2";                   // 간략하게 표현 가능
        System.out.println(myString2);
    }
}

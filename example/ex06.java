package example;

import java.util.Arrays;

public class ex06 {
    public static void main(String[] args) {
        // 문자열 관련 함수들
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";

        // 문자열 길이
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println();

        // 문자 1글자만 가져오기
        char c1 = str1.charAt(0); // 0 : 제일 첫 문자만 가져옴
        System.out.println(c1);
        char c2 = str1.charAt(1);   // 1 : 2번째 문자를 가져옴
        System.out.println(c2);

        // 문자열 위치(인덱스) 가져오기 - 문자, 문자열 모두 가능
        System.out.println(str1.indexOf("Java"));
        System.out.println(str1.indexOf('a'));
        // 뒤에서부터 문자열 위치(인덱스) 가져오기 - 문자, 문자열 모두 가능
        System.out.println(str1.lastIndexOf("Java"));
        System.out.println(str1.lastIndexOf('a'));

        String str3 = "Java Study";

        // 대문자로 바꾸기
        System.out.println(str3.toUpperCase());
        // 소문자로 바꾸기
        System.out.println(str3.toLowerCase());
        // 문자열 검색 시 -> 다 소문자로 바꿔서 검색
        System.out.println(str3.toLowerCase().indexOf("java"));

        // 문자열 치환하기
        System.out.println(str3.replace("Study", "공부"));

        // 문자열 일부 가져오기
        System.out.println(str3.substring(0, 5));   // 시작인덱스, 끝인덱스(포함)

        // 문자열을 분리해서 -> 문자열 배열로 가져오기
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");  // / or - or ' ' 을 기준으로 분리
        System.out.println(strArray.length);

        // 배열 그대로 출력 시 => 주소값이 나옴
        System.out.println(strArray);   // [Ljava.lang.String;@404b9385
        // Arrays.toString() : 배열을 문자열로 변환해주는 메서드
        System.out.println(Arrays.toString(strArray));  // [abc, def, ghi, jkl]

        // 문자열의 처음과 끝의 공백만 제거 (가운데 공백은 안 함)
        System.out.println(" abc ".trim()); // abc
        System.out.println(" abc def ".trim()); // abc def
        // 모든 공백을 제거
        System.out.println(" abc def ".replaceAll(" ", ""));    // abcdef

        // 문자열 연결
        System.out.println("abc".concat("123"));

        // 문자열을 포함하는지 true/false로 반환하는 함수
        System.out.println("abc123".contains("123"));

        // 문자열 내용 비교하기
        String str4 = "java";
        String str5 = "java";
        // 주소값의 정수를 비교
        System.out.println(str4 == str5);   // true : 리터럴이므로, 같은 주소값
        // 내용을 비교 => 🔥자바는 == 아니고 equals()를 사용해야함
        System.out.println(str4.equals(str5));  // true
    }
}

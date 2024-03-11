package practice;

//1. "funny"의 시작 인덱스를 출력하시오.
//2. str6를 모두 대문자로 출력하시오.
//3. str6를 모두 소문자로 ~
//4. str5와 str6을 concat함수로 연결하여 출력하시오.
//5. str7의 시작과 끝 공백만 제거하여 출력하시오.
//6. str7의 모든 공백을 *로 치환하여 출력하시오.
//7. str6은 "web"문자열을 포함하고 있는지? (대소문자 안가림)
//   true/false로 출력하시오.
//8. str6을 문자열 배열로 만들고, "Web"와 "funny~"만 출력하시오.

public class pr3 {
    public static void main(String[] args) {
        String str5 = "java";
        String str6 = "Web Programming is funny~";
        String str7 = "  Test Trim String  ";

        System.out.println(str6.indexOf("funny"));
        System.out.println(str6.toUpperCase());
        System.out.println(str6.toLowerCase());
        System.out.println(str5.concat(" " + str6));
        System.out.println(str7.trim());
        System.out.println(str7.replace(' ', '*')); // replaceAll이랑 차이는?
        System.out.println(str6.toLowerCase().contains("web"));

        String[] str6Array = str6.split(" ");
        System.out.println(str6Array[0] + " " + str6Array[str6Array.length-1]);
    }
}

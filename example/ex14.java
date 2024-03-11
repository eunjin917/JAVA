package example;

public class ex14 {
    public static void main(String[] args) {
        // 조건문 : if문, switch문

        // if문 4가지 패턴

        // 1. 단일 if문
        // * 조건식에는 비교/논리 연산자가 들어간다.
        if( 10 < 20 ){
            System.out.println("10이 20보다 작음");
        }
        if( 10 > 20 ) //실행문이 하나이면 생략 가능
            System.out.println("10이 20보다 작음1");
        System.out.println("10이 20보다 작음2");

        // 2. if else문
        if( 10 > 20 ){
            System.out.println("참");
        }else{
            System.out.println("거짓");
        }

        // 3. if else if문
        int score = 90;
        if( score < 70 ){
            System.out.println("70미만");
        }else if( score < 80 ){
            System.out.println("80미만");
        }else if( score < 90 ){
            System.out.println("90미만");
        }else{ // 그 외의 경우
            System.out.println("90이상");
        }

        // 4. 중첩 if문
        if( 10%2 == 0 ) {
            System.out.println("2의 배수");
            if( 10%5 == 0){
                //조건식1 and 조건식2
                System.out.println("5의 배수");
            }else{
                //조건식1 and !조건식2
                System.out.println("5의 배수아님");
            }
        }

        // 코딩 패턴
        if( 10 < 20 ){
            System.out.println("20이 더 큼!");
        }
    }
}

package example;

// 생성자함수 - 메소드 오버로딩이 가능하다
// 오버로딩 : 매개변수의 타입과 개수를 다르게함으로써, 함수를 확장하는 것

class Robot {
    String color = "빨강";
    int price = 1000;

    public Robot() {
        System.out.println("기본 생성자함수");
    }

    public Robot(String color) {
        this.color = color;
        System.out.println("필드가 있는 생성자함수");
    }

    public Robot(String color, int price) {
        this.color = color;
        this.price = price;
        System.out.println("필드가 2개 있는 생성자함수");
    }
}


public class ex38 {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        Robot r2 = new Robot("파랑");
        Robot r3 = new Robot("보라", 2000);
    }
}

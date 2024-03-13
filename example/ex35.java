package example;

// static 초기화 블록
class StaticClass {
    int a;
    static int b = 0;
    static {    // 클래스 호출 시, 처음 단 1번만 수행
        b = 5;
        System.out.println("static block!");
    }

    // 생성자함수
    StaticClass() { // new 시 호출됨
        a = 3;
        b = 10;
        System.out.println("constructor block!");
    }
}

public class ex35 {
    public static void main(String[] args) {
        System.out.println(StaticClass.b);
        StaticClass s = new StaticClass();
        System.out.println(StaticClass.b);
    }
}

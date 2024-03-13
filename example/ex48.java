package example;

// default메소드 : JDK8부터 추가된 기능
//              : 인터페이스에서 일반함수처럼 코드를 가진 메소드를 정의한다
//              : default 키워드 사용
//                <-> 생략된 접근제한자 default와는 다르다

class ClassM {
    int price = 10;
}

interface Vehicle {
    public void drive();    // 추상메소드(가상함수)
    public default void run() { // default메소드
        System.out.println("달린다");
    }
}

// 인터페이스 상속을 통한 확장
interface Truck extends Vehicle {

}

class Tesla implements Vehicle {
    @Override
    public void drive() {
        System.out.println("테슬라를 운전한다");
    }
}

public class ex48 {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
    }
}

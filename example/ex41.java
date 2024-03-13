package example;

// final이 클래스 안에서 사용될 때
// 1. final 필드 : 상수처럼 동작, 1번 값이 들어가면 다시 대입 안됨
// 2. final 클래스 : 상속 불가
// 3. final 메소드 : 오버라이드 불가

final class FinalClass {
    String name = "파이널 클래스";
    int age;    // 0으로 초기화, 힙 영역의 참조변수는 강제 초기화
    final int price = 1000; // 상수 타입의 필드, final 시에는 반드시 초기화 해야함
    final void disp() { }
}

//class LastClass extends FinalClass {    // 상속 불가
//    @Override
//    void disp() {}  // 오버라이드 불가
//}

public class ex41 {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
//        fc.price = 2000;    // 다시 값을 넣으려고 하면 오류


        // 상수 선언 시
        final double PI = 3.141592;
//        PI = 6.13;  // 다시 값을 넣으려고 하면 오류
    }
}

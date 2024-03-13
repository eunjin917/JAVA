package example;

public class ex31 {
    static void echo(){
        System.out.println("echo");
    }
    static void echo(int x){
        System.out.println("echo:"+x);
    }
    static void echo(String msg){
        System.out.println("echo:"+msg);
    }
    public static void main(String[] args) {
        //메소드 오버로딩(Overloading, 과적)
        //  : 매개변수의 타입과 갯수를 다르게 함으로
        //    함수의 기능을 확장하는 것.
        //  : 같은 이름의 함수를 사용할 수 있다.
        echo();
        echo( 10 );
        //예) println
        System.out.println( );
        System.out.println( 10 );
        System.out.println( "야호~" );
    }
}
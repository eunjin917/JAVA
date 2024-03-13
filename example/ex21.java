package example;

public class ex21 {
    public static void main(String[] args) {
        // while do-while

        // 패턴

        // for (초기식; 조건식; 증감식) {
        //      실행문;
        // }

        // 초기식;
        // while(조건식) {
        //      실행문;
        //      조건문;    // 맨마지막
        // }

        // *적어도 1번은 실행 후 -> 조건비교
        // 초기식;
        // do {
        //      실행문;
        //      증감문;
        // } while(조건식);

        int i = 0;
        while( i<5 ){
            System.out.println( i );
            i++;
        }

        i = 0;
        do {
            System.out.println( i );
            i++;
        } while ( i < 5);
    }
}

package example;

public class ex16 {
    public static void main(String[] args) {
        //반복문 for while do-while
        //      70%  29%   1%
        //패턴
        //for( 초기화1; 조건식2; 증감식4 ) {
        //  실행문3;
        //}
        // 1 => 2 => 3 => 4 => 234 234 2(false 탈출)
        for( int i=0; i<5; i++ ){
            System.out.println( i );
        }
        //초기식,조건식,증감식을 잘못쓰면 무한루프에 걸린다.
//        for( int i=0;    ; i++ ){
//            System.out.println( i );
//        }
        //무한루프을 만드는 방법
        //1. for( ; ; )
        //2. while( true )

        //연습문제
        //1. 1부터 100까지 3과 5의 배수인 수만 출력하시오.
        //  for문 안에서 if문 사용
        //2. 1부터 10까지의 합을 출력하시오.
        //  sum = sum + n;
        //3. 1부터 100까지 끝자리가 3으로 끝나는 수의
        //   갯수(count)를 출력하시오.
    }
}
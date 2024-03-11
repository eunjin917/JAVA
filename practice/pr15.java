package practice;

//연습문제
//1. 1부터 100까지 3과 5의 배수인 수만 출력하시오.
//  for문 안에서 if문 사용
//2. 1부터 10까지의 합을 출력하시오.
//  sum = sum + n;
//3. 1부터 100까지 끝자리가 3으로 끝나는 수의
//   갯수(count)를 출력하시오.
//4.
//영희가 1부터 100까지 번호가 쓰인 징검다리 돌을
//지나고 있다.
//뒷자리가 2나 7로 된 돌은 밣지 않고 건너려고 한다.
//영희가 밣은 벽돌의 갯수와 밣지 않은 벽돌의 갯수를
//출력하시오.
// 힌트 : 2 7 12 17 22 27 ... 돌은 밣지 않음.
//       갯수는 count를 세는 것임.
//출력 예)
// 영희가 밣은 벽돌의 갯수:80
// 밣지 않은 벽돌의 갯수:20

public class pr15 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++) {
            if (i%3==0 || i%5==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int i=1; i<=10; i++) {
            sum += i;
        }
        System.out.println(sum);

        int count = 0;
        for (int i=1; i<=100; i++) {
            String str = String.valueOf(i);
            if (str.charAt(str.length()-1) == '3') {
                count++;
            }
        }
        System.out.println(count);

        int skipCount = 0;
        for (int i=1; i<=100; i++) {
            String str = String.valueOf(i);
            if (str.charAt(str.length()-1) == '2' || str.charAt(str.length()-1) == '7') {
                skipCount++;
            }
        }
        System.out.println("영희가 밟은 벽돌의 갯수: "+(100-skipCount));
        System.out.println("밟지 않은 벽돌의 갯수: "+skipCount);
    }
}

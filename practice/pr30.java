package practice;

public class pr30 {
    //연습문제
    //1. 2차원 정수배열 nums를 행 3개, 열 3개로 만들고,
    // 모든 행열에 값을 넣되,
    // 랜덤값 정수 1~100 사이의 값을 넣고,
    // 전체를 순환하여 출력하시오.
    //2. 최소값과 최대값을 출력하시오.
    //3.
    // 순돌이네 인쇄소
    // 3x3 2차원 정수배열에 아래와 같은 숫자가 들어있다면,
    // 0 1 0       #  *  #
    // 1 2 0   =>  *  +  #
    // 1 0 0       *  #  #
    // 이렇게 출력이 된다.
    // 0 1 2
    // 1 2 0
    // 2 1 0 이렇게 들어가 있을때 출력결과를 표시하시오.
//    int[][] data = { {0, 1, 2},
//            {1, 2, 0},
//            {2, 1, 0} };

    public static void main(String[] args) {
        int[][] nums = new int[3][3];

        //1. 2차원 정수배열 nums를 행 3개, 열 3개로 만들고,
        // 모든 행열에 값을 넣되,
        // 랜덤값 정수 1~100 사이의 값을 넣고,
        // 전체를 순환하여 출력하시오.
        for (int i=0; i<3; i++)
            for (int j=0; j<3; j++)
                nums[i][j] = (int)(Math.random() * 100) + 1;
        for (int[] row : nums)
            for (int col : row)
                System.out.println(col);

        // 2. 최소값과 최대값을 출력하시오.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] row : nums)
            for (int col : row) {
                if (min > col)
                    min = col;
                if (max < col)
                    max = col;
            }
        System.out.println("최소"+min);
        System.out.println("최대"+max);

        //3.
        // 순돌이네 인쇄소
        // 3x3 2차원 정수배열에 아래와 같은 숫자가 들어있다면,
        // 0 1 0       #  *  #
        // 1 2 0   =>  *  +  #
        // 1 0 0       *  #  #
        // 이렇게 출력이 된다.
        // 0 1 2
        // 1 2 0
        // 2 1 0 이렇게 들어가 있을때 출력결과를 표시하시오.
        int[][] data = { {0, 1, 2},
                {1, 2, 0},
                {2, 1, 0} };
        for (int[] row : data) {
            for (int col : row) {
                switch (col) {
                    case 0:
                        System.out.print("# ");
                        break;
                    case 1:
                        System.out.print("* ");
                        break;
                    case 2:
                        System.out.print("+ ");
                        break;
                }
            }
            System.out.println();
        }
    }
}

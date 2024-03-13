package practice;

// 미니프로젝트 1. 캐릭터 움직이기
// https://codinggangsa.notion.site/60c14be913f342b79f5360ebdfe3aad3

public class pr24 {
    // 0:빈칸 1:벽 2:사람 3:골인
    static int[][] map = {
            //map[1][1] = 2  => "d"키입력 =>  map[1][1] = 0, map[1][2] = 2
            //                                   x  y           x  y+1
            //map[1][1] = 2  => "s"키입력 =>  map[1][1] = 0, map[2][1] = 2
            //                                   x  y           x+1 y

            //col 0 1 2
            {1,1,1,1,1,1,1}, //row 0
            {1,2,1,0,0,3,1}, //1
            {1,0,1,0,1,1,1}, //2
            {1,0,1,0,0,0,1},
            {1,0,1,1,1,0,1},
            {1,0,0,0,0,0,1},
            {1,1,1,1,1,1,1},
    };

    public static void main(String[] args) {

    }
}
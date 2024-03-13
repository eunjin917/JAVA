package practice;

//연습문제
//int[]  nums = { 10, 30, 20, 50, 40 };
//1. 배열의 모든 요소값를 출력하시오.
//2. 배열의 값 갯수를 출력하시오.
//3. 배열의 모든 값의 합계를 출력하시오.
//4. 배열에서 20은 몇번째에 위치하는지 출력하시오.
//   출력값: 3번째

public class pr29 {
    public static void main(String[] args) {
        int[]  nums = { 10, 30, 20, 50, 40 };

        //1. 배열의 모든 요소값를 출력하시오.
        for (int num : nums)
            System.out.println(num);

        //2. 배열의 값 갯수를 출력하시오.
        System.out.println(nums.length);

        //3. 배열의 모든 값의 합계를 출력하시오.
        int sum = 0;
        for (int num : nums)
            sum += num;
        System.out.println(sum);

        //4. 배열에서 20은 몇번째에 위치하는지 출력하시오.
        //   출력값: 3번째
        for (int i=0; i<nums.length; i++)
            if (nums[i] == 20) {
                System.out.println((i+1)+"번째");
                break;
            }
    }
}

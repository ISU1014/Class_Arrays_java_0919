package _230919;

public class _05_02_01_Array_practice {

	public static void main(String[] args) {
		// 2차원 배열 num을 생성하고 값을 저장합니다.
        int[][] num = new int[5][5];
        
        int value = 1; // 시작 값
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                num[i][j] = value;
                value++;
                System.out.print(num[i][j]);
            }
      
            System.out.println(); // 각 행을 다 출력한 후 줄바꿈
        }
    }
}
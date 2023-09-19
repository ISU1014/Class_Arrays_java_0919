package _230919;

public class _05_Arrays {

	public static void main(String[] args) {
		 // 2차원 배열 num을 생성하고 값을 저장합니다.
        int[][] num = new int[5][5];
        
        // 값을 저장하는 예시: 여기서는 간단하게 1부터 25까지의 값을 저장합니다.
        int value = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = value;
                value++;
            }
        }

        // 배열 값을 출력합니다.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num[i][j] + "\t"); // 탭으로 구분하여 출력
            }
            System.out.println(); // 각 행을 다 출력한 후 줄바꿈
        }
    }
}
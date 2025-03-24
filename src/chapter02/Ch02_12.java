package chapter02;

import java.util.Scanner;

public class Ch02_12 {
	public int solution(int m, int n, int[][] arr) {
		int answer = 0;
		for(int i = 1; i <= n; i++ ) {
			for(int j = 1; j <= n; j++) {
				int count = 0;
				if(i == j) {
					continue;
				}
				for(int test = 0; test < m; test++) {
					int testi = 0;
					int testj = 0;
					for(int rank = 0; rank < n; rank++) {
						if(arr[test][rank] == i) {
							testi = rank;
						}
						if(arr[test][rank] == j) {
							testj = rank;
						}
					}
					if(testi < testj) {
						count ++;
					}
				}
				if(count == m) {
					answer ++;
			}
		}
	}
		return answer;
}
	
	public static void main(String[] args) {
		Ch02_12 T = new Ch02_12();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 학생수
		int m = sc.nextInt(); // 시험수
		
		int [][] arr = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();			
			}
		}
		System.out.println(T.solution(m, n, arr));
	}
}


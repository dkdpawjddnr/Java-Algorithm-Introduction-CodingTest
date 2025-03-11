package chapter02;

import java.util.Scanner;

public class Ch02_09 {
	
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int hang;
		int row;
		
		for(int i = 0; i < n; i++) {
			hang = row = 0;
			
			for(int j = 0; j < n; j++) {
				hang += arr[i][j];
				row += arr[j][i];
			}
			answer = Math.max(answer, row);
			answer = Math.max(answer, hang);
		}
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		return answer;
	
	}
	
	public static void main(String[] args) {
		Ch02_09 T = new Ch02_09();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}


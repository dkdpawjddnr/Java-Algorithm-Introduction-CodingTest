package chapter02;

import java.util.Scanner;

public class Ch02_11 {
	public int solution(int n, int[][] arr) {
		int answer = 0, max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= n; i++) {
			int count = 0;
			for(int j = 1; j <= n; j++) {
				for(int k = 1; k <= 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						count++;
						break;
					}
				}
			}
			if(count > max) {
				max = count;
				answer = i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ch02_11 T = new Ch02_11();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [][] arr = new int[n+1][6];
		
		for(int i = 1; i < n+1; i++) {
			for(int j = 1; j <= 5; j++) {
				arr[i][j] = sc.nextInt();			
			}
		}
		System.out.println(T.solution(n, arr));
	}
}


package chapter03;

import java.util.Scanner;

public class Ch03_03 {
	//Sliding Window
	public int solution(int n, int k, int[]arr) {
		int answer = 0;
		int sum = 0;
		// 첫 k일 동안의 합 계산 윈도우 sum
		for(int i = 0; i < k; i++) {
			sum += arr[i];
			answer = sum;
		}
		
		// 슬라이딩 윈도우
		for(int i = k; i < n; i++) {
			sum += (arr[i] - arr[i-k]);
			answer = Math.max(answer, sum);
		}
		return answer;
	}
	
	//이중 for문
	public int solution2(int n, int k, int[]arr) {
		int answer = 0;
		// 가능한 시작 시점
		for(int i = 0; i<= n-k; i++) { 
			int sum = 0;
			// k일 동안 합산
			for(int j = i; j < i+k; j++) {
				sum += arr[j];
			}
			answer = Math.max(answer, sum);
			sum = 0;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ch03_03 T = new Ch03_03();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, k, arr));
	}
}


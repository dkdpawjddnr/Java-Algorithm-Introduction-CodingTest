package chapter03;

import java.util.Scanner;

public class Ch03_04 {
	public int solution(int n, int m, int[]arr) {
		int answer = 0;
		int sum = 0;
		int lt = 0;
		
		for(int rt = lt; rt < n ; rt++) {
			sum += arr[rt];
			
			while(sum > m) {
				sum -= arr[lt];
				lt++;
			}
			
			if(sum == m) {
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ch03_04 T = new Ch03_04();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}
}


package chapter03;

import java.util.Scanner;

public class Ch03_06 {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int lt = 0;
		int count = 0;
		
		for(int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) {
				count ++;
			}
			
			while(count > k) {
				if(arr[lt]==0) {
					count--;
				}
				lt++;
			}
			answer = Math.max(answer, rt - lt + 1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ch03_06 T = new Ch03_06();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, k, arr));
	}
}
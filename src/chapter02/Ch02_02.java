package chapter02;

import java.util.Scanner;

public class Ch02_02 {
	
public int solution(int n, int[] arr) {
		
		int answer = 1;
		int max = arr[0];
		
		for(int i = 0; i < n; i++) {
			if(max < arr[i]) {
				answer ++;
				max = arr[i];
			} else {
				continue;
			}
		}
		
		
		return answer;
	}

	
	public static void main(String[] args) {
		Ch02_02 T = new Ch02_02();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, arr));
	}
}

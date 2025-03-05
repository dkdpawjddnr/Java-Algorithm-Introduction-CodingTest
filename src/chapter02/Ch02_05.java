package chapter02;

import java.util.Scanner;

public class Ch02_05 {
	
	public int solution(int n) {
		int answer = 0;
		int [] arr = new int[n + 1];
		
		for(int i = 2; i <= n; i++ ) {
			if(arr[i] == 0) {
				answer += 1;
			} for(int j = i; j <= n; j = j+i) {
				arr[j] = 1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ch02_05 T = new Ch02_05();
		int n = sc.nextInt();
		System.out.println(T.solution(n));
		

	}

}

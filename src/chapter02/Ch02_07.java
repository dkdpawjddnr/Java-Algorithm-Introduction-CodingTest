package chapter02;

import java.util.Scanner;

public class Ch02_07{
	
	public int solution(int n, int[] arr) {
		int answer = 0;
		int temp = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				temp += 1;
				answer += temp;
			} else {
				temp = 0;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ch02_07 T = new Ch02_07();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(T.solution(n, arr));
	}
}


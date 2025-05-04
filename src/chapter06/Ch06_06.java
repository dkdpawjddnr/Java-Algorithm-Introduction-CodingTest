package chapter06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ch06_06 {
	public ArrayList<Integer> solution(int n, int arr[]) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		int[] temp = new int[n];
		for(int i = 0; i < n; i++) {
			temp[i] = arr[i];
		}
		// 깊은 복사 해주기
		// 다른 방법으로 arr.clone()
;		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) {
			if(arr[i] != temp[i]) {
				answer.add(i+1);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ch06_06 T = new Ch06_06();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int num: T.solution(n, arr)) {
			System.out.print(num + " ");
		}

	}
}
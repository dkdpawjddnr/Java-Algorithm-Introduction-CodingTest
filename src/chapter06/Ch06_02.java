package chapter06;

import java.util.Scanner;

public class Ch06_02 {
	public int[] solution(int n, int arr[]) {
		for(int i = 0; i < n-1; i++) {
			
			for(int j = 0; j < n-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Ch06_02 T = new Ch06_02();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i : T.solution(n, arr)) {
			System.out.print(i + " ");
		}
	}
}

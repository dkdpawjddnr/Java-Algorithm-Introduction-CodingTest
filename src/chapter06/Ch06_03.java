package chapter06;

import java.util.Scanner;

public class Ch06_03 {
	public int[] solution(int n, int arr[]) {
		for(int i = 1; i < n; i++) {
			int temp = arr[i];
			int j;
			for(j = i - 1; j >= 0; j--) {
				if(temp < arr[j]) {
					arr[j+1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Ch06_03 T = new Ch06_03();
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

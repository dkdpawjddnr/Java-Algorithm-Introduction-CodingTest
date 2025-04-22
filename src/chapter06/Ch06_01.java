package chapter06;

import java.util.Scanner;

public class Ch06_01 {
	public int[] solution(int n, int arr[]) {
		
		for(int i = 0; i < n; i ++) {
			int index = arr[i];
			for(int j = i + 1; j < n; j++) {
				if(index > arr[j]) {
					arr[i] = arr[j];
					arr[j] = index;
					index = arr[i];
				}
			}
		}
		return arr;
	}
	
	public int[] solution2(int n, int arr[]) {
		
		for(int i = 0; i < n-1; i++) {
			int idx = i;
			
			for(int j = i+1; j < n; j++) {
				if(arr[idx] > arr[j]) {
					idx = j;
				}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Ch06_01 T = new Ch06_01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i : T.solution2(n, arr)) {
			System.out.print(i + " ");
		}
	}
}

package chapter06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ch06_05 {
	public char solution(int n, int arr[]) {
		char answer = 'U';
		Arrays.sort(arr);
		
		for(int i = 0; i < n-1; i++) {
			if(arr[i] == arr[i+1]) {
				return 'D';
			}
		}
		return answer;
	}
	
	public char solution2(int n, int arr[]) {
		char answer = 'U';
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		for(int i = 0; i < n; i++) {
			if(map.get(arr[i]) != 1) {
				return 'D';
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Ch06_05 T = new Ch06_05();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution2(n, arr));
		
	}
}

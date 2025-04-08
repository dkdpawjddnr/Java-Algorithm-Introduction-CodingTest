package chapter04;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Ch04_05 {
	
	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		TreeSet<Integer> Test = new TreeSet<>(Collections.reverseOrder());
		
		for(int i = 0; i < n-2; i++) {
			for(int j = i + 1; j < n-1; j++) {
				for(int m = j + 1; m < n; m++) {
					Test.add(arr[i] + arr[j] + arr[m]);
				}
			}
		}
		int count = 0;
		for(int value : Test) {
			count++;
			if(count == k) {
				return value;
			}
		}
		
 		return answer;
	}
	public static void main(String[] args) {
		Ch04_05 T = new Ch04_05();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}

}

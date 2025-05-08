package chapter06;

import java.util.Arrays;
import java.util.Scanner;

public class Ch06_08 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0;
		int rt = n-1;
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(m == arr[mid]) {
				answer = mid + 1;
				break;
			} 
			if(arr[mid] > m) {
				rt = mid - 1;
			} else if(arr[mid] < m) {
				lt = mid + 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ch06_08 T = new Ch06_08();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}
}
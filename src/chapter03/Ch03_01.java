package chapter03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch03_01 {
	public ArrayList<Integer>solution(int n, int m, int[]arr1, int[]arr2) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int p1 = 0, p2 = 0;
		while(p1 < n && p2 < m) {
			if(arr1[p1] < arr2[p2]) {
				answer.add(arr1[p1]);
				p1++;
			} else {
				answer.add(arr2[p2]);
				p2++;
			}
		}
		while(p1 < n) {
			answer.add(arr1[p1++]);
		}
		while(p2 < m) {
			answer.add(arr2[p2++]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ch03_01 T = new Ch03_01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int[] arr1 = new int[n];
		for(int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt(); 
		int[] arr2 = new int[m];
		for(int j = 0; j < m; j++) {
			arr2[j] = sc.nextInt();
		}
		
		for(int x : T.solution(n, m, arr1, arr2)) {
			System.out.print(x + " ");
		}
	}
}


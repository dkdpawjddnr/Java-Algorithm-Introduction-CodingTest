package chapter02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch02_06 {
	
	public boolean inPrime(int num) {
		if(num < 2) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		} return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			String s = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
			int re = Integer.parseInt(s);
			
			if(inPrime(re)) {
				answer.add(re);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ch02_06 T = new Ch02_06();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}


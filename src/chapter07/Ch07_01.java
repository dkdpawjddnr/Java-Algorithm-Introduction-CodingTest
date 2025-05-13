package chapter07;

import java.util.Scanner;

public class Ch07_01 {
	
	public void DFS(int n) {
		if(n == 0) {
			return;
		} else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		Ch07_01 T = new Ch07_01();
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		T.DFS(n);
	}
}

package chapter05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ch05_06 {
	
	public int solution(int n, int k) {
		int answer = 0;
		Queue <Integer>queue = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		while(queue.size()!= 1) {
			for(int i = 1; i <= k; i++) {
				if(i == k) {
					queue.poll();
				}else {
					queue.offer(queue.poll());
				}
			}
		}
		
		
		return queue.poll();
	}
	
	public static void main(String[] args) {
		Ch05_06 T = new Ch05_06();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(T.solution(n, k));
	}
}

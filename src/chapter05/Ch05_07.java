package chapter05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ch05_07 {
	
	public String solution(String str1, String str2) {
		String answer = "YES";
		Queue<Character> queue = new LinkedList<>();
		for(char c : str1.toCharArray()) {
			queue.offer(c);
		}
		
		for(char c : str2.toCharArray()) {
			if(queue.contains(c)) {
				if(queue.peek() == c) {
					queue.poll();
				} 
			}
		}
		
		return queue.isEmpty() ? answer : "NO";
	}
	
	public static void main(String[] args) {
		Ch05_07 T = new Ch05_07();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(T.solution(str1, str2));
	}
}

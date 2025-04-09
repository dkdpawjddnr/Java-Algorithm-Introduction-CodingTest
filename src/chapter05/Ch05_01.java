package chapter05;

import java.util.Scanner;
import java.util.Stack;

public class Ch05_01 {
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c == '(') {
				stack.push(c);
			} else if(c == ')') {
				if(stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		
		return stack.isEmpty() ? answer:"NO";
	}
	public static void main(String[] args) {
		Ch05_01 T = new Ch05_01();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}

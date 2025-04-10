package chapter05;
import java.util.Scanner;
import java.util.Stack;

public class Ch05_02 {
	
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c == '('){
				stack.push(c);
			} else if(c == ')') {
				stack.pop();
			} else if(stack.isEmpty()) {
				answer += c;
			}
		}
		return answer;
	}
	
	public String solution2(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for(char c : str.toCharArray()) {
			if(c != ')') {
				stack.push(c);
			} else if(c == ')') {
				while(stack.peek() != '(') {
					stack.pop();
				} 
				if(stack.peek() == '(') {
					stack.pop();
				}
			}
		}
		for(int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		return answer;
	}
	public static void main(String[] args) {
		Ch05_02 T = new Ch05_02();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.print(T.solution2(str));
	}
}

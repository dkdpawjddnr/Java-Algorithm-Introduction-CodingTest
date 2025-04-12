package chapter05;

import java.util.Scanner;
import java.util.Stack;

public class Ch05_04 {
	
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) {
				stack.push(c - 48);
				
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(c =='+') {
					stack.push(lt+rt);
				} else if(c=='-') {
					stack.push(lt-rt);
				} else if(c=='*') {
					stack.push(lt*rt);
				} else if(c=='/') {
					stack.push(lt/rt);
				}
			}
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		Ch05_04 T = new Ch05_04();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}

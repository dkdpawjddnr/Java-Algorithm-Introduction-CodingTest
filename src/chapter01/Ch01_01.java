package chapter01;

import java.util.Scanner;

public class Ch01_01 {
	public static int solution(String str, char t) {
		int count = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		/*for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == t) {
				count++;
			}
		} */
		
		for(char c : str.toCharArray()) { // 문자 배열 생성
			if(c == t) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String str = sc.next();
		char c = sc.next().charAt(0);
		System.out.println(solution(str, c));
	}
}




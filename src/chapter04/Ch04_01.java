package chapter04;

import java.util.HashMap;
import java.util.Scanner;

public class Ch04_01 {
	
	public char solution(int n, String s) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) +1);
		}
		/*
		for(char key : map.keySet()) {
			System.out.println(key+" "+ map.get(key));
		}
		*/
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Ch04_01 T = new Ch04_01();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		System.out.println(T.solution(n, str));
	}

}

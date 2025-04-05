package chapter04;

import java.util.HashMap;
import java.util.Scanner;

public class Ch04_02 {
	
	public String solution(String a, String b) {
		String answer = " ";
		HashMap<Character, Integer> map= new HashMap<>();
		for(char key : a.toCharArray()) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
		for(char key : b.toCharArray()) {
			if(!map.containsKey(key) || map.get(key) == 0) {
				return "NO";
			} else {
				map.put(key, map.get(key) -1);
			}
			
		}
		return "YES";
	}

	public static void main(String[] args) {
		Ch04_02 T = new Ch04_02();
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		System.out.println(T.solution(a, b));
	}

}

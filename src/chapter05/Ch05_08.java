package chapter05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Ch05_08 {
	public int solution(int N, int M, int arr[]) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<>();
		
		for(int i = 0; i < N; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		
		while(!Q.isEmpty()) {
			Person temp = Q.poll();
			
			for(Person p : Q) {
				if(temp.priority < p.priority) {
					Q.offer(temp);
					temp = null;
					break;
				}
			}
			if(temp!=null) {
				answer++;
				if(temp.id == M) {
					return answer;
				}
			} 
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ch05_08 T = new Ch05_08();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(N, M, arr));
	}
}

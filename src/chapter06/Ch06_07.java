package chapter06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
	public int x;
	public int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) {
			return this.y - o.y;
		} else {
			return this.x - o.x;
		}
	}
}

public class Ch06_07 {
	
	public static void main(String[] args) {
		Ch06_07 T = new Ch06_07();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			Point p = new Point(x, y);
			arr.add(p);
		}
		Collections.sort(arr);
		for(Point o : arr) {
			System.out.println(o.x + " " + o.y);
		}
	}
}
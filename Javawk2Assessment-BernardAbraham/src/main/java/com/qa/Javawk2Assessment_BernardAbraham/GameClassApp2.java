package com.qa.Javawk2Assessment_BernardAbraham;

import java.util.Scanner;

public class GameClassApp2 {

	
	private int a = 0;
	private int b = 0;
	private int x = (int) (Math.random() * 9) + 1;
	private int y = (int) (Math.random() * 9) + 1;
	private int[][] treasure = new int[x][y];
	private int[][] marker = new int[a][b];

	
	public int marker(int i) {
		
		

		if (i == 1 & a != 10) {
			a++;
			//System.out.println("a is " + a);
		} else if (i == 2 & b != 10) {
			b++;
			//System.out.println("b is " + b);
		} else if (i == 3 & a != 0) {
			a--;
			//System.out.println("a is " + a);
		} else if (i == 4 & b != 0) {
			b--;
			//System.out.println("b is " + b);
		}
		return a & b;
	}
		
		public void distance() {
		int height = Math.max(b, y) - Math.min(b, y);
		int length = Math.max(a, x) - Math.min(a, x);
		double distance = Math.hypot(height, length);
		
		if (length == 0) {

			distance = height;
		} else if (height == 0) {

			distance = length;
		}
		
		if (distance == 0) {

			System.out.println("Congratulations, you have found the treasure");
		}
		
		System.out.println("You are " + distance + "m from your treasure");
		return;
		// calculates the distance if zero returns win
	}

	
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	
	
}

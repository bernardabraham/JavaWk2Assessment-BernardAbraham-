package com.qa.Javawk2Assessment_BernardAbraham;

import java.util.Scanner;

public class GameApp2 {
	
	public static void main(String[] args) {
		
	
	
	GameClassApp2 g = new GameClassApp2();
	System.out.println("choose a direction: 1) north 2) east 3) south 4) west");
	
	while (g.getA() != g.getX() || g.getY() != g.getB()) {
	try {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int i = Integer.parseInt(s);
	
		
	g.marker(i);
	g.distance();
	}
	
	 catch (Exception e) {
			System.out.println("please input a number");
}
}
	System.out.println("Congratulations, you have found the treasure");
}
}
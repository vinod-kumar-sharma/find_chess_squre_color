package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Chess Board
/*  a 	b	c	d	e	f	g	h
1	W	B	W	B	W	B	W	B

2	B	W	B	W	B	W	B	W

3	W	B	W	B	W	B	W	B

4	B	W	B	W	B	W	B	W

5	W	B	W	B	W	B	W	B

6	B	W	B	W	B	W	B	W

7	W	B	W	B	W	B	W	B

8	B	W	B	W	B	W	B	W */

class Square {
	String col;
	String row;
	String color;
	public Square() {}
	public Square(String col, String row, String color) {
		this.col = col;
		this.row = row;
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
}
public class ChessBoard {
	public static final String WHITE = "White";
	public static final String BLACK = "Black";
	public static void main(String[] args) {
		System.out.println("Input: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Map<String, Square> chessBoardMap = new HashMap<>();
		for(int i = 0 ; i< 8;i++) {
			String col = String.valueOf((char)(i+97));
			for(int j = 0; j< 8;j++) {
				String row = Integer.toString(j+1);
				String key = col+row;
				if((i+j)%2 == 0) {
					chessBoardMap.put(key, new Square(col, row, WHITE));
				}else {
					chessBoardMap.put(key, new Square(col, row, BLACK));
				}
			}
		}
		
		System.out.println("Color of Squre "+input+" is "+chessBoardMap.get(input).getColor());
	}
}

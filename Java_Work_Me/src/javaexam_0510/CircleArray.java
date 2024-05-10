package javaexam_0510;

import java.util.Scanner;

class Circle {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * 3.14;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		
		Circle[] circles = new Circle[4];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.print((i + 1) + " 반지름 >> ");
			int radius = scanner.nextInt();
			circles[i] = new Circle(radius);
		}

		double totalArea = 0;
		for (Circle circle : circles) {
			totalArea += circle.getArea();
		}

		
		System.out.println("저장하였습니다...");
		System.out.println("원의 면적 전체 합은 " + totalArea);
	}
}

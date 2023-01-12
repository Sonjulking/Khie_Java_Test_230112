package p1;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("사각형의 가로, 세로를 입력하세요.");
		Rectangle rectangle = new Rectangle(sc.nextInt(), sc.nextInt());

		System.out.println("사각형의 넓이 : " + rectangle.Area());
		System.out.println("사각형의 둘레 : " + rectangle.Round());

		sc.close();

	}

}

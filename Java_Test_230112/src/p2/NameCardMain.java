package p2;

import java.util.Scanner;

public class NameCardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름, 전화번호, 주소, 직급을 입력하세요.");

		NameCard namecard = new NameCard(sc.nextLine(), sc.nextLine(), sc.nextLine(),
				sc.nextLine());

		namecard.getNameCard();

		sc.close();

	}

}

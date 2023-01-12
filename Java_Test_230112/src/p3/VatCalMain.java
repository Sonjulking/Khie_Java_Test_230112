package p3;

import java.util.Scanner;

public class VatCalMain {

	public static void main(String[] args) {

		int chungu = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("품목의 개수를 입력 하세요. : "); // 배열의 크기

		// 객체 배열을 만들어보자.

		VatCal[] vatCals = new VatCal[sc.nextInt()];

		for (int i = 0; i < vatCals.length; i++) {

			System.out.println("품명, 단가, 수량을 입력해주세요.");

			System.out.println("::::::::::::::::::::::::::::");
//			String pn = sc.next();
//			int dan = sc.nextInt();
//			int su = sc.nextInt();
			vatCals[i] = new VatCal(sc.next(), sc.nextInt(), sc.nextInt());

			chungu += vatCals[i].price;

		}

		System.out.println("품명" + "\t" + "단가" + "\t" + "수량" + "\t" + "금액" + "\t");
		System.out.println("------------------------------------------");
		for (int i = 0; i < vatCals.length; i++) {

			vatCals[i].Receipt();

		}

		int supval = (int) (chungu / 1.1);
		int boogwa = (int) (chungu - (supval));
		System.out.println("------------------------------------------");
		System.out.printf("공급가액\t\t\t %,d원\n", supval);
		System.out.printf("부가세액\t\t\t %,d원\n", boogwa);
		System.out.println("------------------------------------------");
		System.out.printf("청구금액\t\t\t %,d원\n", chungu);

		sc.close();

	}

}

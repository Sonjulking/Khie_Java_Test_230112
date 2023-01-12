package p2;

import java.util.Scanner;

public class TemporaryMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
		Temporary temp = new Temporary(sc.next(), sc.nextInt(), sc.nextInt());

		temp.payrollCalculation();

		sc.close();

	}

}

package p2;

public class Temporary {
	String name;
	int time;
	int pay;

	public Temporary() {
	}// 기본생성자

	public Temporary(String name, int time, int pay) {
		this.name = name;
		this.time = time;
		this.pay = pay;
	}

	public void payrollCalculation() {

		int totalSalary = time * pay; // 총급여액
		double deduction = totalSalary * 0.03; // 공제액
		int actualPayment = totalSalary - (int) deduction; // 실지급액

		System.out.println("=====================================");
		System.out.println("이름 : " + name);
		System.out.printf("총급여 : %,d원 \n", totalSalary);
		System.out.printf("공제액 : %,d원 \n", (int) deduction);
		System.out.printf("실지급액 :%,d원 \n", actualPayment);

	}

}

package p3;

public class VatCal {

	String productName;
	int unitPrice; // 단가
	int quantity;
	int price;
	double vatRate = 1.1; // 부가가치세율
	int supplyValue; // 공급가
	int vat;
	int chungu;

	public VatCal() {

	}

	public VatCal(String productName, int unitPrice, int quantity) {

		this.productName = productName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.price = unitPrice * quantity;

	}

//	public void Vat(int dan, int su) {
//
//		this.chungu += dan * su;
//
//		this.vat = chungu / 10;
//
//	}

	public void Receipt() {

		System.out.print(productName + "\t");
		System.out.print(unitPrice + "\t");
		System.out.print(quantity + "\t");
		System.out.print(price + "\t");
		System.out.println();

//		System.out.println("공급가액" + supplyValue);
//		System.out.println("부가세" + vat);

	}

//	public void VatRecipt() {
////		System.out.println("공급가액" + supplyValue);
//		System.out.println("부가세" + vat);
//		System.out.println("청구" + chungu);
//		System.out.println("--------------------");
//
//	}

}

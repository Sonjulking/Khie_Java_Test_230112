package p1;

public class Rectangle {

	int width;
	int height;

	public Rectangle() {

	} // 기본 생성자

	public Rectangle(int width, int height) {

		this.width = width;
		this.height = height;

	} // 인자 생성자

	public int Area() {

		return width * height;
	}

	public int Round() {

		return 2 * (width + height);
	}

}

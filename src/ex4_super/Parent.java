package ex4_super;

public class Parent {
	
	private int number = 100;
	int n = 20;
	
	public Parent(int num) { // 자식클래스로부터 10이라는 인자를 받아옴.
		System.out.println("부모클래스 생성자");
	}
	
	public int getNumber() {
		return number;
	}

}

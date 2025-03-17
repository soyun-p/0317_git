package ex4_super;

public class SuperMain {
	public static void main(String[] args) {
		
		Child c = new Child(10);  
		// 이 상태로 출력하면 "부모클래스의 생성자" 출력. 이는 부모 클래스가 자식 클래스보다 먼저 메모리에 할당받았기 때문이다.
		
		c.getNumber();
		
		Parent p = new Parent(10);
		
		// object : 자바의 모든 클래스들의 부모 클래스(like 단군할아버지).
		// Child() 클래스만 만들어도 오브젝트 영역 - 부모 영역 - 자식 영역 순으로 만들어진다.

		
		
	} // main

}

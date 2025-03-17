package ex1_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		// 자식 클래스는 부모 클래스의 속성, 기능들을 가져다 쓸 수 있음. 그러나 프라이빗으로 선언하는 것은 가져다 쓸 수 없다.
		// 자식클래스 하나에 부모클래스가 여러명인 건 쓸 수 없다. 
		
		Child c1 = new Child();
		System.out.println(c1.car);
		// System.out.println( c1.money );  
		
		System.out.println( c1.str );
		
		// 자식 클래스가 힙 메모리에 할당될 때는, 부모 클래스와 주소를 공유한다. 
		// 즉, 부모 클래스의 메모리 주소를 거쳐서 메모리를 할당받기 때문에 부모 속성을 가져다 쓸 수 있는 것이다.
		
		
		// 부모 클래스는 상속 관계여도 자식의 속성을 마음대로 가져다 쓸 수 없다.
		// 힙 메모리에 부모 클래스가 메모리 할당을 받을 때, 자신의 속성에만 접근할 수 있도록 메모리가 할당되기 때문이다.
		Parent p1 = new Parent();
		System.out.println(p1.str); 
		
		// 자식 클래스가 부모 클래스의 메모리 주소를 거쳐서 메모리를 할당받을 때, 그 시작점을 인스턴스(intstance)라고 한다.
		// Child가 Parent의 자식이므로 두 객체는 인스턴스(intstance)가 같다고 표현할 수 있다.
		if( c1 instanceof Parent ) { // 두 객체 간 인스턴스가 같은지 물어보는 것.
			System.out.println("c1은 Parent의 자식");
		}
		
		
	} // main

}

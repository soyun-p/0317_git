package ex4_super;

public class Child extends Parent {
	
	// super : 부모클래스
	// 부모클래스의 생성자 호출을 먼저 하는 것으로,  기본적으로 보이지 않는다.
	// 부모 클래스가 확실히 할당받지 못한다면 자식 클래스도 메모리 할당을 받지 못하기 때문에 반드시 부모클래스 생성자를 먼저 호출해야 한다.
	// 부모가 인자를 받아야 하는 상황에는 super 키워드를 이용해 자식클래스에서 부모클래스로 인자를 보낸다.
	
	public Child(int n) {
		
		super(10);  // 부모클래스의 생성자 Parent()
		super.n = n;
		System.out.println("자식클래스 생성자");
		// super();  : 부모클래스의 생성자 호출하는 코드를 먼저 쓰지 않고, 나중에 쓰면 오류. 부모클래스 생성자는 무조건 가장 먼저 실행되어야 하기 때문.
	}
	
	@Override
	public int getNumber() {
		// 부모클래스의 getNumber() 메서드를 가져온다.
		// return super.getNumber();
		return 200;
	}
	
	// 자식 클래스가 부모클래스에 접근하여 파라미터를 보낼 수 있는 방법
	// 1. super( 인자 값 ) : 괄호 안에 인자 값 입력
	// 2. super.n = 인자 값; 
	// 3. return 인자 값;
	
	// object : 자바의 모든 클래스들의 부모 클래스(like 단군할아버지).
	// Child() 클래스만 만들어도 오브젝트 영역 - 부모 영역 - 자식 영역 순으로 만들어진다.

}

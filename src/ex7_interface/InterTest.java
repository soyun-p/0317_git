package ex7_interface;

public interface InterTest {
	// 인터페이스 : 사용자와 클래스를 연결하는 중계자 역할을 하는 기능.
	
	// 인터페이스의 구성 요소 : 오직 2 가지만 가질 수 있다.
	
	// 1. 상수
	final int VALUE = 100;  // 상수는 프로그램 종료될 때까지 정해진 값을 유지해야 한다.
	// value = 50; -> 이런 식으로 바꿀 수 없음. 상수는 수정 불가
	// final로 선언하려면 변수 이름을 대문자로 써야 함.
	
	// 2. 추상 메서드
	abstract int getValue();
	
	// 인터페이스의 구성 요소, 역할, 주의해야 할 점 정도만 알아놔도 아직은 괜찮.
	

}

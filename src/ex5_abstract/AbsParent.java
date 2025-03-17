package ex5_abstract;

public abstract class AbsParent { 
	// 추상 클래스 : 추상 메서드가 한 개 이상 정의되어 있는 클래스
	// 추상 클래스는 abstract를 통해 내가 추상임을 반드시 명시해야 한다.
	
	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	// 추상 메서드(abstract) : body({})가 없는 메서드
	// 미완성된 개념을 상속받은 자식이 완성시키도록 하는 것이 조건이 된다.
	
	abstract public void setValue( int a );  // 호출해도 실행할 몸통{} 없이 머리만 생성.

}

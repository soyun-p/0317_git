package ex2_override;

public class Snake extends Animal {
	
	String sensor = "밤에도 잘 봄";
	
	/* public int getSnakeLeg() { // 뱀만 다리 개수를 따로 호출. 그러나 불편.
		return 0;
	}  */
	
	
	// 메서드의 오버라이드 : '메서드의 재정의'
	// 상속 관계의 객체에서 부모의 함수를 가져오되, 내용만 현재 클래스 사정에 맞도록 다시 정의하는 것.
	// 즉, 메서드의 이름은 같지만 그 내용이 다름.
	
	@Override
	public int getLeg() {  // 다른 동물들과 같은 이름의 다리 갯수 메서드를 호출. 이렇게 하면 굳이 뱀만 다른 메서드를 호출하지 않아도 가능.
		return 0;
	}

}

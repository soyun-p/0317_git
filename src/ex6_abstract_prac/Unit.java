package ex6_abstract_prac;

public abstract class Unit { // 부모 클래스
	
	String name;
	int energy;
	boolean fly;
	
	
	// 자식 객체가 공격 당했을 때 체력 감소량을 관리하기 위한 메서드
	// 유닛마다 체력 감소량은 다를 수 있기 때문에 내용없이 추상 메서드로 정의.
	abstract public void decEnergy();
	// 만약 공격당할 수도 있기 때문에 자식 메서드에서 가지고 있고, 만약 호출된다면 각각의 자식 클래스에 맞게 재정의되어서 기능을 수행한다.
	
	public int getEnergy() {
		return energy;
	} // 공격 당하고 난 후의 에너지 표시
	
	

}

package ex6_abstract_prac;

public class Terran extends Unit {
	
	public Terran( String name, int energy, boolean fly ) { // 필수 정보를 생성자에 저장.
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}

	@Override
	public void decEnergy() {
		energy -= 3;  // 공격 당할 때마다 3씩 체력 감소
	}
	

}

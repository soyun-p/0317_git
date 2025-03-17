package ex6_abstract_prac;

public class Protoss extends Unit {
	
	public Protoss( String name, int energy, boolean fly ) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy--;  // 1씩 체력 감소
	}
	
	

}

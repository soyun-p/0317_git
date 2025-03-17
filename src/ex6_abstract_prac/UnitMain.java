package ex6_abstract_prac;

public class UnitMain {
	public static void main(String[] args) {
		
		Terran t1 = new Terran("해병", 100, false);
		t1.decEnergy();                                  // Terran 체력 감소되는 메서드 호출 -3
		t1.decEnergy();                                  // Terran 체력 감소되는 메서드 호출 -3
		System.out.println( "t1 : " + t1.getEnergy() );  // 공격당하고 난 후 체력 출력  100 -3 -3 = 94
		
		Protoss p1 = new Protoss("셔틀", 200, true);
		p1.decEnergy();           // -1
		p1.decEnergy();           // -1
		System.out.println( "p1 : " + p1.getEnergy() );  // 200 -1 -1 = 198
		
		
	} // main

}

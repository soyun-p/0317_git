package ex5_abstract;

public class AbsChild extends AbsParent {
	// 추상클래스가 부모인 자식클래스는 부모가 갖고 있는 추상메서드를 반드시 받아둬야 한다.
	// 즉, 오버라이딩을 해줘야 한다.
	
	@Override
	public void setValue(int a) {
		// TODO Auto-generated method stub
		System.out.println("자식이 완성시킵니다!");
	}

}

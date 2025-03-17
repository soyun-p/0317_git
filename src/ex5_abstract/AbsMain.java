package ex5_abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		AbsChild abs = new AbsChild();
		
		
		// 추상 클래스는 완성되지 않은 기능을 가지고 있기 때문에
        // 이 기능이 제대로 완성되기 전까지는 직접적으로 메모리 할당을 받을 수 없다.
		
		AbsParent p = new AbsParent() { 
			
			@Override
			public void setValue(int a) {
				// TODO Auto-generated method stub
				
			}
		};  // 정상적으로 만들어진 게 아니기 때문에 영역 끝에 끝났다는 ; 을 붙여줌?
		
		
		
	} // main

}

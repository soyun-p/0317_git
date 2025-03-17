package ex7_interface;

public class InterMain {
	public static void main(String[] args) {
		
		InterChild ic = new InterChild();
		
		// 인터페이스는 미완성의 개념을 가지고 있으므로 이 개념이 완성될 때 까지는 메모리 할당이 불가
		InterTest it = new InterTest() {
			
			@Override
			public int getValue() {
				// TODO Auto-generated method stub
				return 0;
				
			} // getValue
		};  // InterTest
		
		
	} // main

}

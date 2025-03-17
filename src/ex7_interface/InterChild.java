package ex7_interface;

public class InterChild implements InterTest {
	// 인터페이스는 implenents 키워드를 통해 '구현'한다.
	
	@Override
	public int getValue() {
		// VALUE = 50;
		return VALUE;
	}
	

}

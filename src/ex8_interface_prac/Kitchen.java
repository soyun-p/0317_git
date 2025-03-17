package ex8_interface_prac;

// 인터페이스는 구현 능력이 없어, 다중구현이 가능하다.
// 오버라이딩만 잘 하면 인터페이스는 여러 부모 클래스 가지는 것 가능.
public class Kitchen implements Menu3{ // 따라서 인터페이스를 쓸 수 있다.

	@Override
	public String jjajang() {
		return "중면 + 춘장";
	}

	@Override
	public String jjambbong() {
		return "홍합 + 오징어";
	}

	@Override
	public String tangsuyuck() {
		return "매진";
	}

	@Override
	public String boggembab() {
		return "매진";
	}
	
	
	
}

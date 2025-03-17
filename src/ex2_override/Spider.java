package ex2_override;

public class Spider extends Animal {
	
	String web = "건축비 절감";
	
	@Override
	public int getEye() {
		return 8;
	}
	
	
	@Override
	public int getLeg() {
		return 8;
	}

}

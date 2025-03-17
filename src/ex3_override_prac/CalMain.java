package ex3_override_prac;

public class CalMain {
	public static void main(String[] args) {
		
		Plus plus = new Plus();
		Minus minus = new Minus();
		Multi multi = new Multi();
		
		System.out.println( "더하기 : " + plus.result(10, 20) );
		System.out.println( "빼기 : " + minus.result(30, 10) );
		System.out.println( "곱하기 : " + multi.result(5, 3) );
		
	} // main

}

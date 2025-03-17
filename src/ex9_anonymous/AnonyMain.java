package ex9_anonymous;

import java.util.Random;
import java.util.Scanner;

public class AnonyMain {
	public static void main(String[] args) {
		// 익명 클래스 : 딱 한 번만 쓰고 버릴 객체를 생성할 때 사용하는 이름 없는 클래스의 개념.
		
		int a = new Scanner(System.in).nextInt(); // 익명
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String ss = sc.next();              // 생성자 참조해서 계속 명시해서 사용 -> 익명 X
		
		// 익명 : 변수에 바로 생성자를 입력해서 만드는 것.
		//int random = new Random().nextInt(4);
		
		Random rnd = new Random();  // 명시적 랜덤 생성자 :  
		for(int i = 0; i < 5; i++) {
			int number = new Random().nextInt(5); // 익명
		}
		
		// 명시적 생성자는 메모리 주소를 잡고 있기 때문에 프로그램 종료까지 끝나지 않고 계속 실행
		// 익명은 일시적으로 사용하고 나서는 바로 끝나기 때문에 메모리 자리 차지 하지 않음.
		
		
		
		
		
		
	} // main

}

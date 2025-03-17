package homework;

import java.util.Random;
import java.util.Scanner;

public class HangmanMain {
	public static void main(String[] args) {

		// ***HangMan***
		// word : *****>> v(입력 받음)
		// 포함되어 있지 않습니다.
		// word : ****>> a
		// word : *a**>> a
		// a은(는) 이미 입력한 문자입니다.
		// word : *a** >> 12
		// 한글자의 영 소문자만 입력 가능합니다.
		// word : *a** >> g
		// word : ga** >> e
		// word : ga*e >> m
		// game 정답
		// 7회만에 정답


		String[] strArr = { "game", "doctor", "apple", "hope" };

		String answer = "";

		int ide = new Random().nextInt(strArr.length);
		answer = strArr[ide];

		System.out.println(answer);


		System.out.println("***HangMan***");

		
		Hangman hm = new Hangman();
		hm.hangman(answer);
		
		










	} // main

}

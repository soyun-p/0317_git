package homework;

import java.util.Scanner;

public class Hangman {

	public void hangman( String answer ) {


		System.out.print("Word : ");

		for(int i = 0; i < answer.length(); i++) {
			System.out.print("*");
		}

		Scanner sc = new Scanner(System.in);


		String ansTest = "";

		int cnt = 0;
		int shap = 0;


		out:while( true ) {

			System.out.print(" >> ");
			String input = sc.next();

			// 정답의 각 문자를 입력한 문자와 대조 후 같은 문자만 보이게 출력
			in:for(int i = 0; i < answer.length(); i++) {

				if( input.equals( answer.charAt(i) ) ) {
					ansTest += answer.charAt(i);
				}else {
					ansTest += "*";
					shap++;
				} // if-else


			} // for

			System.out.println(ansTest);


			// 포함되어 있지 않거나 잘못 입력했을 때
			if( input.length() > 1 ) {
				System.out.println("한 글자의 영 소문자만 입력 가능합니다.");
				cnt++;
				continue out;
			}else if( shap == answer.length() ) {
				System.out.println("포함되어 있지 않습니다.");
				cnt++;
				continue out;
			}
			System.out.print("Word : " + ansTest);
			cnt++;
			continue out;









		} // while


		// 정답이 나왔을 때
		/* if( ansTest.equals(answer) ) {
			System.out.println(answer + "정답!");
			System.out.println(cnt + "회만에 정답!");
			break out;
		} */





	} // hangman()

}

package basic;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ifexam {

	public static void main(String[] args) {
		
//		int a = -1;
//		
//		if(a > 0)
//			System.out.println("a는 0보다 큽니다.");
//		System.out.println("여긴 if 실행문이 아닌 main() 실행문 입니다.");
		
		//조건식을 이용해서 아래와 같은 로직을 완성하세요.
		/*
		 * 수 3개를 입력 받습니다.
		 * 출력 결과는 가장 큰 수 부터 출력시키세요.
		 * ex > 4, 1001, 985 --> 결과 : 1001 >= 985 >= 4
		 */
Scanner sc = new Scanner(System.in);
		int fir = Integer.parseInt(JOptionPane.showInputDialog("첫수입력"));
		int sec = Integer.parseInt(JOptionPane.showInputDialog("두번째수입력"));
		int third = Integer.parseInt(JOptionPane.showInputDialog("세번째수입력"));
		int temp;
		
		if(sec>= fir && sec >= third) {
			temp = fir;
			fir = sec;
			sec = temp;
		}else if(third >= fir && third >= sec) {
			temp = fir;
			fir = third;
			third = temp;
		}
		//3번째 수가 2번보다 클 경우.
		if(third >= sec) {
			temp = sec;
			sec = third;
			third = temp;
		}
		System.out.println(fir + " >= " + sec + " >= " + third);
		
	}
}
package basic;
import javax.swing.JOptionPane;

public class FindSum {

	public static void main(String[] args) {
//FindSum.java
		/*두 수를 입력을 받으세요(값의 크기는 상관없음..100,4,4,100)
		 * 두 수의 차이(100,4를 받았을 경우, 차이는 96 입니다.)
		 * 이 차이의 누적합을 구해서 출력하세요
		 */
		int fir = Integer.parseInt(JOptionPane.showInputDialog("첫 수를 입력하세요."));
		int sec = Integer.parseInt(JOptionPane.showInputDialog("두번째 수를 입력하세요."));
	int temp;
	if (fir >= sec) {
		temp = fir;
		fir = sec;
		sec = temp;
	}
	int sum = 0;
	for (int i = fir; i<=sec; i++) {
	sum += i;
	}
	System.out.println("누적합은" + sum);
	}
}
package basic;
import javax.swing.JOptionPane;
import org.graalvm.compiler.lir.aarch64.AArch64PrefetchOp;

public class QuizUseMedhod {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int x = 0;
      while (true) {
         String choice = JOptionPane.showInputDialog(null, "1. 최대값 2. 사이 합 3. 수 나열 4. 종료");
         x = Integer.parseInt(choice);

         if (x == 1) {
            //결과를 return해주는 메서드를 호출하여 값 출력하게끔 아래 메서드를 정의하라
            int res = max();
            System.out.println("두 수 중 최대 수는 : " + res);
         } else if (x == 2) {
            sum2Values(); // 정의하라
         } else if (x == 3) {
            System.out.println("첫번째 수 = ");
            int firstSu = Integer.parseInt(JOptionPane.showInputDialog("첫번째 수 입력"));
            System.out.println("두번째 수 = ");
            int secSu = Integer.parseInt(JOptionPane.showInputDialog("두번째 수 입력"));
            System.out.println("세번째 수 = ");
            int thirdSu = Integer.parseInt(JOptionPane.showInputDialog("세번째 수 입력"));

            String str = printNumSequence(firstSu, secSu, thirdSu);

            JOptionPane.showConfirmDialog(null, "큰 순으로 나열은 \n" + str);
         } else if (x == 4) {
            break;
         } else {
            JOptionPane.showConfirmDialog(null, "잘못 입력했습니다.");
         }
      }
   }

private static String printNumSequence(int a, int b, int c) {
	// TODO Auto-generated method stub
	String str = null;
	
	int temp;
	
	if(b >= a && b >= c) {
		temp = a;
		b = temp;
	}
	
	str = a + " >=" + b + " >= " + c;
	
	return""+str;
	}
}
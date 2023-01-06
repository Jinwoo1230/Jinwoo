package basic;
import java.io.IOException;

import javax.swing.JOptionPane;

/*
		 * 클래스 명은 stu_Score1
		 * 1.프로그램이 시작하면 사람의 이름을 입력받도록 띄우세요(콘솔 or GUI)
		 * 2.입력이 된 후엔 국어점수 입력 하세요 라는 메세지를 띄우고 값을 입력 받으세요
		 * 3.다음엔 영어 점수 입력하세요. 후 2번과 동일
		 * 4.수학 점수 입력 하세요 후 2번과 동일
		 * 5.출력 결과는 아래와 같이
		 * 임진우님 !!! 당신의 성적은 다음과 같습니다.
		 * 총점 : ~ 점
		 * 평균 : ~ 점
		 */
public class StuScore {
	
	public static void main(String[] args) throws IOException {
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		System.out.println(name);

		String kor = JOptionPane.showInputDialog("국어 점수를 입력하세요.");
		int p_kor = Integer.parseInt(kor);
	    System.out.println(kor);

		String eng = JOptionPane.showInputDialog("영어 점수를 입력하세요.");
		int p_eng = Integer.parseInt(eng);
	    System.out.println(eng);

		String math = JOptionPane.showInputDialog("수학 점수를 입력하세요.");
		int p_math = Integer.parseInt(math);
	    System.out.println(math);

	    int sum = p_kor + p_eng + p_math;
	    System.out.println(sum);
	      
	    int ave = sum / 3;
	    System.out.println(ave);
	      
	    JOptionPane.showMessageDialog(null, name + "님, 당신의 성적은 다음과 같습니다. \r\n"+"총점 : "+ sum +"\r\n평균 : "+ ave);
	    
	    /*int kor,eng,math,result;
		 * double avg; 평균변수
		 * kor = Integer.parseInt(JOptionPane.showInputDialog("국어 점수 입력 : "));
		 * eng = Integer.parseInt(JOptionPane.showInputDialog("영어 점수 입력 : "));
		 * math = Integer.parseInt(JOptionPane.showInputDialog("수학 점수 입력 : "));
		 * 
		 * result = kor + eng + math;
		 * avg = result / 3.0;
		 * 
		 * JOptionPane.showInputDialog(null,"당신의 총점 : " + result + "\n평균은 : " + avg );
		 */
	}

}
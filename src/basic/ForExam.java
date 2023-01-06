package basic;
import java.util.Arrays;

public class ForExam {

	public static void main(String[] args) {
		/*main() 의 파라미터인 String[]에 값을 주고 시작해 봅니다.*/
		
		for(int i = 0; i<args.length; i++) {
			
			String str = args[i];
			
			System.out.println(args[i]);
		}
		
		//향상된 for.. jdk 1.5 부터 지원됨.. 특정 그룹데이터의 전체를 다 루프할 때 요긴함
		//자바스크립트의 for in 과 거의 유사함.
		
		for(String str : args)
			System.out.println(str);
		
		for(char ch = 'A'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
		
		//위와 똑같이 나오게 int를 이용해서 해보기
		for(int i = 65; i<=90; i++) {
			System.out.println((char)i);
		}
		
		//구구단 전체 돌기.
		//자바에서만 존재하는 Lable loop
		//loop에 이름(Label 을 주고 호흡하여 제어하는 방법
		outer:for(int i = 2; i<=9; i++) {
//			if(1%2 == 0)//짝수단은 건너뛰기.
//				continue;
			System.out.println(i + "단 시작");
			for(int j = 1; j<=9; j++) {
				
			
			int sum = i * j;
			System.out.println(i + " * " + j + " = " + sum);
		}
		System.out.println(i + "단 끝");
		}
//		int[] intArr = {12,30,27,3,50,107,505};//자바 배열.
//		
//		Arrays.sort(intArr);
//		
//		for(int i=0; i<intArr.length; i++) {
//			System.out.println(intArr[i]);
	}
}
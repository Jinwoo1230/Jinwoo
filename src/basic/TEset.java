package basic;

public class TEset {

	public static void main(String[] args) {
		int[] multiArr[] = new int[3][4];// 기본 배열 객체생성

		String[][] myApt = new String[3][4];
		//
		//myApt[0][4] = "임진우";
		// 값에 접근해봅니다. 다음 for 구문을 이용합니다
		/*
		 * for(int i = 0; i < multiArr.length; i++) {//Outer 배열 접근 //위의 i는 Outer 의
		 * index를 가르키기 때문에 내부적으로도 배열이다. for(int j = 0; j < multiArr[i].length; j++) {
		 * //값을 출력하는 코드를 정의해보세요 System.out.println(multiArr[i][j]);
		 */
		// 생성식 2번 입니다.
		String[] u_Apt[] = { { "임진우", "이지수", "변수철" }, { "박동환", "조기제", "임유섭" } };// {} 갯수가 아파트의 동이 됩니다.
		// 생성식 3번 입니다.
		// 아래의 Data 값 "Z","Y","V","W" 순서대로 변경 후 값을 출력하세요
		String herApt[][] = new String[][] { { "A", "B" }, { "C", "D" } };
		for (int i = 0; i < herApt.length; i++) {
			for (int j = 0; j < herApt[i].length; j++) {
				System.out.println(herApt[i][j]);
			}
		}

		// 동적가변배열 : Outer 의 크기는 생성시 초기화 하고 Inner 의 크기와 값은 동적으로 적용하는 배열입니다.
		char[] stars[] = new char[10][];
		for (int i = 0; i < stars.length; i++) {
			stars[i] = new char[i + 1];
			for (int j = 0; j < stars[i].length; j++) {
				stars[i][j] = '*';
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}

	}
}
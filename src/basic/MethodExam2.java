package basic;
public class MethodExam2 {
	//두개의 int type 정수를 입력 받아서 누가 더 큰 값인지를 리턴하는 메서드를 정의해봅니다.
	
	static int max(int x, int y){
		if(x > y) 
			return x;
		return y;
		
		//int max = 0;
		//return max;
	}

	public static void main(String[] args) {
		//int whichMax = max(10,11);//11
		System.out.println("두 수중 : " + max(10,11) + "이 더 큽니다.");
		
	}
	//메서드 시그니쳐(method signature) :
	//동일명으로 정의한 메서드가 컴파일러가 컴파일시 중복 정의 여부를 판별하는 요소
	//파라미터의 갯수, 타입, 순서 모두가 같은경우 같은 메서드로 인식하여 컴파일 에러 발생됨.
	
	//여러분이 메서드를 같은 이름으로 목적은 같지만  디테일이 조금씩 틀린경우 정의 하였을 때,
	//컴파일러(VM)는 호출하는 메서드의 시그니쳐를 기준으로 해당 메서드를 호출하게 됩니다.
	//해서 아래처럼 동밀명으로 시그니쳐만 틀리게 정의한것을 메서드를 오버로딩(overloading)했다 라고 합니다.
	
	//이번에도 출력 메서드를 정의하는데, 파라미터 순서만 바꿔봅니다.
	static void print(int count, String msg) {
		for(int i = 0; i<count; i++) {
			System.out.println(msg + "출력됨");
	}
}
	
	static void print(String msg, int count) {
//		for(int i = 0; i<count; i++) {
//			System.out.println(msg + "출력됨");
		}
	
	//출력내용을 받아서 출력하는 메서드 정의 합니다.
	static void print(String msg) {
		System.out.println("출력됨");
		System.out.println("출력됨");
		System.out.println("출력됨");
		System.out.println("출력됨");
		System.out.println("출력됨");
	}
	//출력을 하는 메서드 정의 해봅니다. 리턴타입은 void 로 합니다.
	static void print() {
		System.out.println("출력됨");
		System.out.println("출력됨");
		System.out.println("출력됨");
		System.out.println("출력됨");
		System.out.println("출력됨");
	}
}
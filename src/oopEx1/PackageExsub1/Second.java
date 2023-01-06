package oopEx1.PackageExsub1;

import oopEx1.packageEx.First;

public class Second extends First{

	public Second() {
		super("임진우");
	}
	public static void main(String[] args) {
		//다른 패키지에 있는 First 의 생성자를 호출 해봅니다.
		First f1 = new First();
		First f2 = new First("임진우");
	}
}
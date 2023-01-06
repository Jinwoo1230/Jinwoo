package utilex;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/*
 * Set 타입 : Set 타입문 Collection 의 자식타입으로 기본적으로는 List 오 메서드가 동일한게 많음..
 * 특징으론 중복을 허용하지 않는게 있고 또 하난, 검색 기능을 추가한 형태의 API들이 Set 타입에 있습니다.
 * 또한 정렬 기능을 적용한 TreeSet 등도 있습니다.
 * 먼저 간단한 API 사용법부터 확인합니다.
 * HashSet 은 대표적 클래스로 일반적인 Set을 구현할 때 사용하는 클래스입니다.
 */
public class SetExam1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("1");
		set.add("5");
		
		System.out.println(set);
		
		//로또 생성기를 만들어봅시다
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set = new HashSet<String>();
		
		for(int i = 0; set2.size() < 6; i++) {
			int num = (int)(Math.random() * 45) +1;
			set.add(Integer.toString(num));
		}
		System.out.println(set2);
		
		//API를 보고 위에 Set을 List Type 으로 요소를 가진 애들로 변경하고
		//Collections 클래스에 보면 List 파라미터로 받아서 정렬을 해주는 메서드가 있습니다.
		//그걸 이용해서 위 생성된 로또 번호를 정렬후 출력해보세요.
		
		List<Integer> list = new LinkedList<Integer>(set2);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
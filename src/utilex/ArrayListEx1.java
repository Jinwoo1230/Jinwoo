package utilex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * 순서를 유지하고, 중복을 허용하는 List type 의 대표적 클래스인 ArrayList에 대해서 알아봄
 */
public class ArrayListEx1 {
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 --> " + list1);
		System.out.println("list2 --> " + list2);
		System.out.println();
	}

	public static void main(String[] args) {
		//다행성을 이용한 ArrayList 생성법
		//List list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		//collection list3 = new ArrayList();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(1);
		list2.add(5);
		list2.add(2);
		list2.add("1");
		
		//list2 의 일정부분을 분리해서 새로운 ArrayList를 생성해 봅니다.
		//ArrayList list3 = (ArrayList)list2.subList(1, 4);
		ArrayList list3 = new ArrayList(list2.subList(1, 4));
		
		print(list2,list3);
		
		//add() 를 이용해서 추가를 해볼게요
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		
		print(list2,list3);
		
		list2.set(3, "KKK");
		print(list2,list3);
		
		//retainAll --> 겹치는 부분만 남기고 삭제.
		list2.retainAll(list3);
		print(list2,list3);
		
		//정렬을 시켜볼게요.. 기본적으로  Collections 클래스에는
		//이런 cCOLAD
	}
}
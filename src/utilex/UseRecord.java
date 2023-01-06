package utilex;

public class UseRecord {

	public static void main(String[] args) {
		Member member = new Member("jason", "임진우", 25);
		Member member2 = new Member("choi", "조기제", 31);
		
		System.out.println(member.age());
		System.out.println(member.name());
		System.out.println(member.id());
		
		System.out.println(member2.id());
		System.out.println(member2.name());
		System.out.println(member2.age());
		
		System.out.println(member.toString());
		System.out.println(member.hashCode());
		System.out.println(member2.toString());
		System.out.println(member2.hashCode());
		
		System.out.println(member.equals(member2));
	}
}
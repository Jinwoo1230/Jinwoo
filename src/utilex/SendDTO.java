package utilex;

import java.util.ArrayList;

import oopEx1.Medic;

/*
 * 이 클래스는 필요한 DTO 객체를 필요한만큼 생성해서 List Type 으로 DAO 에게 보내는 역할을 합니다.
 */
public class SendDTO {

	public static void main(String[] args) {
		
		StudentDTO dto = new StudentDTO();
		dto.setNumber(1);
		dto.setGroup(2);
		dto.setName("조기제");
		dto.setTel("010-1111-1111");
		
		StudentDTO dto1 = new StudentDTO();
		dto.setNumber(2);
		dto.setGroup(2);
		dto.setName("임유섭");
		dto.setTel("010-2222-2222");
		
		StudentDTO dto2 = new StudentDTO();
		dto.setNumber(3);
		dto.setGroup(2);
		dto.setName("심지석");
		dto.setTel("010-3333-3333");
		
		StudentDTO dto3 = new StudentDTO();
		dto.setNumber(4);
		dto.setGroup(2);
		dto.setName("조정기");
		dto.setTel("010-4444-4444");
		
		StudentDTO dto4 = new StudentDTO();
		dto.setNumber(5);
		dto.setGroup(2);
		dto.setName("윤태종");
		dto.setTel("010-5555-5555");
		
		StudentDTO dto5 = new StudentDTO();
		dto.setNumber(6);
		dto.setGroup(2);
		dto.setName("임진우");
		dto.setTel("010-6666-6666");
		
		//Generic 을 이용해서 Element Type 을 제한합니다.
		
		ArrayList<StudentDTO> members = new ArrayList<StudentDTO>();
		members.add(dto);
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		members.add(dto4);
		members.add(dto5);
		
		//DAO 의 특정 메서드에 이 정보를 보냅니다.
		//메서드 이름은 putDtos(ArrayList<StudentDTO> list) 형태가 됩니다.
		StudentDAO dao = StudentDAO.getInstance();
		dao.putDtos(members);
	}
}
package GawiBawiBo;

import javax.swing.JOptionPane;

public class MemberDTO {

	public String mem_Email;
	
	public MemberDTO() {
		inputEmail();
		new GawiGame();
	}
	
	//메서드 리턴을 void로 했는데, 예시 끝난 후 로직상 변경해야 할겁니다.
	private void inputEmail() {
		this.mem_Email = JOptionPane.showInputDialog("주인님, Email을 입력해주세요 !");
	}
	public String getMem_Email() {
		return mem_Email;
	}
}
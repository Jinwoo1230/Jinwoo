package lengthEx;

import javax.swing.JOptionPane;

public class Stringtti {

	public static void main(String[] args) {
/*
* 사용자의 이메일을 입력 받아서 아래의 조건에 맞게 출력해보세요. 
* 1. ID(Email) 입력하세요 
* 2. 입력 후 빈 문자열인지 검사하세요.
* 3.빈 문자열이 아닌경우 아래처럼 검사하세요 
* 3-1 ID 와 서버로 분리하여 ID 를 검증(idValidate()) 하시는데 길이는 8~12 자 사이여야 하고 반드시 첫자는 대문자여야 합니다.
* 또한 ID 중에는 반드시 숫자가 하나 이상이어야 합니다. 
* 만약 위의 조건이 틀린경우, 뭐가 틀렸는지 메세지를 띄우고, 모든 정상이면 사용자에게 로그인 되었습니다 라고 출력시키세요.
*/
		String email;
		email = JOptionPane.showInputDialog(null, "Eamil을 입력하세요.");
		
		if(email.isEmpty()) {
			JOptionPane.showMessageDialog(null,"값이 잘못 입력되었습니다.");
			
		}
	}
}
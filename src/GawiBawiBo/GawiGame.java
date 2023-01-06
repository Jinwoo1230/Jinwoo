package GawiBawiBo;
import javax.swing.JOptionPane;

public class GawiGame {
	Finish Fns;
	String msg;
	String com;
	int playCount;
	int win;
	int lose;
	int draw;
	String[] theMessage;
	
	public GawiGame() {
		int start = JOptionPane.showConfirmDialog(null, "저랑 가위바위보 해주실래요 ?", "컴퓨터",JOptionPane.YES_NO_OPTION);
		if(start == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "아쉽네요.. 다음엔 꼭 놀아주세요 !");
		return;
		}else {
			que();
		}
	}
	
	public void que() {
		theMessage = new String[] {"가위,바위,보 중에 하나를 내세요 !"};
		msg = JOptionPane.showInputDialog(theMessage[0]);
		if(!this.msg.equals("가위")&&!this.msg.equals("바위")&&!this.msg.equals("보")) {
			JOptionPane.showMessageDialog(null, "가위, 바위, 보 중에 하나를 내주셔야해요 ㅠㅠ");
			que();
		}else {
			playGame();
		}
	}
	private void playGame() {
		int computer = (int)(Math.random()*3);
		if(msg.equals("가위")) {
			if(computer == 0) {
				JOptionPane.showMessageDialog(null, "축하해요 ! 주인님이 이겼어요.");
				win++; playCount++;
			}else if(computer == 1) {
				JOptionPane.showMessageDialog(null, "오우, 비겼는데요 ?");
				draw++; playCount++;
			}else {
				JOptionPane.showMessageDialog(null, "아쉽네요 ㅠㅠ 주인님이 졌어요.");
				lose++; playCount++;
			
			}
		}
		if(msg.equals("바위")) {
			if(computer == 0) {
				JOptionPane.showMessageDialog(null, "축하해요 ! 주인님이 이겼어요.");
				win++; playCount++;
			}else if(computer == 1) {
				JOptionPane.showMessageDialog(null, "오우, 비겼는데요 ?");
				draw++; playCount++;
			}else {
				JOptionPane.showMessageDialog(null, "아쉽네요 ㅠㅠ 주인님이 졌어요.");
				lose++; playCount++;
				}
			}
		if(msg.equals("보")) {
				if(computer == 0) {
					JOptionPane.showMessageDialog(null, "축하해요 ! 주인님이 이겼어요.");
					win++; playCount++;
				}else if(computer == 1) {
					JOptionPane.showMessageDialog(null, "오우, 비겼는데요 ?");
					draw++; playCount++;
				}else {
					JOptionPane.showMessageDialog(null, "아쉽네요 ㅠㅠ 주인님이 졌어요.");
					lose++; playCount++;
		}
	}re();
}
		public void re() {
			theMessage = new String[] {"[1] : 뉴게임 [2] : 전적보기 [3] : 게임종료"};
			msg = JOptionPane.showInputDialog(theMessage[0]);
			if(!this.msg.equals("1")&&!this.msg.equals("2")&&!this.msg.equals("3")) {
				JOptionPane.showMessageDialog(null, "메뉴를 확인하시고 다시 입력해주세요!");
					re();
			}else if(msg.equals("1")) {
				que();
			}else if(msg.equals("2")) {
				Fns = new Finish(this);
			}else if(msg.equals("3")) {
				JOptionPane.showMessageDialog(null,"재밌었어요 주인님, 나중에 또 놀아주세요!");
					System.exit(0);
	}
}
public void setPlayc(int playC) {
	this.playCount = playC;
	}
public void setWin(int win) {
	this.win = win;
}
public void setDraw(int draw) {
	this.draw = draw;
}
public void setLoss(int lose) {
	this.lose = lose;
}
public int getwin() {
	return win;
}
public int getdraw() {
	return draw;
}
public int getlose() {
	return lose;
}
public int getplayC() {
	return playCount;
	}
}
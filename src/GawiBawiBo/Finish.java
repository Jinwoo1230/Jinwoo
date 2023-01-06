package GawiBawiBo;

import javax.swing.JOptionPane;

public class Finish {
	
	GawiGame last;
	
	public Finish(GawiGame last) {
		this.last = last;
		record();
	}
	public void gwdlp() {		
		
		last.getwin();
		last.getdraw();
		last.getlose();
		last.getplayC();
	}

public void record() {
	JOptionPane.showMessageDialog(null,"주인님의 전적은 : \n 이기셨어요 : " + last.getwin() + "\n 지셨어요 : " + last.getlose()
			+ "\n 비기셨어요 : " + last.getdraw() + "\n 총 놀아주신 판은 : " + last.getplayC());
}
}
	//전적은 지금까지 전적은 몇승 : 몇무 : 몇패 : 이렇게 출력됩니다.)

package oopEx1.threadEx;

public class DemonThreadEx implements Runnable{
	//run() 이 구현할 저장 내용을 5초마다 확인할 수 있는 flag 를 선언합니다.
	static boolean autoSave = false;
	public static void main(String[] args) {
		Thread t = new Thread(new DemonThreadEx());
		
		//데몬쓰래드로 설정합니다.
		t.setDaemon(true);
		t.start();
		
		//main 쓰래드가 할 일을 정의합니다. 즉 부모쓰래드가 할 일을 정의합니다.
		for(int i = 0; i<=20; i++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
			//5초마다 저장쓰래드가 flag 확인하여 저장 기능을 수행합니다.
			if(i % 5 ==0)
				autoSave = true;
		}
		System.out.println("메인 종료됨.(부모 쓰래드 종료)");
	}

	//아래의 run()은 무한루프를 돌면서 5초마다 자동 저장됨 이라는 메세지를 출력하도록 정의 합니다.
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(2 * 1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(autoSave == true)
				autoSave();
		}
	}

	private void autoSave() {
		System.out.println("작업 내용이 자동 저장되었습니다.");
		
	}
}
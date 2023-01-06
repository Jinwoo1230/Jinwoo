package oopEx1.threadEx;
/*
 * run() 내부의 로직이 의미없는 (연산을 하지 않는) 반복 작업을 수행시엔 yeild() 를 호출하여
 * 자신을 대기 상태로 전화 하도록 하고, 타 쓰래드에게 CPU 점유를 양보하도록 제어하는 메서드입니다.
 * 
 * join()과 다른점은 join()은 외부에서 호출하는 형태로 제어를 하지만,
 * Yield() 는 로직 내부에서 직접 제어하는 형태입니다. 즉 루프등의 조건에 따라서
 * Yield() 를 호출 하도록 하는겁니다.
 */

import sun.jvm.hotspot.utilities.WorkerThread;

//아래는 무한 루프를 돌면서 조건에 따라 연산 or 로직없음을 반복하는 쓰레드를 정의합니다
class workerThread extends Thread{
	public boolean work = true;
	
	public WorkerThread(String name) {
		setName(name);
	}
@Override
	while(true) {
		if(work) {//상태값에 따른 투표 분기작업.. 즉, work가 true 시에만 연란을 한다.
			System.out.println(getName() + " 쓰래드가 연산을 수행함.");
		}else {
			//이 조건에서는 아무것도 할 게 없으니, 다른 쓰래드에게 CPU 점유를 양보함
			Thread.yield();
		}
	}
}
public class YieldThreadEx {

	public static void main(String[] args) {
		/*
		 * WorkerThread 2개를 생성해서 하나에게는 루프의 flag 값을 false 로 주고
		 * 이후에 경쟁쓰래드가 CPU 를 접유하는 상황을 보세요. 이후 다시 flag 를 True
		 * 로 주면 다시 경쟁 상태로 넘어가게 됩니다. 이렇게 되는 이유는 내부적으로 yieid() 를 호출해서 입니다. 
		 */
		
		WorkerThread wThread1 = new WorkerThread("워커1");
		WorkerThread wThread2 = new WorkerThread("워커2");
		
		wThread1.start();
		wThread2.start();
		
		try {
			Thread.sleep(10000);
			wThread.work = true;
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}		
}
package ioex;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutEx {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			
			//버퍼의 크기를 5로 지정한 스트림 생성
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			
			//파일에 데이터 쓰기.
			for(int i = '1'; i<='9'; i++) {
				bos.write(i);
			}
			
			bos.close();
		}catch (Exception e) {
			
		}
	}
}
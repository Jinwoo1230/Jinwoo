package ioex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class PrintWirterExam {

	public static void main(String[] args) {
		File file = new File("D:\\full stack_work\\myjava\\src\\basic\\ArrayExam.java");
		
		FileReader fr = null;
		BufferedReader br = null;
		LineNumberReader lr = null;
		PrintWriter pw = null;
		
		String msg = null;
		int readData;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			lr = new LineNumberReader(br);
			
			String msg2;
			
			while((msg2 = lr.readLine()) != null) {
				pw.println(pw);
			}
		}catch (Exception e) {
			
		}
	}
}
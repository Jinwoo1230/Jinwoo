package ioex;

import java.io.File;

import java.io.FileOutputStream;

public class Makemydata {

	public static void main(String[] args) {
		
		byte j = 100;
		
		String fileName = "dlawlsdn.text";
		File f = null;
	    FileOutputStream fis = null;
	    
	    try {
	    	f = new File(fileName);
	        fis = new FileOutputStream(f);
	        
	        
	        fis.write(j);
	        fis.close();
	       
	        System.out.println("완료");
	    }catch (Exception e) {
				
		}
	}
}
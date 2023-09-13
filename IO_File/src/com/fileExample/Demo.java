package com.fileExample;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		File f = new File("mohan.txt");
		boolean fstatus = f.createNewFile();
		System.out.println(fstatus);
		
		File f1 = new File ("naveen.txt");
		f1.createNewFile();
		
		File f2 = new File("sanjay");
		boolean f2status = f2.mkdir();
		System.out.println(f2status);
		
		File f3 = new File(f2,"teja.txt");
		f3.createNewFile();
		
		
	}

}

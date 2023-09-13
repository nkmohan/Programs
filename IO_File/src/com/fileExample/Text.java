package com.fileExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Text {
	public static void main(String[] args) {
		String filename = "C:\\Users\\Dell\\Documents\\workspace-spring-tool-suite-4-4.18.1.RELEASE\\IO_File\\file1.txt";
		try {
			int characterCount = 0;
			int wordCount = 0;
			int lineCount = 0;
			
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			
			String line;
			BufferedReader bufferedReader = null;
			while ((line = bufferedReader.readLine()) != null) {
				lineCount++;
				characterCount += line.length();
				
				String[] words = line.trim().split("\\s+");
				wordCount += words.length;
			}
			bufferedReader.close();
			
			System.out.println("Number of characters: "+ characterCount);
			System.out.println("Number of words : "+ wordCount);
			System.out.println("Number of lines : "+ lineCount);
			
		} catch (IOException e) {
		System.err.println("Error reading the files : "+e.getMessage());
		
		}
	}

}

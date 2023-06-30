package day23.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStreamEx1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			/* test.txt는 상대 경로. 기준은 프로젝트 폴더가 기준			 * 
			 * */
			fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}

	}

}

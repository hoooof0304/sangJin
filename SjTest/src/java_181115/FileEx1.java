package java_181115;

import java.io.*;

public class FileEx1 {

	public static void main(String[] args) {
		// 텍스트 파일을 생성해서 내용을 채우기
		String path = "J:\\Test\\testfile.txt";

		// 파일 객체 생성
		File file = new File(path);

		// 바이트 단위로 파일을 쓰기 위해 FileWriter 스트림 생성
		// 한글은 처리되지 않음
		try {
			FileWriter fw = new FileWriter(file);
			for (int i = 'A'; i <= 'Z'; i++) {
				fw.write(i);
			}
			fw.close();
			System.out.println("쓰기 완료");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

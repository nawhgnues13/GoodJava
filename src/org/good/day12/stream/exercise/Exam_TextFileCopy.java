package org.good.day12.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {

	public static void main(String[] args) {
		// c:\\windows\\system.ini 을 복사해서
		// c:\\Temp\\system.txt 로 만들어주세요. 단 문자기반 스트림을 사용하세요.
		Reader reader = null;
		Writer writer = null;
		String src = "C:\\windows\\system.ini";
		String dest = "C:\\Temp\\system.txt";

		try {
			reader = new FileReader(src);
			writer = new FileWriter(dest);
			char[] cBuf = new char[1024];
			int readCharCount;
			while ((readCharCount = reader.read(cBuf)) != -1) {
				writer.write(cBuf, 0, readCharCount);
				writer.flush(); // 버퍼비우기 꼭 써주기
			}
			System.out.println("복사 완료되었습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

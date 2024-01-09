package org.good.day12.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {
		OutputStream os = null;

		try {
			os = new FileOutputStream("src/org/good/day12/stream/outputstream/writing3.txt");
			byte[] data = "마지막 입출력".getBytes();
			// 한글은 3바이트이기 때문에 길이 3으로 해야 한 글자가
			// 한글 2글자가 나오게 하고 싶으면 길이를 6
			os.write(data, 0, 13);
			os.flush();
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

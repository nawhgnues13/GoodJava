package org.good.day12.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;

		try {
			is = new FileInputStream("src/org/good/day12/stream/inputstream/reading.txt");
			int readByteCount;
			byte[] readBytes = new byte[3];
			String result = "";
			while (true) {
				readByteCount = is.read(readBytes);
				if (readByteCount == -1)
					break;
				// 바이트 배열과 개수를 넘겨주면 문자열로 만들어주는
				// String 생성자를 통해 문자열로 만들어줌(바이트 배열, 시작하는 위치, 길이)
				// 읽는 데이터가 누적될 수 있도록 +=으로 만들어줌
				// 복합대입연산자 사용
				result += new String(readBytes, 0, readByteCount);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

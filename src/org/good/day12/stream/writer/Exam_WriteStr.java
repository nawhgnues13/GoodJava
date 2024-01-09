package org.good.day12.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {

	public static void main(String[] args) {
		Writer writer = null;

		try {
			writer = new FileWriter("src/org/good/day12/stream/writer/writing3.txt");
			String data = "JDB/JSP/Servlet";
			writer.write(data);
			writer.flush();
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

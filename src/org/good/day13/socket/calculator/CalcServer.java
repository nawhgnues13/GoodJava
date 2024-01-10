package org.good.day13.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다...");
			Socket socket = serverSocket.accept();
			System.out.println("연결이 완료되었습니다."); // 서버의 소켓이 만들어짐
//			is = new FileInputStream(""); // 생성해서 쓰는게 아니라
			is = socket.getInputStream(); // socket 객체 내의 스트림을 사용함
			// os = new FileOutputStream(""); // 생성해서 쓰는게 아님
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			////////////////// 보낸 값 받아서 출력하기//////////////////
			String recvMsg = dis.readUTF();
			System.out.println(recvMsg);
//			int readByteCount;
//			byte[] readBytes = new byte[1024];
//			readByteCount = is.read(readBytes);
//			String result = new String(readBytes, 0, readByteCount);
//			System.out.println(result);
			/////////////////////////////////////////////////////////////
			// 입력한 값에 따라서 +, -, *, /, %
			// 연산한 후 결과를 저장하는 코드 작성
			String[] strs = recvMsg.split(" ");
			int num1 = Integer.parseInt(strs[0]);
			int num2 = Integer.parseInt(strs[2]);
			char op = strs[1].charAt(0);
			int result = 0;
			switch (op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			}

			dos.writeUTF(Integer.toString(result)); // 계산한 결과 값
			dos.flush();
//			result = "66";
//			byte[] data = result.getBytes();
//			os.write(data);
//			os.flush();
			////////////////////////////////////////////////////////
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

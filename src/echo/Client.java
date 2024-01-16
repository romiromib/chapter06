package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException{
		
		Socket socket = new Socket();
		
		System.out.println("<클라이언트 시작>");
		System.out.println("=======================");
		
		System.out.println("[서버에 연결을 요청합니다]");
		socket.connect(new InetSocketAddress("192.168.0.31",10001));

		System.out.println("[서버에 연결 되었습니다]");
		
		//메세지 보내기
		
		//out
		//OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-copy.txt");//빨대 꽂는 순간 리셋됨.다 삭제되서 없어짐->파일이름수정-copy
		//OutputStreamWriter osw = new OutputStreamWriter(out,"MS949");
		//BufferedWriter bw = new BufferedWriter(osw);
		
		//OutputStream out = new FileOutputStream("C:\\javaStudy\\song.txt");
		//메세지 보내기용 스트림
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//메세지 받기용 스트림
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//메세지 보내기
		bw.write(str);
		bw.newLine();
		bw.flush();//강제로 보냄
		
		//메세지 받기용
		String reMsg = br.readLine();
		System.out.println("server: ["+reMsg+"]");
		br.close();
		
		socket.close();
	}

}

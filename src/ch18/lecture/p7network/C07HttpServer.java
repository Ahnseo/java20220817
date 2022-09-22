package ch18.lecture.p7network;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C07HttpServer {
	public static void main(String[] args) {
		// Http : HyperText transfer protocol

		// Server 이니까 항상 실행중이여야 한다.

		try (ServerSocket server = new ServerSocket(8000);
				Socket socket = server.accept();

				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);

				// 한줄씩쓰는 라이트
				PrintWriter pw = new PrintWriter(bos);

		) {

			// ResponceMessage
			String data = "<h>내일부터 jsp 책 가져오세요.</h>";

			pw.println("HTTP/1.1 200 OK");
			pw.println("Content-Type: text/html; charset=utf-8");
			pw.println("Content-Length: " + data.getBytes().length);
			pw.println();
			pw.println(data);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("서버 실행 중");
		//웹브라우저 검색창에 검색 : (내 컴퓨터 ip 주소 + :포트숫자) http://172.30.1.51:8000/
	}
}

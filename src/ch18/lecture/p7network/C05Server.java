package ch18.lecture.p7network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C05Server {
	public static void main(String[] args) {
		// Client -> Server 이미지를 전송하고 전송받는 서버를 만들어보자
		System.out.println("연결을 기다리는 중...");
		try (
				ServerSocket serverSocket = new ServerSocket(55000);
			){
			int count = 0;
			while (count < 100) {
				count++;
				Socket socket = serverSocket.accept();

				Thread thread = 
					new Thread(() -> {
						
					String remoteAddress = socket.getRemoteSocketAddress().toString();
					String clientIpAddress = remoteAddress.substring(0, remoteAddress.indexOf(":"));
					String folder = "C:\\Users\\user\\Desktop\\output\\clientIpImgs";
					String FileName = folder + clientIpAddress + ".jfif";

					try (
							InputStream is = socket.getInputStream();
							BufferedInputStream bis = new BufferedInputStream(is);
							FileOutputStream fos = new FileOutputStream(FileName); // 조건중에, 파일이름만 출력해보기
							BufferedOutputStream bos = new BufferedOutputStream(fos);
						){
						byte[] byteBuffer = new byte[1000];
						int len = 0;
						int fileSize = 0;
						while ((len = bis.read(byteBuffer)) != -1) {
							bos.write(byteBuffer, 0, len);
							fileSize += len;
						}
						bos.flush();
						System.out.print(clientIpAddress + "으로 부터 ");
						System.out.println(fileSize + "byte 크기의 파일을 받았습니다.");

						if (socket != null) {
							socket.close();
						}

					}catch (Exception e) {
						e.printStackTrace();
					}
				});

				thread.start();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

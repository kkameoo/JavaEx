package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "primitives.txt";
	
	public static void main(String[] args) {
//		WriterPrimitives();
		readPrimitives();
	}
	
	private static void WriterPrimitives() {
		try (
			OutputStream fos = new FileOutputStream(filename);
			DataOutputStream dos = new DataOutputStream(fos);
		) {
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(27);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("고길동");
			dos.writeBoolean(false);
			dos.writeInt(40);
			dos.writeFloat(99.9f);
			
			dos.writeUTF("전우치");
			dos.writeBoolean(true);
			dos.writeInt(32);
			dos.writeFloat(68);
			
			System.out.println("파일이 저장되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private static void readPrimitives() {
		try (
			InputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);
		) {
			// 주의 : 출려된 순서대로 읽어와야 함
			
			for (int i = 0; i < 3; i++) {
				String s = dis.readUTF();
				Boolean b = dis.readBoolean();
				Integer val = dis.readInt();
				Float f = dis.readFloat();
				System.out.printf("%s : %b : %d : %f%n",s, b, val, f);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

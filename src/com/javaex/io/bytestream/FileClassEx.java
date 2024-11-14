package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class FileClassEx {
// 프로젝트 내의 files 디렉토리 위치
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 객체 생성
		File root = new File(rootPath);
		// 이 파일은 존재하는가?
		System.out.println(rootPath + " : " + root.exists());
		
		if (!root.exists()) {
			root.mkdir(); // 디렉토리 생성
			System.out.println(rootPath + "를 생성했습니다.");
		} else {
			System.out.println(rootPath + "는 이미 있는 디렉토리입니다.");
		}
		
		File subdir = new File(rootPath + "subdir");
		if (!subdir.exists()) {
			if(subdir.mkdir()) {// subdir 생성
				System.out.println(subdir + "을 생성했습니다.");
			} else {
				System.out.println(subdir + "을 생성하지 못했습니다.");
			}
		}
		// rootPath 내부에 새파일 생성
		File file = new File(rootPath + "myfile.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.err.println("파일을 만들지 못했음");
			}
		}
		// 파일 지우기
		file.delete();
		
		printInfo(root);
	}
	
	private static void printInfo(File file) {
		System.out.println("----------------");
		
		if (file.isDirectory()) {
			// 디렉토리
			System.out.println("Directory : " + file.getName());
			File[] files = file.listFiles();
			
			for (File f : files) {
				printInfo(f);
			}
		} else {
			// 파일
			System.out.print(file.canRead() ? "r"  : ".");
			System.out.print(file.canWrite() ? "w" : ".");
			System.out.print(file.canExecute() ? "x" : ".");
			
			System.out.println(" "  + file.getName() + "\t");
			System.out.println(file.length());
		}
	}

}

package com.javaex.practice06.ex07;

public class SmartPhone extends MusicPhone{
	
	@Override
	public void execute(String str) {
			
		if ("음악".equals(str)) {
			playMusic();
		}  else {
			super.execute(str);
		} 
	}
	
	public void playMusic() {
		System.out.println("다운로드해서 음악시작");
	}
	
}

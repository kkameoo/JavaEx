package com.javaex.practice06.ex07;

public class MusicPhone extends Phone{
	
	public MusicPhone() {}
		
	@Override
	public void execute(String str) {
			
		if ("음악".equals(str)) {
			playMusic();
		}  else {
			super.execute(str);
		} 
	}
		
	public void playMusic() {
		System.out.println("Mp3플레이어에서 음악재생");
	}
}
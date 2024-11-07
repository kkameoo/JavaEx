package com.javaex.oop.tv.v1;

import java.text.Format;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public TV() { }
	
	public void power(boolean on) {
	
		String message = "";
		this.power = on ? true : false;
		message += on ? "전원을 켭니다." : "전원을 끕니다.";
		System.out.println(message);
	}
	
	public void channel(int channel) {
		this.channel = channel;
		System.out.println("채널을 " + this.channel + "번으로 바꿉니다.");
	}
	
	public void channel(boolean up) {
		String message = "";
		this.channel +=  up ? 1 : -1;
		message += up ? "채널을 높입니다." : "채널을 낮춥니다.";
		System.out.println(message + " 채널 : " + this.channel);
	}
	
	public void volume(int volume) {
		this.volume = volume;
		System.out.println("소리 크기를 " + this.volume + "(으)로 바꿉니다.");
	}
	
	public void volume(boolean up) {
		String message = "";
		this.volume +=  up ? 1 : -1;
		message += up ? "소리를 높입니다." : "소리를 낮춥니다.";
		System.out.println(message + " 소리 크기 : " + this.volume);
	}
	
	public void status() {
		String message = "";
		System.out.println("-------------------------");
		System.out.println("현재 채널 : " + this.channel);
		System.out.println("현재 소리 크기 : " + this.volume);
		message += this.power ? "켜짐" : "꺼짐";
		System.out.println("전원 상태 : " + message);
		System.out.println("-------------------------");
	}
	
}

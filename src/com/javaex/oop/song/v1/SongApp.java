package com.javaex.oop.song.v1;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song iu = new Song("좋은날", "아이유", "Real", "이민수", 2010, "3번 track");
		Song gd = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", 2007, "2번 track");
		Song bsk = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", 2012, "4번 track");
		iu.showInfo();
		gd.showInfo();
		bsk.showInfo();
		
	}

}

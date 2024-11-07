package com.javaex.practice05.ex03;

public class Song {
		
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
		
	public Song() {
		System.out.println("Song(파라미터 0개)");
	}
	
	public Song(String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song(파라미터 5개)");
	}
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer, year);
		this.track = track;
		System.out.println("Song(파라미터 6개)");
	}
				
}
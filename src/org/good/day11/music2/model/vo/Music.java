package org.good.day11.music2.model.vo;

//Comparable 이라는 인터페이스
public class Music implements Comparable<Music> {
	private String title;
	private String singer;

	public Music() {
	}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [제목=" + title + ", 가수명=" + singer + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.singer + this.title).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Music) {
			Music music = (Music) obj;
			return this.hashCode() == music.hashCode();
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Music o) {
		// TODO Auto-generated method stub
		return this.title.compareTo(o.getTitle());
	}

}

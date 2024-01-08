package org.good.day11.music.controller;

import java.util.ArrayList;
import java.util.List;

import org.good.day11.music.model.vo.Music;

public class MusicController {
	List<Music> mList;

	public MusicController() {
		mList = new ArrayList<Music>();
	}

	public void addMusicFirst(Music music) { // 목록 맨 앞에 곡 추가
		mList.add(0, music);
	}

	public void addMusic(Music music) { // 목록 맨 뒤에 곡 추가
		mList.add(music);
	}

	public void deleteMusic(int index) { // 인덱스로 곡 삭제
		mList.remove(index);
	}

	public void modifyMusic(int index, Music music) { // 인덱스로 곡 수정
		mList.set(index, music);
	}

	public int findIndexbyTitle(String title) { // 곡명으로 인덱스값 찾기
		for (int i = 0; i < mList.size(); i++) {
			if (title.equals(mList.get(i).getTitle())) {
				return i;
			}
		}
		return 0;
	}

	public Music findMusicbyIndex(int index) { // 인덱스값으로 곡 찾기
		return mList.get(index);
	}

	public List<Music> findAllMusics() { // 곡 전체 출력을 위한 리스트 반환
		return mList;
	}

}

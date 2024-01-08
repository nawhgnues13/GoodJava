package org.good.day11.music2.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.good.day11.music2.model.DescTitle;
import org.good.day11.music2.model.vo.Music;

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

	public void sortByTitle() {
		// TODO Auto-generated method stub
		// 정렬 대상이 정수배열이면 이렇게 하면 됨, 근데 아님
//		for (int i = 0; i < nums.length - 1; i++) {
//			for (int j = 0; j < nums.length - 1 - j; j++) {
//				if (nums[j] > nums[j + 1]) {
//					int temp = nums[j + 1];
//					nums[j + 1] = nums[j];
//					nums[j] = temp;
//				}
//			}
//		}
		// 정렬 대상은 Music의 인스턴스임
		for (int i = 0; i < mList.size(); i++) {
			for (int j = 0; j < i; j++) {
				Music mOne = mList.get(i);
				Music mTwo = mList.get(j);
				if (mOne.compareTo(mTwo) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(j, temp);
				}
			}
		}
	}

	public void sortByTitleDESC() {
		// mList만 전달하면 오름차순이지만
		// 내림차순의 경우 클래스가 필요
		Collections.sort(mList, new DescTitle());

	}
}

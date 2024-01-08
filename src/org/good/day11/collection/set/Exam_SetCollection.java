package org.good.day11.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.good.day11.music.model.vo.Music;

public class Exam_SetCollection {

	public static void main(String[] args) {
		// Collection에는 List, Set, Map
		// Set
		Set<Music> musicSet = new HashSet<Music>();
		musicSet.add(new Music("비의 랩소디", "임재현"));
		musicSet.add(new Music("Drama", "aespa"));
		musicSet.add(new Music("인사", "범진"));
		musicSet.add(new Music("에피소드", "이무진"));
		musicSet.add(new Music("인사", "범진"));
		Iterator<Music> it = musicSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	public static void strSetSample() {
		// Collection에는 List, Set, Map
		// Set
		Set<String> strSet = new HashSet<String>();
		strSet.add("춘식이");
		strSet.add("라이언");
		strSet.add("제이지");
		strSet.add("무지");
		strSet.add("콘");
		strSet.add("춘식이");
		Iterator<String> it = strSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

}

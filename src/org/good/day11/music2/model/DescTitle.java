package org.good.day11.music2.model;

import java.util.Comparator;

import org.good.day11.music2.model.vo.Music;

public class DescTitle implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareTo(o2.getTitle()) * -1;
	}

}

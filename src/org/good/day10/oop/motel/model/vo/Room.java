package org.good.day10.oop.motel.model.vo;

public class Room {
	private boolean isAvailable; // 방이 찼는지

	public Room() { // 룸 생성 시 방이 비어 있는채로 생성
		isAvailable = false;
	}

	public Room(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}

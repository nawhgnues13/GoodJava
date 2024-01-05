package org.good.day10.oop.motel.controller;

import java.util.ArrayList;
import java.util.List;

import org.good.day10.oop.motel.model.vo.Room;

public class MotelController {
	// * VO 없이 할 수도 있음
	List<Boolean> rooms;
	// * with VO - Room
	List<Room> motel;

	public MotelController() {
		rooms = new ArrayList<Boolean>();
		motel = new ArrayList<Room>();
		for (int i = 0; i < 10; i++) { // 룸 10개 생성
			rooms.add(false);
			motel.add(new Room());
		}
	}

	public void checkIn(int roomNum) { // 입실
		rooms.set(roomNum - 1, true);
		motel.set(roomNum - 1, new Room(true));
	}

	public void checkOut(int roomNum) { // 퇴실
		rooms.set(roomNum - 1, false);
		motel.set(roomNum - 1, new Room(false));
	}

	public boolean checkRoom(int roomNum) { // 룸의 상태 반환
		return motel.get(roomNum - 1).isAvailable();
	}

	public List<Room> printAllRooms() { // 룸 전체 출력위한 모텔 반환
		return motel;
	}
}

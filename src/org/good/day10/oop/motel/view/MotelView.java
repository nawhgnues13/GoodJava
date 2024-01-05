package org.good.day10.oop.motel.view;

import java.util.List;
import java.util.Scanner;

import org.good.day10.oop.motel.controller.MotelController;
import org.good.day10.oop.motel.model.vo.Room;

public class MotelView {
	MotelController mController;

	public MotelView() {
		mController = new MotelController();
	}

	public void launchProgram() {
		end: for (;;) {
			int choice = this.printMainMenu();
			switch (choice) {
			case 1:
				checkIn();
				break;
			case 2:
				checkOut();
				break;
			case 3:
				printAllRooms();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break end;
			}
		}
	}

	public int printMainMenu() { // 메인메뉴 출력
		System.out.println("모텔 관리 프로그램 v1.0");
		System.out.println("1.입실  2.퇴실  3.방보기  4.종료");
		return inputNum();
	}

	public void checkIn() { // 입실
		System.out.println("몇번방에 입실하시겠습니까?");
		int roomNum = inputNum();
		if (mController.checkRoom(roomNum)) { // 방이 이미 차있으면
			System.out.printf("%d번방은 현재 손님이 있습니다.\n", roomNum);
		} else { // 방이 비어 있으면
			mController.checkIn(roomNum);
			System.out.printf("%d번방에 입실하셨습니다\n", roomNum);
		}
	}

	public void checkOut() { // 퇴실
		System.out.println("몇번방에서 퇴실하시겠습니까?");
		int roomNum = inputNum();
		if (mController.checkRoom(roomNum)) { // 방이 차있으면
			mController.checkOut(roomNum);
			System.out.printf("%d번방에서 퇴실하셨습니다\n", roomNum);
		} else { // 방이 비어 있으면
			System.out.printf("%d번방은 현재 빈 방입니다.\n", roomNum);
		}
	}

	public void printAllRooms() { // 방 보기
		List<Room> motel = mController.printAllRooms();
		for (int i = 0; i < motel.size(); i++) {
			if (motel.get(i).isAvailable()) { // 방에 손님이 있으면
				System.out.printf("%d번방에는 현재 손님이 있습니다\n", i + 1);
			} else {
				System.out.printf("%d번방에는 현재 비어있습니다\n", i + 1);
			}
		}
	}

	public int inputNum() { // 입력값 반환
		Scanner sc = new Scanner(System.in);
		System.out.print("선택 > ");
		return sc.nextInt();
	}
}

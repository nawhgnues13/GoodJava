package org.good.day11.music.view;

import java.util.List;
import java.util.Scanner;

import org.good.day11.music.controller.MusicController;
import org.good.day11.music.model.vo.Music;

public class MusicView implements MusicViewInterface {
	MusicController mController;

	public MusicView() {
		mController = new MusicController();
	}

	@Override
	public void launchApp() {
		end: while (true) {
			int choice = printMainMenu();
			switch (choice) {
			case 1:
				inputMusic();
				break;
			case 2:
				inputMusicinFirst();
				break;
			case 3:
				printAllMusics();
				break;
			case 4:
				findMusic();
				break;
			case 5:
				deleteMusic();
				break;
			case 6:
				modifyMusic();
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				break end;
			default:
				System.out.println("0~10사이의 숫자를 입력해주세요.");
				break;
			}
		}
	}

	@Override
	public int printMainMenu() {
		// === === 메인 메뉴 === ===
		// 1. 마지막 위치에 곡 추가
		// 2. 첫 위치에 곡 추가
		// 3. 전체 곡 목록 출력
		// 4. 특정 곡 검색
		// 5. 특정 곡 삭제
		// 6. 특정 곡 정보수정
		// 7. 곡명 오름차순 정렬
		// 8. 곡명 내림차순 정렬
		// 9. 가수명 오름차순 정렬
		// 10. 가수명 내림차순 정렬
		// 0. 종료
		// 메뉴 선택 >> 1
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		return inputNum();
	}

	@Override
	public void inputMusic() { // 마지막 위치에 곡 추가
		String title = inputTitle();
		String singer = inputSinger();
		mController.addMusic(new Music(title, singer));
	}

	public void inputMusicinFirst() { // 첫 위치에 곡 추가
		String title = inputTitle();
		String singer = inputSinger();
		mController.addMusicFirst(new Music(title, singer));
	}

	public void deleteMusic() { // 곡명으로 곡 찾고 삭제
		String title = inputTitle();
		int index = mController.findIndexbyTitle(title);
		mController.deleteMusic(index);
		System.out.println("삭제되었습니다.");
	}

	@Override
	public void modifyMusic() { // 곡명으로 곡 찾고 수정
		System.out.println("수정할 곡명을 적어주세요.");
		String title = inputTitle();
		int index = mController.findIndexbyTitle(title);
		String title2 = inputTitle();
		String singer = inputSinger();
		mController.modifyMusic(index, new Music(title2, singer));
	}

	public void findMusic() { // 곡명으로 곡 검색
		String text = inputSinger();
		int index = mController.findIndexbyTitle(text);
		Music music = mController.findMusicbyIndex(index);
		System.out.println(music.toString());
	}

	@Override
	public void printAllMusics() { // 곡 전체 출력
		List<Music> mList;
		mList = mController.findAllMusics();
		for (Music music : mList) {
			System.out.println(music.toString());
		}
	}

	public int inputNum() { // 숫자 입력
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public String inputTitle() { // 곡명 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명 : ");
		return sc.next();
	}

	@Override
	public String inputSinger() { // 가수명 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("가수명 : ");
		return sc.next();
	}
}

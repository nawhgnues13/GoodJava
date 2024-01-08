package org.good.day11.music2.view;

import java.util.List;
import java.util.Scanner;

import org.good.day11.music2.controller.MusicController;
import org.good.day11.music2.model.vo.Music;

public class MusicView implements MusicViewInterface {
	MusicController mController;

	public MusicView() {
		mController = new MusicController();
	}

	@Override
	public void launchApp() {
		end: while (true) {
			// 메인메뉴 출력, 여기서 선택하면
			// 선택한 값이 choice로 들어감
			int choice = printMainMenu();
			// choice 값에 따라서 실행문이 다름
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
				// 곡명으로 오름차순 정렬
				this.displayMessage("=== === 곡명 오름차순 정렬 === ===");
				mController.sortByTitle();
				break;
			case 8:
				this.displayMessage("=== === 곡명 내림차순 정렬 === ===");
				mController.sortByTitleDESC();
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

	public void displayMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
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
		// next()는 공백 입력받지 않음, 이름, 공백없는 데이터
		// nextLine()은 공백입력받음, 주소, 제목 등 띄어쓰기 있는 데이터
		String title = inputTitle(); // 곡명 입력
		String singer = inputSinger(); // 가수명 입력
		mController.addMusic(new Music(title, singer));
	}

	public void inputMusicinFirst() { // 첫 위치에 곡 추가
		String title = inputTitle(); // 곡명 입력
		String singer = inputSinger(); // 가수명 입력
		mController.addMusicFirst(new Music(title, singer));
	}

	public void deleteMusic() { // 곡명으로 곡 찾고 삭제
		String title = inputTitle(); // 곡명 입력
		int index = mController.findIndexbyTitle(title); // 곡명으로 찾은 인덱스값
		mController.deleteMusic(index);
		System.out.println("삭제되었습니다.");
	}

	@Override
	public void modifyMusic() { // 곡명으로 곡 찾고 수정
		System.out.println("수정할 곡명을 적어주세요.");
		String title = inputTitle(); // 곡명 입력
		int index = mController.findIndexbyTitle(title); // 곡명으로 찾은 인덱스값
		if (index == 0) { // 곡이 존재하지 않으면
			System.out.println("존재하지 않는 정보입니다.");
		} else {
			String title2 = inputTitle(); // 곡명 입력
			String singer = inputSinger(); // 가수명 입력
			mController.modifyMusic(index, new Music(title2, singer));
		}
	}

	public void findMusic() { // 곡명으로 곡 검색
		String title = inputTitle();
		int index = mController.findIndexbyTitle(title);
		Music music = mController.findMusicbyIndex(index);
		System.out.println(music.toString());
	}

	@Override
	public void printAllMusics() { // 곡 전체 출력
		List<Music> mList = mController.findAllMusics();
		System.out.println("=== === 전체 곡 목록 출력 === ===");
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
		return sc.nextLine();
	}

	@Override
	public String inputSinger() { // 가수명 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("가수명 : ");
		return sc.nextLine();
	}
}

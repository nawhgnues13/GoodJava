package org.good.day09.collection.member.view;

import java.util.List;
import java.util.Scanner;

import org.good.day09.collection.member.controller.MemberController;
import org.good.day09.collection.member.model.vo.Member;

public class MemberView {
	MemberController mController;

	public MemberView() {
		mController = new MemberController();
	}

	public void startProgram() {
		end: while (true) {
			int choice = this.printMenu();
			switch (choice) {
			case 1:
				this.inputMember();
				break;
			case 2:
				this.modifyMember();
				break;
			case 3:
				this.removeMember();
				break;
			case 4:
				this.printOneMember();
				break;
			case 5:
				this.printAllMember();
				break;
			case 6:
				System.out.println("프로그램이 종료되었습니다.");
				break end;
			}
		}
	}

	public int printMenu() {
		// ====== 회원 관리 프로그램 ======
		// 1. 회원 정보 등록
		// 2. 회원 정보 수정
		// 3. 회원 정보 삭제
		// 4. 회원 정보 출력(아이디)
		// 5. 회원 전체 정보 출력
		// 6. 프로그램 종료
		// 선택 : 1
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 관리 프로그램 ======");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 정보 삭제");
		System.out.println("4. 회원 정보 출력(아이디)");
		System.out.println("5. 회원 전체 정보 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 : ");
		int select = sc.nextInt();
		sc.close();
		return select;
	}

	public void inputMember() {
		// ====== 회원 정보 등록 ======
		// 아이디 : khuser01
		// 비밀번호 : pass01
		// 이름 : 홍용자
		// 이메일 : khuser01@kh.com
		// 전화번호 : 01012341234
		// 정보를 저장중입니다...
		// 저장완료!
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 정보 등록 ======");
		String memberId = inputId();
		String memberPw = inputPw();
		String memberName = inputName();
		String memberEmail = inputEmail();
		String memberPhone = inputPhone();
		Member member = new Member(memberId, memberPw, memberName, memberEmail, memberPhone);
		mController.addMember(member);
		System.out.println("정보를 저장중입니다...");
		System.out.println("저장완료!");
		sc.close();
	}

	public void modifyMember() {
		// ====== 회원 정보 수정 ======
		// 아이디를 입력해주세요 : khuser01
		// 수정할 정보를 입력해주세요
		// 비밀번호 : pass11
		// 이메일 : hongyj@naver.com
		// 전화번호 : 01012345678
		// 정보를 수정중입니다...
		// 수정완료!

		// ====== 회원 정보 수정 ======
		// 아이디를 입력해주세요 : khuser01
		// 회원정보가 존재하지 않습니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 정보 수정 ======");
		String memberId = inputId();
		int memberIndex = mController.findMemberIndex(memberId);
		if (memberIndex == 0) { // 회원이 존재하지 않으면
			System.out.println("회원정보가 존재하지 않습니다.");
		} else {
			System.out.println("수정할 정보를 입력해주세요");
			String memberPw = inputPw();
			String memberName = inputName();
			String memberEmail = inputEmail();
			String memberPhone = inputPhone();
			Member member = new Member(memberId, memberPw, memberName, memberEmail, memberPhone);
			mController.updateMember(memberIndex, member);
			System.out.println("정보를 수정중입니다...");
			System.out.println("수정완료!");
		}
		sc.close();
	}

	public void removeMember() {
		// ====== 회원 정보 삭제 ======
		// 삭제할 회원의 아이디를 입력해주세요 : khuser01
		// 정보를 삭제중입니다...
		// 삭제완료!

		// ====== 회원 정보 삭제 ======
		// 삭제할 회원의 아이디를 입력해주세요 : khuser11
		// 회원정보가 존재하지 않습니다.
		System.out.println("====== 회원 정보 삭제 ======");
		String memberId = inputId();
		int memberIndex = mController.findMemberIndex(memberId);
		if (memberIndex == 0) { // 회원이 존재하지 않으면
			System.out.println("회원정보가 존재하지 않습니다.");
		} else {
			mController.deleteMember(memberIndex);
			System.out.println("정보를 삭제중입니다...");
			System.out.println("삭제완료!");
		}
	}

	public void printOneMember() {
		// ====== 회원 정보 출력(아이디) ======
		// 아이디를 입력해주세요 : khuser01
		// 아이디 : khuser01, 이름 : 홍용자, 이메일 : hongyj@naver.com, 폰번호 : 01012345678
		System.out.println("====== 회원 정보 출력(아이디) ======");
		String memberId = this.inputId();
		int memberIndex = mController.findMemberIndex(memberId);
		Member member = mController.findMember(memberIndex);
		if (memberIndex == 0) { // 회원이 존재하지 않으면
			System.out.println("회원정보가 존재하지 않습니다.");
		} else {
			System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s\n", member.getMemberId(), member.getMemberId(),
					member.getMemberName(), member.getMemberEmail(), member.getMemberPhone());

		}

	}

	public void printAllMember() {
		// ====== 회원 전체 정보 출력 ======
		// 아이디 : khuser01, 이름 : 홍용자, 이메일 : hongyj@naver.com, 폰번호 : 01012345678
		// 아이디 : khuser02, 이름 : 이용자, 이메일 : khuser02@naver.com, 폰번호 : 01022345678
		// 아이디 : khuser03, 이름 : 삼용자, 이메일 : khuser03@naver.com, 폰번호 : 01032345678
		// 아이디 : khuser04, 이름 : 사용자, 이메일 : khuser04@naver.com, 폰번호 : 01042345678
		// 아이디 : khuser05, 이름 : 오용자, 이메일 : khuser05@naver.com, 폰번호 : 01052345678
		// 아이디 : khuser05, 이름 : 육용자, 이메일 : khuser06@naver.com, 폰번호 : 01062345678
		List<Member> members = mController.findAllMember();
		for (int i = 0; i < members.size(); i++) {
			System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s\n", members.get(i).getMemberId(),
					members.get(i).getMemberName(), members.get(i).getMemberEmail(), members.get(i).getMemberPhone());
		}
	}

	public String inputId() { // 아이디 입력하고 입력한 아이디 반환
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 : ");
		return sc.next();
	}

	public String inputPw() { // 아이디 입력하고 입력한 아이디 반환
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 : ");
		return sc.next();
	}

	public String inputName() { // 아이디 입력하고 입력한 아이디 반환
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		return sc.next();
	}

	public String inputEmail() { // 아이디 입력하고 입력한 아이디 반환
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 : ");
		return sc.next();
	}

	public String inputPhone() { // 아이디 입력하고 입력한 아이디 반환
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 : ");
		return sc.next();
	}
}

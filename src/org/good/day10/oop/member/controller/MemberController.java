package org.good.day10.oop.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.good.day10.oop.member.model.vo.Member;

public class MemberController {
	// Member List 저장소
	List<Member> memberList;

	public MemberController() {
		memberList = new ArrayList<Member>();
	}

	// 회원 정보 등록
	public void addMember(Member member) {
		memberList.add(member);
	}

	// 멤버아이디로 인덱스값 구하기
	public int findMemberIndex(String memberId) {
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())) {
				return i;
			}
		}
		return 0;
	}

	public Member findMember(int index) {
		return memberList.get(index);
	}

	// 회원 전체 정보
	public List<Member> printAllMembers() {
		return memberList;
	}

	// 회원 정보 아이디로 검색
	public Member printOneById(String memberId) {
		for (Member member : memberList) {
			if (memberId.equals(member.getMemberId())) {
				return member;
			}
		}
		return null;
	}

	public void deleteMember(String memberId) {
//		for (Member member : memberList) {
		for (int i = 0; i < memberList.size(); i++) {
			Member member = memberList.get(i);
			if (memberId.equals(member.getMemberId())) {
				memberList.remove(i);
				break;
			}
		}
	}

	public void modifyMember(String memberId, Member updatemember) {
		for (int i = 0; i < memberList.size(); i++) {
			// ================ 원래 저장되어있는 데이터 ==================
			Member member = memberList.get(i);
			// =============== 입력한 id와 같은지 비교 ==========================
			if (memberId.equals(member.getMemberId())) {
				// ============ 입력 받은 데이터로 수정 ================
				member.setMemberPw(updatemember.getMemberPw());
				member.setMemberEmail(updatemember.getMemberEmail());
				member.setMemberPhone(updatemember.getMemberPhone());
				// ===================== 수정된 데이터로 저장 ============================
				memberList.set(i, member);
			}
		}
	}

	// Member List를 저장소로 가지고 있으며 추가, 수정, 삭제, 출력하는 메소드 작성
	// addMember, updateMember, deleteMember, findMember, findAllMember

}

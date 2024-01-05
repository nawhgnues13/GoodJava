package org.good.day09.collection.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.good.day09.collection.member.model.vo.Member;

public class MemberController {
	// Member List를 저장소로 가지고 있으며 추가, 수정, 삭제, 출력하는 메소드 작성
	// addMember, updateMember, deleteMember, findMember, findAllMember
	List<Member> members;

	public MemberController() {
		members = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		members.add(member);
	}

	public void updateMember(int index, Member member) {
		members.set(index, member);
	}

	public void deleteMember(int index) {
		members.remove(index);
	}

	public Member findMember(int index) { // 인덱스값으로 멤버 반환
		return members.get(index);
	}

	public int findMemberIndex(String memberId) { // 멤버 아이디로 인덱스값 반환
		for (int i = 0; i < members.size(); i++) {
			if (memberId.equals(members.get(i).getMemberId())) {
				return i;
			}
		}
		return 0;
	}

	public List<Member> findAllMember() {
		return members;
	}
}

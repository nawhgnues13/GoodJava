package org.good.day09.collection.member.model.vo;

public class Member {
	// memberId
	// memberPw
	// memberName
	// memberEmail
	// memberPhone
	private String memberId; // 아이디
	private String memberPw; // 비밀번호
	private String memberName; // 이름
	private String memberEmail; // 이메일
	private String memberPhone; // 폰번호

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public Member() {
		this.memberId = "";
		this.memberPw = "";
		this.memberName = "";
		this.memberEmail = "";
		this.memberPhone = "";
	}

	public Member(String memberId, String memberPw, String memberName, String memberEmail, String memberPhone) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
	}
}

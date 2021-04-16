package ch13;

public class Member implements Comparable<Member>{

	private int memberId;
	private String memberName;
	
	public Member() {}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public int compareTo(Member o) {
		
		return (this.memberId - o.memberId);
	}
	
//	//Comparator ���� ��
//	public int compare (Member o1, Member o2) {
//		return (o1.memberId - o2.memberId);
//	}

	
	
	
}

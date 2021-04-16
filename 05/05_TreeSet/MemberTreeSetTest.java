package ch13;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1000, "Lee");
		Member memberShin = new Member(1001, "Shin");
		Member memberKim = new Member(1002, "Kim");
		Member memberPark = new Member(1003, "Park");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberShin);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberPark);
		
		Member memberHong = new Member(1004, "Hong");
		memberTreeSet.addMember(memberHong);
		
		memberTreeSet.showAllMember();
	}

}

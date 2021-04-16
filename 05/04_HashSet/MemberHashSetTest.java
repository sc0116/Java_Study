package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1000, "Lee");
		Member memberShin = new Member(1001, "Shin");
		Member memberKim = new Member(1002, "Kim");
		Member memberPark = new Member(1003, "Park");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberShin);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberPark);
		
		Member memberHong = new Member(1003, "Hong");
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
	}

}

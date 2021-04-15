package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1000, "Lee");
		Member memberShin = new Member(1001, "Shin");
		Member memberKim = new Member(1002, "Kim");
		Member memberPark = new Member(1003, "Park");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberShin);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.showAllMember();
	}

}

package ch14;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1000, "Lee");
		Member memberShin = new Member(1001, "Shin");
		Member memberKim = new Member(1002, "Kim");
		Member memberPark = new Member(1003, "Park");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberShin);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberPark);
		
		Member memberHong = new Member(1004, "Hong");
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "k");
		hashMap.put(2, "L");
		hashMap.put(3, "S");
		System.out.println(hashMap);
	}

}

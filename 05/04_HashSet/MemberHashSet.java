package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> HashSet;
	
	public MemberHashSet() {
		HashSet = new HashSet<>();
	}
	
	public MemberHashSet(int size) {
		HashSet = new HashSet<>(size);
	}
	
	public void addMember(Member member) {
		HashSet.add(member);
	}
	
	public boolean removerMember(int memberId) {
		//iterator 방식
		Iterator<Member> ir = HashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				HashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
		
		// get(i) 방식
//		for(int i = 0; i < HashSet.size(); i++) {
//			Member member = HashSet.get(i);
//			int tempId = member.getMemberId();
//			if(tempId != memberId) {
//				HashSet.remove(i);
//				return true;
//			}
//		}
//		
//		System.out.println(memberId + "가 존재하지 않습니다.");
//		return false;
	}
	
	public void showAllMember() {
		for(Member member : HashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}

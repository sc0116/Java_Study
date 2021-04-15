package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removerMember(int memberId) {
		//iterator 방식
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
		
		// get(i) 방식
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			int tempId = member.getMemberId();
//			if(tempId != memberId) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
//		
//		System.out.println(memberId + "가 존재하지 않습니다.");
//		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}

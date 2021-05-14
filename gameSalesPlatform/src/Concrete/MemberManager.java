package Concrete;

import Abstract.BaseMemberManager;
import Abstract.IMemberCheckService;
import Entities.Member;

public class MemberManager extends BaseMemberManager{

	IMemberCheckService memberCheckService;
	
	public MemberManager(IMemberCheckService memberCheckService) {
		this.memberCheckService = memberCheckService;
	}

	@Override
	public void add(Member member) {
		if(memberCheckService.CheckIfRealPerson(member)) {
			super.add(member);
		}else {
			System.err.println("Not a valid Person");
		}
		
	}
	
}

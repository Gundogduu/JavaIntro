package Abstract;

import java.util.ArrayList;

import Entities.Member;

public abstract class BaseMemberManager implements IMemberService{

	ArrayList<Member> members = new ArrayList<Member>();
	
	@Override
	public void add(Member member) {
		members.add(member);
		System.out.println("save to db: " + member.getFirstName());
		
	}

	@Override
	public void update(Member member) {
		members.set(member.getId(), member);
		System.out.println("save to db: " + member.getFirstName());
		
	}

	@Override
	public void delete(Member member) {
		members.remove(member);
		System.out.println("save to db: " + member.getFirstName());
		
	}

	@Override
	public void getAll() {
		System.out.println("-----Members------------------------");	
		for (Member member : members) {
			System.out.println("Member: " + member.getFirstName());
		}
	}
}

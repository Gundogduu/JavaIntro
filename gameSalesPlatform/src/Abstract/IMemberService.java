package Abstract;

import Entities.Member;

public interface IMemberService {
	void add(Member member);
	void update(Member member);
	void delete(Member member);
	void getAll();
}

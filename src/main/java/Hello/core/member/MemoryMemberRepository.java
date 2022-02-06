package Hello.core.member;

import Hello.core.member.Member;
import Hello.core.member.MemberRepository;

import java.util.HashMap;
import java.util.Map;


public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();   // 예제라서 해쉬 맵 사용[동시성 발생 가능성있음] 컹커라 데쉬맵을 써야함 동시성이 이슈가 생김.

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId); // 파인드 바인을하면 스토어에 넘어와서 아이디를 찾는것이다.
    }


}

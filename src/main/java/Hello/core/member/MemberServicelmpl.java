package Hello.core.member;

public class MemberServicelmpl implements MemberService {   // 구현체가 하나일 경우에 implements 를 한다고 함.

    private  final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}

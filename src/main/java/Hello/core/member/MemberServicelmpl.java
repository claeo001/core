package Hello.core.member;

public class MemberServicelmpl implements MemberService {   // 구현체가 하나일 경우에 implements 를 한다고 함.

    private  final MemberRepository memberRepository;

    public MemberServicelmpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }   // 생성자를 통해서 memberRepository 안에 뭐가 들어갈지 선택

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}

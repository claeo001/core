package Hello.core.member;

public interface MemberRepository  {

    void save(Member member);   // 회원 아이디 저장소

    Member findById(Long memberId); // 회원 아이디를 아이디 찾기
}


package Hello.core;

import Hello.core.discount.FixDiscountPolicy;
import Hello.core.member.MemberService;
import Hello.core.member.MemberServicelmpl;
import Hello.core.member.MemoryMemberRepository;
import Hello.core.order.OrderService;
import Hello.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServicelmpl(new MemoryMemberRepository());
        // 생성자 주입
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }


}
// 구현 객체를 생성.
// 생성자를 통해서 주입 연결.
// 객체의 생성과 연결을 담당하게 됨.
// 직접적으로 받는게 아니다
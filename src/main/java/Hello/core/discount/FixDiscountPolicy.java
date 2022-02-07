package Hello.core.discount;

import Hello.core.member.Grade;
import Hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;    // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {// 이 타입은 == 쓰는게 맞다
            return discountFixAmount;
        } else {
            return 0;
        }

    }
}

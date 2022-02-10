package Hello.core.beanfind;

import Hello.core.AppConfig;
import Hello.core.member.Member;
import Hello.core.member.MemberService;
import Hello.core.member.MemberServicelmpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ApplicationContextBasicFindTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조히")
    void findBeanByName() {
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);

    }  @Test
    @DisplayName("이름 없이 타입으로만 조히")
    void findBeanByType() {
        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);

    }
    @Test
    @DisplayName("구체 타입으로 조히")
    void findBeanByName2() {
        MemberService memberService = ac.getBean("memberService", MemberServicelmpl.class);
        assertThat(memberService).isInstanceOf(MemberService.class);

    }
    @Test
    @DisplayName("빈 이름으로 조회X")
    void findBeanByNameX(){
//        ac.getBean("XXXXX", MemberService.class);
        assertThrows(NoSuchBeanDefinitionException.class,
                () -> ac.getBean("xxxxx", MemberService.class));



    }
}

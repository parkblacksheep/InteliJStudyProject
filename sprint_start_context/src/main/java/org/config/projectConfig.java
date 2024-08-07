package org.config;

import org.kosta.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  /* 이 클래스를 스프링 구성 클래스로 정의함*/
public class projectConfig {

    @Bean /* 스프링에 컨텍스트가 초기화 될 때 이 메서드를 호출하고 반환된 값을 컨텍스트에 추가를 지시함*/
    Parrot parrot() {       /* 빈을 반환하는 메서드 생성 (명사인 이유 :  이해의 용이성과 객체 지향 프로그래밍(OOP) 원칙을 따르기 위함 */
        var parrot = new Parrot();
        parrot.setName("왕관앵무");
        return parrot;  /*Parrot 인스턴스를 컨텍스트에 추가함*/
    }
    @Bean /* 스프링 컨텍스트에 "Hello" 문자열 추가 */
    String hello(){
        return "hello";
    }
    @Bean   /*스프링 컨텍스트에 10이라는 숫자 추가*/
    Integer ten(){
        return 10;
    }
}

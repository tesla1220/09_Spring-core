package com.ohgiraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Raccoon implements Animal{

    @Override
    public void eat() {

        System.out.println("라쿤이 초밥을 먹어요");

    }
}

package com.example.kotlinproject;

import com.example.kotlinproject.java.PersonJava;
import com.example.kotlinproject.kotlin.Person;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {

    @Test
    public void test1() {
        Assert.assertEquals(4,2+2);
    }

    @Test
    public void testGetterSetter() {

        // PersonJava의 객체를 생성하고 이름을 "Emily", 나이를 10으로 설정
        PersonJava personJava = new PersonJava("Emily");
        personJava.setAge(10);

        //설정한 값이 정상적인지 테스트
        Assert.assertEquals(10, personJava.getAge());
        Assert.assertEquals("Emily",personJava.getName());

        // 코틀린의 Person 객체를 생성하고 이름을 Emily, 학번을 222로 설정
        Person person = new Person("Emily");
        person.setNumber("222");

        Assert.assertEquals("222",person.getNumber());
        Assert.assertEquals("Emily",person.getName());
    }

    @Test
    public void testSetNickname() {
        // 자바로 작성한 PersonJava 클래스의 객체 생성
        PersonJava personJava = new PersonJava("Emily");

        //대문자가 포함된 문자열을 닉네임으로 설정해도 소문자로 저장
        personJava.setNickname("Banana");

        //대문자가 포함된 문자열이 소문자로 되엇는지 확인
        Assert.assertEquals("banana",personJava.getNickname());

        // 코틀린으로 작성한 Person 클래스 생성
        Person person = new Person("Emily");
        person.setNickname("Banana");
        Assert.assertEquals("banana",person.getNickname());
    }
}

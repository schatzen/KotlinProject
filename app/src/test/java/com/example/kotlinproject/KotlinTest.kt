package com.example.kotlinproject

import com.example.kotlinproject.kotlin.Person
import org.junit.Assert
import org.junit.Test

class KotlinTest {

    @Test
    fun test1() {
        Assert.assertEquals(4, 2+3-1)
    }

    @Test
    fun testGetterSetter() {
        // 코틀린의 Person 객체를 생성하고 이름을 Laure 로 설정
        val person = Person("Laura")

        // 코틀린은 age를 직접 사용해됴 자동으로 setter가 불린다
        person.number = "222"

        // 설정한 값이 정상적인지 테스트
        // 마찬가지로 직접 프롶티 접근해도 자동으로 getter가 붙는다.
        Assert.assertEquals("222",person.number)
        Assert.assertEquals("Laura",person.name)
    }

    @Test
    fun testSetNickname() {
        val person = Person("Laura")
        //대문자가 포함된 문자열을 닉네임으로 설정해도 소문자로 저장한다.
        person.nickname = "SKY"
        Assert.assertEquals("sky",person.nickname)
    }
}
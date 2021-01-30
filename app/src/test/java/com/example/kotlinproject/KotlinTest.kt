package com.example.kotlinproject

import com.example.kotlinproject.kotlin.Person
import com.example.kotlinproject.kotlin.sum
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

    @Test
    fun testLambda1() {
        //함수의 파라미터로 람다식 전달
        println(sum(1,2))

        //람다식 반환 값으로 비교
        Assert.assertEquals(4,sum(1,3))

        // 함수에 람다 표현식을 바로 전달
        Assert.assertEquals(4, {x:Int, y:Int -> x*y}(2,2))

        // 람다표현식 내부에서 람다표현식 반환
        val exp = {x:Int, y:Int ->
            {
                z:Int -> (x+y) *z
            }
        }

        // exp2 -> {z:Int -> {(3+2) * z}}3,2
        val exp2 = exp(3,2)

        // result -> (3+2) * 4
        val result = exp2(4)

        //결과 확인
        Assert.assertEquals(20,result)

    }
}
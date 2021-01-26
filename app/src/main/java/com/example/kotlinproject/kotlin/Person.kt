package com.example.kotlinproject.kotlin

class Person(val name:String) {

    // 학번
    var number = "000"

    // 닉네임 소문자만 받는다.
    var nickname: String = ""
        set(value) {
            //field는 Stter의 대상이 되는 filed를 의미
            field = value.toLowerCase()
            //this.nickname = value.toLowerCase()로 할 경우 eroor 발생
        }




}
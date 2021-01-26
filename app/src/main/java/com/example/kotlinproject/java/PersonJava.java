package com.example.kotlinproject.java;

public class PersonJava {

    private int age;
    private final String name;
    // 소문자만 받는다.
    private String nickname;

    public PersonJava(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    // 닉네임은 대문자 문자열이 와도 소문자로 저장한다.
    public void setNickname(String nickname) {
        this.nickname = nickname.toLowerCase();
    }
}

package com.example.kotlinproject.java;

public class MaginSwordDelegate implements ISword{

    //ISword 타입의 객체를 필드로 가지고 있는다.
    // 단지 Sword 클래스를 확장하려면 Sword 타입으로 해도 되지만
    // ISword 타입으로하면 확장성이 더욱 커지게 된다.

    ISword iSword;

    // 생성자에서 ISword 타입의 객체를 생성자에서 받는다.
    public MaginSwordDelegate(ISword iSword) {
        this.iSword = iSword;
    }

    // 장착시 불리는 메소드
    @Override
    public void equip() {

         playWonderfulSound();
         iSword.equip();

    }

    public void playWonderfulSound() {
        System.out.println("띠로링");
    }
}

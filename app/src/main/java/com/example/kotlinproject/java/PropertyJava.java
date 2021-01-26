package com.example.kotlinproject.java;

public class PropertyJava {

    // 프로퍼티는 Field와 외부에서 접근 가능한 Getter 또는 Setter가 있는 경우이다.
    // Field와 접근 가능한 Getter,Setter의 조합을 의미

    // Field가 선언되어 있고 Getter, Setter가 있는 경우 Property
    private int property1 = 0;

    public int getProperty1() {
        return property1;
    }

    public void setProperty1(int property1) {
        this.property1 = property1;
    }

    // 변수의 값을 읽을 수만 잇는 경우도 Property라 할 수 있음
    private String property2 = "";

    public String getProperty2() {
        return property2;
    }

    // 단순 field는 property가 아니다.
    private int notProperty1 = 0;

    // 클래스 변수 역시 property가 아님
    private static int notProperty2;
}

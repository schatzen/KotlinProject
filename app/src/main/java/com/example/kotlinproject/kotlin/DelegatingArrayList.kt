package com.example.kotlinproject.kotlin

class DelegatingArrayList<T>(val innerList: MutableCollection<T> = mutableListOf()) : MutableCollection<T> by innerList {

    // add 메소드는 기존의 기능에 전달받은 아이템을 로그로 출력하는 기능을 추가한다.
    override fun add(element: T) : Boolean {
        // 확장 기능을 실행
      printItem(element)

        // innerList에 기능 위임
      return innerList.add(element)
    }

    // 아이템을 프린트하는 함수
    fun printItem(item:T) {
        println(item.toString())
    }
}
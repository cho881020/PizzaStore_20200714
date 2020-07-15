package kr.co.tjoeun.pizzastore_20200714.datas

import java.io.Serializable

// 데이터를 클래스 째로 집어넣기 위해 Serializable 활용

class PizzaStore(
    val name:String,
    val logoUrl:String,
    val phoneNum:String) : Serializable {



}
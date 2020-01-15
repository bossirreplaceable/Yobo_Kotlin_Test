package com.yobo.yobo_kotlin.test31_lambda

/**
 * Created by ZhangBoshi
 * on 2019-12-28
 */

object Test1 {
    fun isAgeAndSex(person: Person): Boolean {
        return person.age > 18 && person.sex == "女"
    }
}


fun main() {

    //模拟出人员List
    val personList = mutableListOf<Person>()
    repeat(10) {
        if (it % 2 == 0) {
            personList.add(Person("小子$it", 13 + it, "男"))
        } else {
            personList.add(Person("小子$it", 13 + it, "女"))
        }
    }

    val needList = needPersonList(personList, 18)
    println("needList=$needList")

    val needList1 = needPersonList1(personList) {
        it.age > 18 && it.sex == "女"
    }
    println("needList1=$needList1")

    val isAgeSex = ::isAgeAndSex
    val needList2 = needPersonList1(personList, isAgeSex)
    println("needList2=$needList2")


    val needList3 = needPersonList1(personList, fun(person: Person): Boolean {
        return person.age > 18 && person.sex == "女"
    })
    println("needList3=$needList3")


    val needList4 = needPersonList1(personList) { person ->
        person.age > 18 && person.sex == "女"
    }
    println("needList4=$needList4")


    val nameList = personList.map(Person::name)
    println(nameList)

    //这里的getPerson等于函数 getPerson(name:String,age:Int,sex:String) -> Person
    val getPerson = ::Person
    println(getPerson("小白", 18, "男"))
    //这里的getName等于函数 getName(person:Person) -> String
    val getName = Person::name
    println(getName(Person("小女", 19, "女")))
}

fun isAgeAndSex(person: Person): Boolean {
    return person.age > 18 && person.sex == "女"
}


/**
 * 筛选年龄大于指定年龄的学生
 */
fun needPersonList(list: List<Person>, needAge: Int): List<Person> {
    val needList = mutableListOf<Person>()
    for (person in list) {
        if (person.age > needAge) {
            needList.add(person)
        }
    }
    return needList
}

fun needPersonList0(list: List<Person>, needAge: Int, sex: String): List<Person> {
    val needList = mutableListOf<Person>()
    for (person in list) {
        if (person.age > needAge && person.sex == sex) {
            needList.add(person)
        }
    }
    return needList
}

/**
 * 不光可以判断出大于指定年龄的学生，还可以判断其他属性
 */
fun needPersonList1(list: List<Person>, need: (person: Person) -> Boolean): List<Person> {
    val needList = mutableListOf<Person>()
    for (person in list) {
        if (need(person)) {
            needList.add(person)
        }
    }
    return needList
}

fun needPersonList2(list: List<Person>, need: (person: Person) -> Boolean): List<Person> {
    val needList = mutableListOf<Person>()
    for (person in list) {
//        if (need(person)) {
        needList.add(person)
//        }
    }
    return needList
}
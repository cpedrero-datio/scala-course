package com.datio.examples.basics

object ExampleCaseClass {


  case class Person(name: String, age: Int){
    override def toString: String = name + " " + age.toString
  }

  val person1 = Person("Carlos", 35)
  val person2 = Person("Carlos", 35)

  val areSame = person1 == person2

  def main(args: Array[String]): Unit = {
    println(areSame)
    val person3 = person1.copy(name="Pepe")
    println(person3)
  }

}

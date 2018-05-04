package com.datio.examples.basics

object ExampleTrait {

  trait Contract {
    def screenPrinting(): Unit = {
      println(message)
    }

    val message: String
  }

  class ClassA extends Contract {
    override val message: String = "I'm class A"
  }

  class ClassB extends Contract {
    override val message: String = "I'm class B"
  }


  def main(args: Array[String]): Unit = {
    new ClassA().screenPrinting()
    new ClassB().screenPrinting()
  }

}
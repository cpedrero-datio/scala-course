package com.datio.examples.introduction

object ExampleMixing {

  abstract class AbstractClass {
    val message: String
  }

  class ChildClass extends AbstractClass {
    val message = "I'm an instance of class B"
  }

  trait ExampleTrait extends AbstractClass {
    def upperMessage = message.toUpperCase()
  }

  class GrandSonClass extends ChildClass with ExampleTrait

  object Example1 extends App {
    override def main(args: Array[String]): Unit = {
      val d = new GrandSonClass
      println(d.message) // I'm an instance of class B
      println(d.upperMessage) // I'M AN INSTANCE OF CLASS B
    }
  }
}

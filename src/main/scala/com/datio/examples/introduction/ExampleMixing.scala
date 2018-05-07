package com.datio.examples.introduction

object ExampleMixing {

  abstract class AbstractClass {
    val message: String
  }

  class ChildClass extends AbstractClass {
    val message = "I'm an instance of class ChildClass"
  }

  trait ExampleTrait extends AbstractClass {
    def upperMessage = message.toUpperCase()
  }

  class GrandSonClass extends ChildClass with ExampleTrait

  def main(args: Array[String]): Unit = {
    val d = new GrandSonClass
    println(d.message) // I'm an instance of class ChildClass
    println(d.upperMessage) // I'M AN INSTANCE OF CLASS CHILDCLASS
  }

}

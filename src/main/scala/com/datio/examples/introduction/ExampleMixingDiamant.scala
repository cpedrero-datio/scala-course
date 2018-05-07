package com.datio.examples.introduction

import com.datio.examples.introduction.ExampleMixing.GrandSonClass

object ExampleMixingDiamant {

  trait Animal {
    def sound: String
  }

  trait Cat extends Animal {
    override def sound = "Miau"
  }

  trait Dog extends Animal {
    override def sound = "Guau"
  }

  // Last override is Dog
  case class Fox() extends Cat with Dog

  def main(args: Array[String]): Unit = {
    println(Fox().sound)
  }

}

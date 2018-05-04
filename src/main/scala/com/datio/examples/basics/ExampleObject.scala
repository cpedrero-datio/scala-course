package com.datio.examples.basics

object ExampleObject{

  object Factory {
    private var counter = 0

    def increment(): Int = {
      counter += 1
      counter
    }
  }

  def main(args: Array[String]): Unit = {
    println(Factory.increment())
    println(Factory.increment())
  }

}

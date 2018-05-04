package com.datio.examples.basics

object ExampleMethod {

  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = {
    (x + y) * multiplier
  }
  // With visibility attirbutes
  protected def returnTwo: Int = {
    1 + 1
  }

  def main(args: Array[String]): Unit = {
    println(addThenMultiply(1,1)(2))
    println(returnTwo)
  }

}
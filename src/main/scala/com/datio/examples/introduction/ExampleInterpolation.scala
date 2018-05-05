package com.datio.examples.introduction

object ExampleInterpolation {
  def main(args: Array[String]): Unit = {
    val language = "Scala"
    println(s"Hi, I'm a $language developer")

    // Better than
//    println("Hi, I'm a " + language + " developer")
  }

}

package com.datio.examples.basics

object ExampleClass {


  class Welcome(prefix: String, suffix: String) {

    def welcome(name: String): Unit =
    // String Interpolation
      println(s"$prefix$name$suffix")

  }


  /**
    * Companion Object
    */

  import scala.math._

  case class Circle(radius: Double) {

    import Circle._

    def area: Double = calculateArea(radius)
  }

  object Circle {
    //  def apply(radius: Double): Circle = Circle(radius)
    private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)
  }

  case class Person(name: String)

  object Person


  def main(args: Array[String]): Unit = {
    // Simple class
    val welcome = new Welcome("Hello, ", "!")
    welcome.welcome("Scala developer") // Hello, Scala developer!

    // Companion object
    val circle = Circle(2.0)
    println(s"I'm a circle with radious: ${circle.radius}")
    println(s"Area is ${circle.area}")

    println(s"I'm ${Person("Carlos").name}")


  }

}
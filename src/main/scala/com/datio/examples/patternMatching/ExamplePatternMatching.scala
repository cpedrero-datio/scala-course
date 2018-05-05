package com.datio.examples.patternMatching

object ExamplePatternMatching {


  /**
    * Matching by types
    * @param x
    * @return
    */
  def matchingTypes(x: Any): String = x match{
    case _: Int => "Int"
    case _: String => "String"
    case _: Long => "Long"
    case _ => "Not contempled"
  }

  /**
    *  Matching by types with sealed trait
    */
  sealed trait Vehicule

  case class Car(brand: String = "Toyota", model: String) extends Vehicule
  case class Bicycle(brand: String = "Orbea", model: String) extends Vehicule

  def identifyVehicule(vehicule: Vehicule): String = vehicule match {
    case _: Bicycle => "I'm a bycicle"
    case _: Car => "I'm a car"
  }

  def identifyVehiculeWithPattern(vehicule: Vehicule): String = vehicule match {
    case Bicycle("Orbea", _) => "I'm a Orbea bycicle"
    case car@Car("Ferrari", _) => {
      // We can use car as val
      s"I'm a Ferrari car model ${car.model}"
    }
    case Car(brand,_) => s"I'm a $brand car"
    case Bicycle(brand,_) => s"I'm a $brand bicycle"
  }

  /**
    * Matching by Values
    * @param x
    * @return
    */
  def matchingValues(x: String): String = x match{
    case "comodin" => "Comodin found"
    case _ => "Comodin not found found"
  }

}

package com.datio.exercises

import org.scalatest.{FlatSpec, Matchers}

class SoccerPlayerTest extends FlatSpec with Matchers{
import Soccer._

  "Soccer player" should "Midfielder with price 1001 should return Villarrolla from Realmadrid" in{
    whoIs(Midfielder("Villarrolla", 1001L, "Real Madrid")) shouldEqual ("Villarrolla", "Real Madrid")
  }
  it should "FordWard with name Ronaldo should return Ronaldo from Realmadrid" in{
    whoIs(Forward("Ronaldo", 1L, "Real Madrid")) shouldEqual ("Ronaldo", "Real Madrid")
  }
  it should "Defender with name Ronaldo should return Ronaldo from Realmadrid" in{
    whoIs(Forward("Messi", 2000L, "Barcelona")) shouldEqual ("", "")
  }

}

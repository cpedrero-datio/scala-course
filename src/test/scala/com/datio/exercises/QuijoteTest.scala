package com.datio.exercises

import org.scalatest.{Matchers, WordSpec}

class QuijoteTest extends WordSpec with Matchers{

  import Quijote._
  "Quijote count words, countGreaterWord method" should  {
    "return 14 as greater word size " in{
      getGreaterWord() shouldEqual 14
    }
  }
  "Quijote count words, countGreaterWord method" should {
    "return (administración, 14) as greater tuple starting by a" in {
      getGreaterWordTuple() shouldEqual ("administración", 14)
    }
  }}

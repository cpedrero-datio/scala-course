package com.datio.examples

import com.datio.examples.basics.PairOdd
import org.scalatest.{Matchers, WordSpec}

class PairOddTest extends WordSpec with Matchers{

  val instance: PairOdd = new PairOdd{}

  "Check pair cases" should{
    "with pair numbers we should get true" in{
      instance.isPair(2) shouldBe true
      instance.isPair(44) shouldBe true
      instance.isPair(-4) shouldBe true
    }
    "with odd numbers we should get false" in{
      instance.isPair(1) shouldBe false
      instance.isPair(11) shouldBe false
      instance.isPair(-1) shouldBe false
    }
  }
  "Check odd cases" should{
    "with odd numbers we should get true" in{
      instance.isOdd(1) shouldBe true
      instance.isOdd(11) shouldBe true
      instance.isOdd(-3) shouldBe true
    }
  }

}

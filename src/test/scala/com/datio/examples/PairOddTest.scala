package com.datio.examples

import com.datio.examples.basics.PairOdd
import org.scalatest.{Matchers, WordSpec}

class PairOddTest extends WordSpec with Matchers{

  val instance: PairOdd = new PairOdd{}

  "Check pair cases" should{
    "with positive pair number we should get true" in{
      instance.isPair(44) shouldBe true
    }
    "with negative pair number we should get true" in{
      instance.isPair(-4) shouldBe true
    }
    "with positive odd number we should get false" in{
      instance.isPair(11) shouldBe false
    }
    "with postive odd number we should get false" in{
      instance.isPair(27) shouldBe false
    }
    "with negative odd number we should get false" in{
      instance.isPair(-1) shouldBe false
    }
  }
  "Check odd cases" should{
    "with positive odd number we should get true" in{
      instance.isOdd(1) shouldBe true
    }
    "with negative odd number we should get true" in{
      instance.isOdd(-3) shouldBe true
    }
    "with postive pair number we should get false" in{
      instance.isOdd(22) shouldBe false
    }
    "with negative pair number we should get false" in{
      instance.isOdd(-46) shouldBe false
    }
  }

}

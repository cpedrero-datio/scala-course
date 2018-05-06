package com.datio.examples

import com.datio.exercises.PairOdd
import org.scalatest.{FlatSpec, Matchers}

// We should import implicit class
import com.datio.examples.eximplicits.ExampleImplicit._

class ImplicitsTest extends FlatSpec with Matchers{

  "In PairOdd" should "let us to use add function, with 2 as result" in{
    new PairOdd{}.add(1,1) shouldEqual 2
  }

}

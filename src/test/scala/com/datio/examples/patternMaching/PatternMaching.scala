package com.datio.examples.patternMaching

import org.scalatest.{FlatSpec, Matchers}

class PatternMaching extends FlatSpec with Matchers{
  import com.datio.examples.patternMatching.ExamplePatternMatching._
  "Method matchingTypes" should "in case string as parameter return 'String'" in{
    matchingTypes("a") shouldEqual "String"
  }
  it should "in case Long as parameter return 'Long'" in{
    matchingTypes(1L) shouldEqual "Long"
  }
  it should "in case Int as parameter return 'Int'" in{
    matchingTypes(1) shouldEqual "Int"
  }

}

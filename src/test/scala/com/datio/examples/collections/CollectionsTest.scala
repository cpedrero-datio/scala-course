package com.datio.examples.collections

import org.scalatest.{Matchers, WordSpec}

import scala.collection.immutable
import scala.collection.mutable.ListBuffer

class CollectionsTest extends WordSpec with Matchers{

  "Map Example" should  {

    "transform values" in{
      val map = Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4, "e" -> 5)
      val newMap = map.map{
        case (key, value) => (key, value+1)
      }
      newMap shouldEqual Map("a" -> 2, "b" -> 3, "c" -> 4, "d" -> 5, "e" -> 6)
    }

    "flatten, reverse, filter key, values" in{
      val map = List(List(1), List(2, 3), List(4, 5))
      val newList = map.flatten.map(_+1).filter(_ % 2 == 0).reverse
      newList shouldEqual List(6,4,2)
    }
  }

  "ListBuffer Example" should  {
    val listBuffer = ListBuffer("Welcome", "to")
    "add elements" in{
      (listBuffer += "Scala" += "Course").mkString(" ") shouldEqual "Welcome to Scala Course"
    }
  }

  "List Example" should  {
    val list: immutable.Seq[Any] = 1 :: "Hi" :: 2 :: "Bye" :: Nil

    "MkString function" in{
      list.mkString("") shouldEqual "1Hi2Bye"
    }

    "zipWithIndex" in{
      list.filter(_.isInstanceOf[String]).zipWithIndex shouldEqual List(("Hi", 0), ("Bye", 1))
    }

  }


}

package com.datio.examples.options

import org.scalatest.{Matchers, WordSpec}

import scala.collection.immutable
import scala.collection.mutable.ListBuffer

class OptionsTest extends WordSpec with Matchers{

  "Options example" should  {
   "With Value" in{
     val option : Option[String] = Some("Valor")
     option.getOrElse("") shouldEqual "Valor"

   }
    "None" in{
      val option : Option[String] = None
      option.getOrElse("Vacio") shouldEqual "Vacio"

    }

    "in case clases" in{
      case class Person(name: String = "Peter", job: Option[String] = None)
      Person() shouldEqual Person("Peter", None)
      val carlos = Person("Carlos", Some("Scala developer"))
      carlos.job.isDefined shouldBe true
      carlos.job.get shouldBe "Scala developer"
    }

    "operations" in{
      val option : Option[String] = Some("Valor")
      option.map(_.toUpperCase).getOrElse("") shouldEqual "VALOR"
    }

    "with pattern matching" in{
      val optionName:Option[String] = Some("Carlos")

      val matching: String = optionName match {
        case Some(name) =>
          name
        case None =>
          "No name value"
      }
      matching shouldEqual "Carlos"

    }

  }

}

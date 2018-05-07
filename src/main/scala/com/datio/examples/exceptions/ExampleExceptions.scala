package com.datio.examples.exceptions

import java.io.{FileNotFoundException, FileReader, IOException}

import scala.util.{Failure, Success, Try}

object ExampleExceptions {

  def errorControl(value: Any) : Either[String, String] = {
    val tryStatement = Try {
      value match{
        case s: String => s
        case e: Exception => throw e
      }
    }
    tryStatement match {
      case Success(f) => Right(f)
      case Failure(f) => f match {
        case ex: FileNotFoundException =>
          Left("ERROR: FileNotFoundException")
        case ex: IOException =>
          Left("ERROR: IOException")
        case ex: Exception =>
          Left("ERROR: comun Exception")
      }
    }
  }

  def main(args: Array[String]) {
      println(errorControl("success").right.get)
      println(errorControl(new IOException()).left.get)
  }
}
package com.datio.exercises

import java.io.InputStream

import scala.collection.immutable
import scala.io.Source

object Quijote {

  val fileStream: InputStream = getClass.getResourceAsStream("/quijote.txt")
  val lines: immutable.Seq[String] = Source.fromInputStream(fileStream).getLines.toList

  /**
    * Get greater word size from Quijote starting with 'a'
    * @return size [[Int]]
    */
  def getGreaterWord():Int={
    ???
  }

  /**
    * Get the greater word size from Quijote starting with 'a' returning tuple (word, size)
    * @return size [[Int]]
    */
  def getGreaterWordTuple():(String, Int)={
    ???
  }
}

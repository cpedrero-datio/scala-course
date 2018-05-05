package com.datio.examples.collections

import scala.collection.mutable
import scala.collection.immutable

object Collections {

  val mutableSeq: mutable.Seq[Int] = mutable.Seq(1, 2, 3, 4, 5)
  val immutableSeq: immutable.Seq[Int] = immutable.Seq(1, 2, 3, 4, 5)

  def main(args: Array[String]): Unit = {

    mutableSeq(0) = -1
    mutableSeq.foreach(println)

//    immutableSeq(0) = -1
//    println(immutableSeq(0))
//
//    val newImmutableSeq = immutableSeq :+ 6
//    newImmutableSeq.foreach(println)
//    println(newImmutableSeq(5))
  }

}


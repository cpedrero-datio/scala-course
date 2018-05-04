package com.datio.examples.basics

trait PairOdd {
  def isPair(x: Int): Boolean = x % 2 == 0

  def isOdd(x: Int): Boolean = x % 2 != 0
}

package com.datio.examples.eximplicits

import com.datio.exercises.PairOdd

object ExampleImplicit {


  implicit class PairOddWithAdd(pairOdd: PairOdd){

    def add(x: Int, y:Int): Int ={
      x + y
    }

  }

}

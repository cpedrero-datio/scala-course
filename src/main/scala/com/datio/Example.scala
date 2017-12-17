package com.datio

import scala.io.Source

object Example extends App {
  override def main(args: Array[String]) {
    val fileStream = getClass.getResourceAsStream("/folder/prop.properties")
    for (line <- Source.fromInputStream(fileStream).getLines) {
      println(line)
    }
  }
}

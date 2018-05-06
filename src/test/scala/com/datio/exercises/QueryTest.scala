package com.datio.exercises

import com.datio.exercises.Query._
import org.scalatest.{FlatSpec, Matchers}

class QueryTest extends FlatSpec with Matchers {

  val table = "table"
  "Select query without fields" should "return complete select query" in {
    new Select().createQuery(table) shouldEqual s"SELECT * FROM $table"
  }
  "Select query with fields" should "return complete select query with fields" in {
    new Select().createQuery(table = table, selectClause = "field1, field2") shouldEqual s"SELECT field1, field2 FROM $table"
  }
  "Select query with fields and where clause" should "return complete select query with fields and where clause" in {
    new Select().createQuery(table, "field1, field2", " where field3=field4") shouldEqual s"SELECT field1, field2 FROM $table where field3=field4"
  }

  "Delete query" should "return complete delete query" in {
    new Delete().createQuery(table) shouldEqual s"DELETE FROM $table"
  }

  "Delete query with fields" should "ignore fields" in {
    new Delete().createQuery(table, "field1, field2") shouldEqual s"DELETE FROM $table"
  }
  "Select query with fields and where clause" should "return complete delete query with where clause" in {
    new Delete().createQuery(table, "field1, field2", " where field3=field4") shouldEqual s"DELETE FROM $table where field3=field4"
  }

}
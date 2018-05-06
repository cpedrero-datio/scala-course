package com.datio.exercises
object Query {

  /**
    * Create Log classes
    */

  class Select extends Query {
    override def queryType(): String = ???

    override def createQuery(table: String, selectClause:String = "*", whereClause: String = ""): String = ???
  }

  class Delete extends Query {
    override def queryType(): String = ???

    override def createQuery(table: String, selectClause:String = "", whereClause: String = ""): String = ???
  }


  trait Query {
    /**
      * Write log
      * @param message
      * @param `type`
      */
    def writeLog(message: String, `type`: String = "INFO"): Unit = ???

    /**
      * Determine query type
      * @return [[String]]
      */
    def queryType(): String

    /**
      * Create Select or delete query.
      * @param table
      * @param selectClause
      * @param whereClause
      * @return complete query [[String]]
      */
    def createQuery(table: String, selectClause:String, whereClause: String): String
  }



}

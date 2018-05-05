package com.datio.exercises

object Soccer {

  sealed trait SoccerPlayer

  case class Defender(name: String, price: Long, team: String) extends SoccerPlayer
  case class Forward(name: String, price: Long, team: String) extends SoccerPlayer
  case class Midfielder(name: String, price: Long, team: String) extends SoccerPlayer

  /**
    * Return Midfielder name and team with price greater than 1000
    * or if player is Ronaldo
    * other cases return ("", "")
    * @param player
    * @return
    */
  def whoIs(player: SoccerPlayer): (String, String) = {
      ???
  }
}
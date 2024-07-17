class Agenda (val meetings: List[Meeting]) {

  def printDaySchedule(day: String): Unit = {
    val meetingsForTheDay = meetings.filter(_.day == day)

    if (meetingsForTheDay.isEmpty) {
      println(s"${day}:")
      println("No meetings on this day.")
    } else {
      val morningMeetings = meetingsForTheDay.filter(_.time.contains("am"))
      val afternoonMeetings = meetingsForTheDay.filter(_.time.contains("pm"))

      if (morningMeetings.nonEmpty) {
        println(s"$day morning:")
        morningMeetings.map(meeting => println(s" ${meeting.time} ${meeting.name}"))
        morningMeetings.foreach(meeting => println(s" ${meeting.time} ${meeting.name}"))
        //      for (meeting <- morningMeetings) {
        //        println(s" ${meeting.time} ${meeting.name}")
        //      }
      }

      if (afternoonMeetings.nonEmpty) {
        println(s"$day afternoon:")
        afternoonMeetings.map(meeting => println(s" ${meeting.time} ${meeting.name}"))
        afternoonMeetings.foreach(meeting => println(s" ${meeting.time} ${meeting.name}"))
        //      for (meeting <- afternoonMeetings) {
        //        println(s" ${meeting.time} ${meeting.name}")
        //      }
      }
    }





//    for (meeting <- meetingsForTheDay) {
//    if (meetingsForTheDay.isEmpty) {
//      println(s"There're no meetings on ${day}")
//    } else {
//      println(s" ${meeting.time} ${meeting.name}")
//    }
//    }
  }
}

class Meeting (val name: String, val day: String, val time: String)

object Main extends App {
  val m1 = new Meeting("Retro", "Friday", "5pm")
  val m2 = new Meeting("Yoga", "Tuesday", "10am")
  val m3 = new Meeting("Team Meeting", "Tuesday", "3pm")
  val agenda = new Agenda(List(m1, m2, m3))
  agenda.printDaySchedule("Monday")
  agenda.printDaySchedule("Tuesday")
  agenda.printDaySchedule("Wednesday")
  agenda.printDaySchedule("Thursday")
  agenda.printDaySchedule("Friday")
}

//class Agenda (val meetings: List[Meeting]) {
//
//  def printDaySchedule(day: String): Unit = {
//    val meetingsForTheDay = meetings.filter(_.day == day)
//    println(s"$day:")
//    for (meeting <- meetingsForTheDay) println(s"  ${meeting.time}: ${meeting.name}")
//  }
//
//}
//
//class Meeting (val name: String, val day: String, val time: String)
//
//object Main extends App {
//  val m1 = new Meeting("Retro", "Friday", "5pm")
//  val m2 = new Meeting("Yoga", "Tuesday", "10am")
//  val m3 = new Meeting("Team Meeting", "Tuesday", "3pm")
//  val agenda = new Agenda(List(m1, m2, m3))
//  agenda.printDaySchedule("Monday")
//  agenda.printDaySchedule("Tuesday")
//}



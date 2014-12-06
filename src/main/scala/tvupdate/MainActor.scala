package tvupdate

import akka.actor.{Props, ActorLogging, Actor}

case class Begin()

class MainActor extends Actor with ActorLogging {
  def receive = {
    case Begin() =>
      log.info("Beginning stuff")
      //context.system.shutdown()
  }
}


object MainActor {
  val props = Props[MainActor]
}

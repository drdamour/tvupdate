package tvupdate

import akka.actor.ActorSystem

object ApplicationMain extends App {
  val system = ActorSystem("MyActorSystem")


  val main = system.actorOf(MainActor.props, "mainActor")

  main ! Begin()


  system.awaitTermination()
}
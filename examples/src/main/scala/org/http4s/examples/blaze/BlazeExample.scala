package org.http4s.examples.blaze


/**
* @author Bryce Anderson
*         Created on 3/26/14.
*/

import org.http4s.blaze.BlazeServer
import org.http4s.examples.ExampleService

object BlazeExample extends App {
  println("Starting Http4s-blaze example")
  BlazeServer.newBuilder
    .mountService(ExampleService.service, "/http4s")
    .run()
}

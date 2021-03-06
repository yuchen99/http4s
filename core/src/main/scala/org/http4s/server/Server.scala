package org.http4s
package server

import scalaz.concurrent.Task

trait Server {
  def start: Task[this.type]

  def run(): this.type = start.run

  def shutdown: Task[this.type]

  def shutdownNow(): this.type = shutdown.run

  def onShutdown(f: => Unit): this.type
}

trait ServerBuilder { self =>
  type To <: Server

  def mountService(service: HttpService, prefix: String = ""): this.type

  def build: To

  def withPort(port: Int): this.type

  def start: Task[To] = build.start

  def run(): To = start.run
}


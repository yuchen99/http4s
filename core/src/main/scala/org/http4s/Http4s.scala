package org.http4s

trait Http4s extends AnyRef
  with HttpBodyFunctions
  with StatusInstances
  with WritableInstances
  with middleware.PushSupport.PushSyntax
  with util.CaseInsensitiveStringSyntax
  with ResponseSyntax
  with util.JodaTimeInstances
  with util.JodaTimeSyntax
  with util.TaskInstances

object Http4s extends Http4s

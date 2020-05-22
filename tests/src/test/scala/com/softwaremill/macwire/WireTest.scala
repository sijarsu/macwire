package com.softwaremill.macwire

object WireTest extends App {
  class A()
  class B(val oa: Option[A])

  object TestSome {
    val a = new A()
    val b = wire[B]
  }

  object TestNone {
    val b = wire[B]
  }

  require(TestSome.b.oa.contains(TestSome.a))
  require(TestNone.b.oa.isEmpty)
}

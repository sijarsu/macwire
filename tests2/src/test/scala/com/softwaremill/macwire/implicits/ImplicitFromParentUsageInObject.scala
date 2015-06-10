package com.softwaremill.macwire.implicits

import com.softwaremill.macwire.Macwire

// For some reason this compiles when run as a compile-test, hence putting it in tests2.
object ImplicitFromParentUsageInObject extends Macwire {
  case class B()
  case class A(implicit val b: B)

  trait Parent {
    implicit val b = new B
  }

  trait Child extends Parent {
    val a = wire[A]
  }
}
package com.softwaremill.macwire.akkasupport

import com.softwaremill.macwire.CompileTestsSupport

class CompileTests extends CompileTestsSupport {

  runTestsWith(
    expectedFailures = List(
      "wireProps-3-missingDependency" -> List("Cannot find a value of type: [A]"),
      "wireAnonymousActor-3-missingDependency" -> List("Cannot find a value of type: [A]"),
      "wireActor-3-missingDependency" -> List("Cannot find a value of type: [A]"),
      "wireAnonymousActor-3.1-missingActorRefFactoryDependency" -> List("Cannot find a value of type: [akka.actor.ActorRefFactory]"),
      "wireActor-3.1-missingActorRefFactoryDependency" -> List("Cannot find a value of type: [akka.actor.ActorRefFactory]"),
      "wireProps-6-injectAnnotationButNoDependencyInScope" -> List("Cannot find a value of type: [C]"),
      "wireAnonymousActor-6-injectAnnotationButNoDependencyInScope" -> List("Cannot find a value of type: [C]"),
      "wireActor-6-injectAnnotationButNoDependencyInScope" -> List("Cannot find a value of type: [C]"),
      "wireProps-7-notActor" -> List("type arguments [NotActor] do not conform to macro method wireProps's type parameter bounds [T <: akka.actor.Actor]"),
      "wireAnonymousActor-7-notActor" -> List("type arguments [NotActor] do not conform to macro method wireAnonymousActor's type parameter bounds [T <: akka.actor.Actor]"),
      "wireActor-7-notActor" -> List("type arguments [NotActor] do not conform to macro method wireActor's type parameter bounds [T <: akka.actor.Actor]"),
      "wireProps-11-toManyInjectAnnotations" -> List("Ambiguous constructors annotated with @javax.inject.Inject for type [SomeActor]"),
      "wireAnonymousActor-11-toManyInjectAnnotations" -> List("Ambiguous constructors annotated with @javax.inject.Inject for type [SomeActor]"),
      "wireActor-11-toManyInjectAnnotations" -> List("Ambiguous constructors annotated with @javax.inject.Inject for type [SomeActor]"),
      "wireProps-12-noPublicConstructor" -> List("Cannot find a public constructor for [SomeActor]"),
      "wireAnonymousActor-12-noPublicConstructor" -> List("Cannot find a public constructor for [SomeActor]"),
      "wireActor-12-noPublicConstructor" -> List("Cannot find a public constructor for [SomeActor]"),
      "wireActor-13-missingImplicitDependency" -> List("could not find implicit value for parameter e: D"),
      "wireAnonymousActor-13-missingImplicitDependency" -> List("could not find implicit value for parameter e: D"),
      "wireProps-13-missingImplicitDependency" -> List("could not find implicit value for parameter e: D"),
      "wireActorWithProducer-3-missingDependency" -> List("Cannot find a value of type: [A]"),
      "wireActorWithProducer-6-injectAnnotationButNoDependencyInScope" -> List("Cannot find a value of type: [C]"),
      "wireActorWithProducer-7-notActorProducer" -> List("wireActorWith does not support the type: [NotProducer]"),
      "wireActorWithProducer-11-toManyInjectAnnotations" -> List("Ambiguous constructors annotated with @javax.inject.Inject for type [SomeActorFactory]"),
      "wireActorWithProducer-12-noPublicConstructor" -> List("Cannot find a public constructor for [SomeActorFactory]"),
      "wireActorWithProducer-13-missingImplicitDependency" -> List("could not find implicit value for parameter e: D"),
      "wireAnonymousActorWithProducer-3-missingDependency" -> List("Cannot find a value of type: [A]"),
      "wireAnonymousActorWithProducer-6-injectAnnotationButNoDependencyInScope" -> List("Cannot find a value of type: [C]"),
      "wireAnonymousActorWithProducer-7-notActorProducer" -> List("wireAnonymousActorWith does not support the type: [NotProducer]"),
      "wireAnonymousActorWithProducer-11-toManyInjectAnnotations" -> List("Ambiguous constructors annotated with @javax.inject.Inject for type [SomeActorFactory]"),
      "wireAnonymousActorWithProducer-12-noPublicConstructor" -> List("Cannot find a public constructor for [SomeActorFactory]"),
      "wireAnonymousActorWithProducer-13-missingImplicitDependency" -> List("could not find implicit value for parameter e: D"),
      "wirePropsWithProducer-3-missingDependency" -> List("Cannot find a value of type: [A]"),
      "wirePropsWithProducer-6-injectAnnotationButNoDependencyInScope" -> List("Cannot find a value of type: [C]"),
      "wirePropsWithProducer-7-notActorProducer" -> List("wirePropsWith does not support the type: [NotProducer]"),
      "wirePropsWithProducer-11-toManyInjectAnnotations" -> List("Ambiguous constructors annotated with @javax.inject.Inject for type [SomeActorFactory]"),
      "wirePropsWithProducer-12-noPublicConstructor" -> List("Cannot find a public constructor for [SomeActorFactory]"),
      "wirePropsWithProducer-13-missingImplicitDependency" -> List("could not find implicit value for parameter e: D")
    ),
    expectedWarnings = List()
  )
}

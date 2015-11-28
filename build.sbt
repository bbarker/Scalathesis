name := "Scalathesis root project"

lazy val root = project.in(file(".")).
  aggregate(scalathesisJS, scalathesisJVM).
  settings(
    publish := {},
    publishLocal := {}
  )

lazy val scalathesis = crossProject.in(file(".")).
  settings(
    name := "scalathesis",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.11.7"
  ).
  jvmSettings(
    // Add JVM-specific settings here
  ).
  jsSettings(
    // Add JS-specific settings here
  )

lazy val scalathesisJVM = scalathesis.jvm
lazy val scalathesisJS = scalathesis.js

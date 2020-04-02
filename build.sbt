lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "vis-network Facade",
    normalizedName := "visnetwork-facade",
    version := "0.1",
    organization := "com.atheriault",
    scalaVersion := "2.13.1",
    scalacOptions in ThisBuild ++= Seq("-feature", "-deprecation"),
    crossScalaVersions := Seq("2.12.10", "2.13.1"),
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "1.0.0"
    )
  )

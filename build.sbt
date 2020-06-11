organization := "com.sergigp.supernova"
name := "supernova"

version := "0.0.1"

homepage := Some(url("https://github.com/sergigp/supernova"))

bintrayPackageLabels := Seq("cqrs", "supernova")

licenses ++= Seq(("MIT", url("http://opensource.org/licenses/MIT")))
lazy val publishSettings = Seq(
  bintrayRepository := "supernova"
)

crossScalaVersions := Seq("2.12.4", "2.13.1")

libraryDependencies ++= Seq(
  "org.slf4j"     % "slf4j-api"  % "1.7.28",
  "org.scalatest" %% "scalatest" % "3.1.0" % Test,
  "org.scalamock" %% "scalamock" % "4.4.0" % Test
)

addCommandAlias("c", "compile")
addCommandAlias("prep", ";scalastyle;test:scalastyle;scalafmtCheck;test:scalafmtCheck")

// Tests
addCommandAlias("tc", "test:compile")
addCommandAlias("t", "test")
addCommandAlias("to", "testOnly")

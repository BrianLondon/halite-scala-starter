name := "bbot"

version := "1.0"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq.empty

mainClass in (Compile, run) := Some("MyBot")
mainClass in assembly := Some("MyBot")

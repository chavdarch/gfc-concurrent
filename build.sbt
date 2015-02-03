name := "gfc-concurrent"

organization := "com.gilt"

scalaVersion := "2.11.5"

crossScalaVersions := Seq("2.11.5", "2.10.4")

libraryDependencies ++= Seq(
  "com.gilt" %% "gfc-logging" % "0.0.2",
  "com.gilt" %% "gfc-time" % "0.0.4" % "test",
  "org.scalatest" %% "scalatest" % "2.2.3" % "test",
  "org.mockito" % "mockito-core" % "1.10.19" % "test"
)

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("Apache-style" -> url("https://raw.githubusercontent.com/gilt/gfc-concurrent/master/LICENSE"))

homepage := Some(url("https://github.com/gilt/gfc-concurrent"))

pomExtra := (
  <scm>
    <url>https://github.com/gilt/gfc-concurrent.git</url>
    <connection>scm:git:git@github.com:gilt/gfc-concurrent.git</connection>
  </scm>
  <developers>
    <developer>
      <id>gheine</id>
      <name>Gregor Heine</name>
      <url>https://github.com/gheine</url>
    </developer>
    <developer>
      <id>ebowman</id>
      <name>Eric Bowman</name>
      <url>https://github.com/ebowman</url>
    </developer>
    <developer>
      <id>andreyk0</id>
      <name>Andrey Kartashov</name>
      <url>https://github.com/andreyk0</url>
    </developer>
  </developers>
)

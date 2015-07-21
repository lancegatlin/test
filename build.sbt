import sbtrelease.Version.Bump.Minor

scalaVersion := "2.11.6"

organization := "net.s_mach"

name := "test"

scalacOptions ++= Seq("-feature","-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test"
)

releaseVersionBump := Minor

val ivyLocal = Resolver.file("local", file(Path.userHome.absolutePath + "/.ivy2/local"))(Resolver.ivyStylePatterns)

publishTo := Some(ivyLocal)

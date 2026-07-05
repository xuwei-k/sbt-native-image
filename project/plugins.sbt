addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.11.2")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.13.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.6.1")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.14.7")

addSbtPlugin("com.github.sbt" % "sbt2-compat" % "0.1.0")

Compile / unmanagedSourceDirectories ++=
  List(
    (ThisBuild / baseDirectory).value.getParentFile / "plugin" / "src" /
      "main" / "scala",
    (ThisBuild / baseDirectory).value.getParentFile / "plugin" / "src" /
      "main" / "scala-3"
  )

Compile / unmanagedResourceDirectories +=
  (ThisBuild / baseDirectory).value.getParentFile / "plugin" / "src" / "main" /
    "resources"

name := """test"""

publishTo := Some(
  Resolver.file(
    "mqtt",
    new File(Option(System.getenv("RELEASE_DIR")).getOrElse("/tmp"))
  )
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)


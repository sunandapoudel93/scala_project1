
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"


lazy val root = (project in file("."))
  .settings(
    name:= "sclala_spark1",
    libraryDependencies += "org.apache.spark" %% "spark-core" % "3.3.0",
    libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.3.0",
    libraryDependencies += "net.snowflake" % "spark-snowflake_2.13" % "2.11.0-spark_3.2"

  )
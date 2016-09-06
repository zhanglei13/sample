name := "sample"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.0.0"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.0.0"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.0.0"
libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "2.0.0"
libraryDependencies += "org.apache.spark" % "spark-hive_2.11" % "2.0.0"
libraryDependencies += "org.apache.spark" % "spark-repl_2.11" % "2.0.0"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.35"
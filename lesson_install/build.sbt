name := "lesson_install"

version := "1.0-SNAPSHOT"

val mysql = "mysql" % "mysql-connector-java" % "5.6.22"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  mysql
)     

play.Project.playJavaSettings

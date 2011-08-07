import sbt._
import Keys._

object BuildGAE extends Build{

  val servletApi = "javax.servlet" % "servlet-api" % "2.5"

  lazy val example = Project("web", file("."),
    settings = {
      Defaults.defaultSettings ++ 
      sbtappengine.AppenginePlugin.webSettings ++ Seq(
        libraryDependencies ++= Seq(
          servletApi
        )
      )
    }
  )
}

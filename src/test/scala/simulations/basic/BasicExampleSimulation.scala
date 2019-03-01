package simulations.basic

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.HeaderNames._
import scala.concurrent.duration._

class BasicExampleSimulation extends Simulation {

  val scn = scenario("My Simple Scenario")
    .exec(http("My favorite search engine")
    .get("http://www.google.com"))

  setUp(scn.inject(atOnceUsers(3)))
}

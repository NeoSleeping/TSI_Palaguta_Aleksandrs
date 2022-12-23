import scala.math.Pi

object Main extends App {
  // Calculates the drag force for an object with radius 0.1, velocity 0.5, and viscosity 1.0
  val dragForce = stokesLaw(0.1, 0.5, 1.0)
  println(s"The drag force is $dragForce")

  def stokesLaw(radius: Double, velocity: Double, viscosity: Double): Double = {
    val dragCoefficient = 6 * Pi * viscosity * radius
    dragCoefficient * velocity
  }
}
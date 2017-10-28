package bot

import hlt.{Planet, Ship}

/**
  * Type class for objects that can have a position
  */
trait HasPos[A] {
  def xPos(a: A): Double
  def yPos(a: A): Double
}

object HasPos {
  def distance[A : HasPos, B : HasPos](a: A, b: B): Double = {
    val ahp = implicitly[HasPos[A]]
    val bhp = implicitly[HasPos[B]]
    Math.sqrt((ahp.xPos(a) - bhp.xPos(b)) * (ahp.xPos(a) - bhp.xPos(b)) +
      (ahp.yPos(a) - bhp.yPos(b)) * (ahp.yPos(a) - bhp.yPos(b)))
  }

  implicit object ShipHasPos extends HasPos[Ship] {
    override def xPos(a: Ship): Double = a.xPos
    override def yPos(a: Ship): Double = a.yPos
  }

  implicit object PlanetHasPos extends  HasPos[Planet] {
    override def xPos(a: Planet): Double = a.xPos
    override def yPos(a: Planet): Double = a.yPos
  }
}

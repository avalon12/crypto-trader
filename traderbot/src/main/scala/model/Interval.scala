package model

sealed trait Interval {
  val minutes: Int
  def toSec = minutes * 60
}
object Interval {
  case object m1 extends Interval {
    val minutes = 1
  }

  case object m3 extends Interval {
    val minutes = 3
  }

  case object m5 extends Interval {
    val minutes = 5
  }

  case object m15 extends Interval {
    val minutes = 15
  }

  case object m30 extends Interval {
    val minutes = 30
  }

  case object h1 extends Interval {
    val minutes = 60
  }

  case object h2 extends Interval {
    val minutes = 2 * 60
  }

  case object h4 extends Interval {
    val minutes = 4 * 60
  }

  case object h6 extends Interval {
    val minutes = 6 * 60
  }

  case object h12 extends Interval {
    val minutes = 12 * 60
  }

  case object d1 extends Interval {
    val minutes = 24 * 60
  }

  case object d3 extends Interval {
    val minutes = 3 * 24 * 60
  }

  case object w1 extends Interval {
    val minutes = 7 * 24 * 60
  }
}
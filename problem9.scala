import scala.math.round
import scala.math.sqrt

object P009 {

  def is_pythagorean_triplet( a : Long, b : Long, c : Long ) : Boolean = {
    a*a + b*b == c*c
  }

  def problem8( a : Long, 
	        b : Long) : Long = {
    if (is_pythagorean_triplet(a, b, round(sqrt(a*a+b*b)) ) && 
	a+b+round(sqrt(a*a+b*b))==1000)
      a * b * round(sqrt(a*a+b*b))
    else {
      if (a < 1000 && b < 1000 )
	problem8(a, b+1)
      else if (a < 1000)
	problem8(a+1,a+1)
      else
	0L
    }
  }

  def main(args : Array[String]) {
    println( problem8(1,1) )
  }
  // 31875000
}

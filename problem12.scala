import scala.math.floor
import scala.math.sqrt

object P012 {

  def count_divisors( num : Long ) : Int = {
    2 * ( 2L until floor(sqrt(num)).toLong count { num % _ == 0 } ) + 2
  }

  def triangle_number( num : Long ) : Long = {
    // 1L until num+1 sum
    num*(num+1)/2
  }

  def blah( count : Int, curr_index : Int = 1 ) : Long = {
    if (count_divisors(triangle_number(curr_index)) >= count)
      triangle_number(curr_index)
    else {
      // println( curr_index, count_divisors(triangle_number(curr_index)) )
      blah( count, curr_index+1 )
    }
  }

  def main(args : Array[String]) {
    println( blah( 500, 2771 ) )
  }
  // 76576500
}

object P015 {

  // Problem 15:

  // Starting in the top left corner of a 2x2 grid, there 
  // are 6 routes (without backtracking) to the bottom right corner.
  // How many routes are there through a 20x20 grid?

  // Solution:

  //   It seems like this problem can just be computed by computing
  //   Pascal's triangle recursively. The number (n,k) corresponds to
  //   the number of paths the the kth point on the anti-diagonal of a
  //   n x k grid without backtracking.

  //   For a 20 x 20 grid, the number of path to the bottom right
  //   corner would be equal to 40 choose 20

  def sum_pairs(pair : (Long,Long)) : Long = {
    val (a,b) = pair
    a+b
  }

  def pascals_triangle_row(n : Long) : List[Long] = {
    if (n==0L)
      List(1L)
    else {
      val prev = pascals_triangle_row(n-1)
      val shifted_prev = (prev ++ List(0L)) zip (List(0L) ++ prev)
      shifted_prev map sum_pairs
    }
  }

  def nth_element[T](l : List[T], n : Int) : T = {
    val head :: tail = l
    if (n==0)
      head
    else
      nth_element(tail,n-1)
  }

  def main(args : Array[String]) {
    println( nth_element(pascals_triangle_row(40),20) )
  }
}

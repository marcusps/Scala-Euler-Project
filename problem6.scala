object P006 {

  val sq = (x:Long) => x*x

  def sum( from : Long, to : Long, func : Long => Long, total : Long = 0 ) : Long = {
    if ( from != to )
      sum( from + 1, to, func, total + func(from) )
    else
      total + func(from)
  }

  def main(args : Array[String]) {
    println( sq(sum(1,100, (x: Long) => x )) - sum(1,100, sq ))
  }
// 25164150
}

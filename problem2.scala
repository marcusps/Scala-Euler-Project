object P002 {

  def sum_even_fibo( a : Tuple2[Int,Int], b : Int ) : Int = {
    if ( a._2 >= 4000000 )
      b
    else
      sum_even_fibo( (a._2, a._1+a._2), if (a._2 % 2 == 0) b+a._2 else b )
  }

  def main(args : Array[String]) {
    println( sum_even_fibo( (1,2), 0 ) )
  }

}

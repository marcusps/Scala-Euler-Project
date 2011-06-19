object P002 {

  def sum_even_fibo(a : Tuple2[Int,Int], b : Int, upper_limit : Int) : Int = {
    if (a._2 >= upper_limit)
      b
    else
      sum_even_fibo((a._2, a._1+a._2), if (a._2 % 2 == 0) b+a._2 else b, upper_limit)
  }

  def main(args : Array[String]) {
    println(sum_even_fibo((1,2), 0, 4000000))
    // expected output: 4613732
  }
}

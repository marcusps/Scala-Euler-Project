object P001 {

  def div_sum(num : Int, sum : Int) : Int = {
    if (num == 0) 
      sum 
    else   
      div_sum(num - 1, if (num % 3 == 0 || num % 5 == 0) sum + num else sum)
  }

  def main(args : Array[String]) {
    println(div_sum( 999, 0 ))
    // expected output: 233168
  }

}

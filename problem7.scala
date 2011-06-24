object P007 {

  def is_prime( num : Long, div : Long = 2 ) : Boolean = {
    if (div <= math.sqrt(num) && num % div != 0)
      is_prime(num, div+1)
    else if (div <= math.sqrt(num) && num % div == 0)
      false
    else
      true
  }

  def nth_prime( n : Int, curr_index : Int, curr_num : Long = 2) : Long = {
    if (is_prime( curr_num ) && n == curr_index)
      curr_num
    else if (is_prime( curr_num )) {
      // println(curr_num,curr_index)
      nth_prime(n, curr_index+1, curr_num+1)
    } else if (!is_prime(curr_num)) {
      nth_prime(n, curr_index, curr_num+1)
    } else
      0
  }

  def main(args : Array[String]) {
    println( nth_prime(10001,1) )
  }
  // 104743
}

object P010 {

  def is_prime( num : Long, div : Long = 2 ) : Boolean = {
    if (div <= math.sqrt(num) && num % div != 0)
      is_prime(num, div+1)
    else if (div <= math.sqrt(num) && num % div == 0)
      false
    else
      true
  }

  def sum_primes_up_to( max : Long, curr_num : Long = 3, sum : Long = 2 ) : Long = {
    if (curr_num > max)
      sum
    else {
      if (is_prime(curr_num))
	sum_primes_up_to(max, curr_num + 2, sum + curr_num)
      else
	sum_primes_up_to(max, curr_num + 2, sum)
    }
  }

  def main(args : Array[String]) {
    println( sum_primes_up_to( 2000000L ) )
  }
  // 142913828922
}

object P003 {

  def maxfactor( num : Long, factor : Long, primes : List[Long] ) : Long = {
    if ( num % factor == 0 ) {
      maxfactor( num / factor, factor, primes )
    } else if ( num == 1 ) {
      factor
    } else {
      maxfactor( num, nextprime( factor, primes ), factor :: primes )
    }
  }

  def nextprime( num : Long, primes : List[Long] ) : Long = {
    if ( primes.filter( s => ( num + 1 ) % s == 0 ).length == 0 ) {
      num + 1
    } else {
      nextprime( num + 1, primes )
    }
  }

  def main(args : Array[String]) {
    println( maxfactor( 600851475143L, 3, List( 2 ) ) )
    // expected output: 6857
  }

}

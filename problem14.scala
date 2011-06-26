object P014 {

  def collatz_length( num : Long, length : Long = 1 ) : Long = {
    if (num == 1)
      length
    else if (num % 2 == 0) {
      // println( num/2 )
      collatz_length( num/2, length+1 )
    } else {
      // println( 3*num+1 )
      collatz_length( 3*num+1, length+1 )
    }
  }

  def longest_collatz_seq_start( max_start : Long, 
				 curr : Long = 1, 
				 max_length : Long = 0,
				 start : Long = 0 ) : Long = {
    if (curr < max_start) {
      val curr_length = collatz_length( curr ) 
      if (max_length < curr_length) {
	longest_collatz_seq_start( max_start, 
			           curr+1, 
			           curr_length,
			           curr )
      } else {
	longest_collatz_seq_start( max_start, 
			           curr+1, 
			           max_length,
			           start )
      }
    } else {
      start
    }
  }

  def main(args : Array[String]) {
    println( longest_collatz_seq_start( 1000000L ) )
  }
  // 837799
}

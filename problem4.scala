object P004 {

  def is_palindrome(list : List[Int]) : Boolean = {
    val rlist = list.reverse
    list == rlist
  }

  def is_palindrome(num : Long) : Boolean = {
    is_palindrome( to_digits(num) )
  }

  def to_digits_helper(num : Long, list : List[Int]) : List[Int] = {
    if (num == 0)
      list
    else
      to_digits_helper( num/10, (num % 10L).toInt :: list )
  }

  def to_digits(num : Long) : List[Int] = {
    to_digits_helper(num, List[Int]())
  }

  def blah(a : Long, b : Long, l : Long) : Long = {
    if (a < 999) {
      blah(a+1, b, if (is_palindrome(a*b) && a*b > l) a*b else l)
    }
    else if (b < 999) {
      blah(100, b+1, if (is_palindrome(a*b) && a*b > l) (a*b) else l)
    }
    else
      if (is_palindrome(a*b)) (a*b) else l
  }

  def main(args : Array[String]) {
    println( blah(100, 100, 1) )
    // expected output: 906609
  }

}

object P005 {

  def div_by_all(num : Long, list : List[Long]) : Long = {
    if (list map { num % _ == 0 } reduceLeft { _ && _ })
      num
    else
      div_by_all(num+1,list)
  }

  def main(args : Array[String]) {
    println( div_by_all(2520L, List(5,7,9,11,13,16,17,19) ) )
  }
// 232792560
}

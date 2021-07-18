import Q4._

object Q5 extends App {

  def evenCheck (n:Int, result:Boolean): Int = {
    if (result) {
      evenAdd(n)
    }
    else {
      evenAdd(n-1)
    }
  }

  def evenAdd(n: Int): Int ={
    if (n==0){
      0
    }
    else {
      n + evenAdd(n-2)
    }
  }

  print("Enter the number : ")
  var number = scala.io.StdIn.readInt()
  var result = Q4.isEven(number)
  val sum = evenCheck(number,result)
  print(sum)

}

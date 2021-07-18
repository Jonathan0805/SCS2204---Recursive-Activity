import Q1._

object Q2 extends App
{
  def prime(x:Int)
  {
    primeInitiate(x,1)
  }

  def primeInitiate(x:Int,y:Int)
  {
    if(x+1==y){
      return
    }
    else if(Q1.prime(y))
    {
      println(y)
    }
    primeInitiate(x,y+1)

  }

  print("Enter the number : ")
  var result=scala.io.StdIn.readInt()
  prime(result)

}

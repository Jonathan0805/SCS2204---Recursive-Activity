object Q1 extends App {

  def primeInitiate (x:Int ,y:Int):Boolean = {
    if (x==y) {
      true
    }
    else {
      if (x%y==0) {
        false
      }
      else {
        primeInitiate(x, y+1)
      }
    }
  }

  def prime (x:Int): Boolean = {
    primeInitiate(x, 2)
  }

  print ("Enter the number : ")
  val number = scala.io.StdIn.readInt()
  val result = prime(number)
  print (result)

}

object Q4 extends App {

  def isEven (n:Int) : Boolean = {
    if (n==2) {
      true
    }
    else if (n==1) {
      false
    }
    else {
      isEven(n-2)
    }
  }

  print("Enter the number : ")
  var number = scala.io.StdIn.readInt()
  var result = isEven(number)
  if (result){
    print("n is even")
  }
  else{
    print("n is odd")
  }

}

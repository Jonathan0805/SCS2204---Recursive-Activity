object Q6 extends App {

  def fibonacci (n:Int) : Int = {
    if (n==0) {
      0
    }
    else if (n==1 || n==2) {
      1
    }
    else {
      fibonacci(n-2) + fibonacci(n-1)
    }

  }

  print("Enter the number : ")
  var number = scala.io.StdIn.readInt()

  for(i <- 0 until number) {
    print(fibonacci(i) + " ");
  }

}

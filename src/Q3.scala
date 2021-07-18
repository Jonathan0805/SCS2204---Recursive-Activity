object Q3 extends App {

  def sum (n:Int):Int = {
    if (n==1){
      1
    }else{
      n+sum(n-1)
    }
  }

  print("Enter the number : ")
  var number = scala.io.StdIn.readInt()
  var result = sum(number)
  print(result)

}

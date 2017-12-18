package Chapter2

/**
  * Created by HoangVT on 12/18/17.
  */


object MainObject {



  def fib(n:Int):Int = n match
  {
        case 0 => 1
        case 1 => 1

        case _ => fib(n-1) + fib(n-2)
  }

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean =
  {
    @annotation.tailrec
    def loop(n:Int):Boolean =
    {
      if ( n >= as.length -1) true
      else if (ordered(as(n),as(n+1))) false
      else loop(n+1)

    }
    loop(0);
  }





  def main(args: Array[String]): Unit =
  {
    println("==>"+fib(5));
    var X:Array[Int] =Array(1,2,3,4,6,7);
    println("==>" +isSorted[Int](X,(A,B)=>(A>B)))

  }

}

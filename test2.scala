object test2 {
  def main(arg: Array[String]): Unit = {
    var k,i,j = 2
    var m,n = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    var a1 = k+12*m
    println(a1)

    var a2 = m/j 
    println(a2)

    var a3 = n%j
    println(a3)

    var a4 = m/j*j
    println(a4)

    var a5 = f+10*5+g
    println(a5)

    //var a6 = ++i*n COMPILATION error while running. Not running in scala but run in Java
    //println(a6)

  }


}

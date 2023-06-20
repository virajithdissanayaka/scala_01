object test3 {
  def main(arg: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f

    b-=1
    println((b*a)+(c*d))
    d-=1
    println("a++ : " + a)
    a+=1
    //in part c there is a 'g' letter
    println("c=c++ :"+c)
    c+=1
    c+=1
    println("c=++c*a++ :" + c*a)
    a+=1
  }

}

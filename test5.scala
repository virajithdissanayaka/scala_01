object test5 {
  def main(arg: Array[String]): Unit = {
    //15--120

    //5--160
    //10--140

    //20--100
    //25--80
    //30--60
    //35--40
    //40--20

    var max_price = 0
    var ticket_price = 5
    var max_profit = 0

    while(ticket_price<40){
      if(max_profit<profit(ticket_price)){
        max_profit=profit(ticket_price)
      }
      ticket_price=ticket_price+5
    }
    println(max_profit)

  }

  def attendees(price: Int): Int = 120 + (15 - price) / 5 * 20

  def revenue(price: Int): Int = attendees(price) * price

  def cost(price: Int): Int = 500 + attendees(price)*3

  def profit(price: Int): Int = revenue(price) - cost(price)
}

package example

import model._
import org.joda.time.DateTime

object Hello extends Greeting with App {

  val btcEur = TradePair("btc","eur")
  MarketOrder(buy = true, btcEur, OrderStatus.Created, new DateTime(), None, None)
  LimitOrder(buy = true, btcEur, OrderStatus.Created, 0.0, new DateTime(), None, None)
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}

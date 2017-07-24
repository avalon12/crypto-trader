package application

import model._
import org.joda.time.DateTime

object Application extends App {

  val btcEur = TradePair("btc","eur")
  MarketOrder(buy = true, btcEur, OrderStatus.Created, new DateTime(), None, None)
  LimitOrder(buy = true, btcEur, OrderStatus.Created, 0.0, new DateTime(), None, None)

  println("App ran...")
}


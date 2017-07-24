package model

import org.joda.time.DateTime


sealed trait Order {
  val id: Id
  val buy: Boolean
  val tradePair: TradePair
  val orderType: OrderType
  val createdAt: DateTime
  val executedAt: Option[DateTime]
  val trades: Set[Trade]
  val broker: Broker
}

case class MarketOrder(id: Id, buy: Boolean, tradePair: TradePair, status: OrderStatus, trades: Set[Trade], createdAt: DateTime, executedAt: Option[DateTime], expires: Option[DateTime], broker: Broker) extends Order {
  val orderType = OrderType.Market
}

case class LimitOrder(id: Id, buy: Boolean, tradePair: TradePair, status: OrderStatus, limitPrice: Price, trades: Set[Trade], createdAt: DateTime, executedAt: Option[DateTime], expires: Option[DateTime], broker: Broker) extends Order {
  val orderType = OrderType.Limit
}

sealed trait OrderType
object OrderType {
  case object Market extends OrderType
  case object Limit extends OrderType
}

sealed trait OrderStatus
object OrderStatus {
  case object Created extends OrderStatus
  case object Partial extends OrderStatus
  case object Complete extends OrderStatus
  case object Cancelled extends OrderStatus
}
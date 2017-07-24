package model

import org.joda.time.DateTime

case class Trade(id: Id, buy: Boolean, tradePair: TradePair, price: Price, volume: Volume, feeAmount: Price, feeSymbol: Symbol, createdAt: DateTime, executedAt: Option[DateTime], expires: Option[DateTime], tradeType: Option[TradeType])

sealed trait TradeType
object TradeType {
  case object LimitTrade extends TradeType
  case object MarketTrade extends TradeType
}
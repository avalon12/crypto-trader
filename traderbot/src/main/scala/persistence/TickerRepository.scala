package persistence

import model.{Ticker, TradePair}
import org.joda.time.DateTime

import scala.concurrent.Future

abstract class TickerRepository {
  def addTickers(tickers: Set[Ticker]): Future[Unit]

  def getTickers(tradePair: TradePair, from: Option[DateTime] = None, to: Option[DateTime] = None): Future[Set[Ticker]]
}

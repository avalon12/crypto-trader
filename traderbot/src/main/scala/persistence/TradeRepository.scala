package persistence

import model.{Id, Trade}
import org.joda.time.DateTime

import scala.concurrent.Future

abstract class TradeRepository {
  def addTrades(trades: Set[Trade]): Future[Unit]

  def getTrade(id: Id): Future[Trade]

  def getTrades(from: Option[DateTime] = None, to: Option[DateTime] = None): Future[Set[Trade]]
}

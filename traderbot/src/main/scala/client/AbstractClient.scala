package client

import model._
import org.joda.time.DateTime

import scala.concurrent.Future

abstract class AbstractClient {
  def connect: Future[Unit]

  def shutdown: Future[Unit]

  def createOrder(order: Order): Future[Order]

  def getOrders: Future[Set[Order]]

  def updateOrder(order: Order): Future[Order]

  def getTrades: Future[Set[Trade]]

  def getTicker(interval: Interval, from: DateTime, to: Option[DateTime]): Future[Set[Ticker]]

  def getTicker(tradePair: TradePair, interval: Interval, from: DateTime, to: Option[DateTime]): Future[Map[TradePair,Set[Ticker]]]
}

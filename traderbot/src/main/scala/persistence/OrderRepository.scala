package persistence

import model.{Id, Order}
import org.joda.time.DateTime

import scala.concurrent.Future

abstract class OrderRepository {
  def addOrder(order: Order): Future[Unit]

  def getOrder(id: Id): Future[Order]

  def getOrders(from: Option[DateTime] = None, to: Option[DateTime] = None): Future[Set[Order]]
}

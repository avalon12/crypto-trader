package object model {
  type Id = String
  type Symbol = String
  type Price = BigDecimal
  type Volume = BigDecimal

  case class TradePair(baseCurrency: Symbol, marketCurrency: Symbol)
}

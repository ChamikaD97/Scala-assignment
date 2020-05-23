object Q3 extends App {
  def bookPrice(copies: Int) : Double = copies*24.95
  def discount(price : Double) : Double = price*40/100
  def shippingCharges(copies:Int):Double = {
    if(copies>50) (50*3 + (copies-50)*0.75)
  }
  def tot(copies : Int) : Double = bookPrice(60)-discount(bookPrice(60))+shippingCharges(60)

  print("Total cost for 60 copies of the book: Rs." + tot(60))
}
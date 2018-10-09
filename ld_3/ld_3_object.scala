/*
f(y)=x-y^2
f'(y)=-2y
y:=y-f(y)/f'(y)=(2y^2+x-y^2)/2y=(y+x/y)/2
*/

object SRoot extends App{
	def square(d:Double):Double = d * d

	def abs(d:Double):Double = if (d>0) d else -d

	def isGoodEnough(y:Double, x:Double):Boolean = abs(square(y) - x) < 0.001

	def improve(y:Double, x:Double):Double = (y + x/y)/2

	def sqrtIter(y:Double, x:Double):Double = if (isGoodEnough(y, x)) y else sqrtIter(improve(y, x), x)

	def sqrt(x:Double):Double = {
		if (x>=0) sqrtIter(1, x) 
		else throw new IllegalArgumentException("value should not be negative!")
	}

	//code
	private[this] var ch:Boolean=true
	do{
		try{
			print("Enter double value: ")
			val d=io.StdIn.readDouble()
			println("\nsqrt("+d+") equals to "+sqrt(d))
			ch=false
		}catch {
			case _:NumberFormatException => println("\nnot double!\n")
			case e:IllegalArgumentException => println(e.getMessage + "\n")
		}
	} while(ch)
}
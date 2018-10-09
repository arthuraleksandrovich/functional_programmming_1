Calculate the square root of parameter "x" using classic Newton’s method (successive approximations).
https://en.wikipedia.org/wiki/Newton%27s_method

def sqrt(x: Double): Double = ...


To compute sqrt(x) start with an initial estimate y (you can pick y = 1).
Repeatedly improve the estimate by taking the mean of y and x/y (e.g. "(y + x/y) / 2").
Test to check for terminatation (e.g. when Math.abs(square(y)-x) < 0.001)

Hint, you may need to define the following functions
def sqrt(x: Double) ...

def square(x: Double) ...

def isGoodEnough(y: Double, x: Double) ...

def improve(y: Double, x: Double) ...

def sqrtIter(y: Double, x: Double) ...


//1.Crear una función con nombre (integracion) que use el método de Simpson para
//calcular el valor aproximado de cualquier función f(x)
def integracion(a: Double, b: Double, f: Double => Double): Double  = {
  (b - a) * ((f(a) + 4 * f((a + b) / 2) + f(b)) / 6)
}
  /*1. El tipo de dato que devolverá la función integracion
    Devolverá un Double
    2. ¿Cuáles son los parámetros que recibe la función?
    La función está usando como parámetro 2 valores de tipo Double: a y b. Además usa
    como parámetro una función que tiene como parámetro un Double y devuelve otro Double*/


//1.

def f1(x: Double): Double = -math.pow(x, 2) + 8 * x - 12
integracion(3,5,f1)


//2.
def f2(x:Double): Double = 3 * math.pow(x, 2)
integracion(0,2,f2)


//3.

def f3(x:Double): Double = x + 2 * math.pow(x, 2) - math.pow(x, 3) + 5 * math.pow(x,4)
integracion(-1,1,f3)


//4.

def f4(x:Double): Double = (2 * x + 1) / (math.pow(x, 2) + x)
integracion(1,2,f4)


//5.

def f5(x: Double): Double= math.pow(2.7182818284, x)
integracion(0,1,f5)


//6.

def f6(x:Double): Double = 1 / math.sqrt(x - 1)
integracion(2,3,f6)


//7.

def f7(x: Double): Double = 1 / (1 + math.pow(x, 2))
integracion(0,1,f7)


//3. Calcula el error que se presenta en cada aproximación. El error es igual al valor
//absoluto de la resta entre el valor esperado y el valor obtenido,
def errorAproximacion (valorEsperado: Double, valorObtenido: Double): Double = {
  math.abs(valorEsperado - valorObtenido)
}

val errorAproximacion1 = errorAproximacion(7.33, integracion(3,5,f1))
val errorAproximacion2 = errorAproximacion(8, integracion(0,2,f2))
val errorAproximacion3 = errorAproximacion(3.333, integracion(-1,1,f3))
val errorAproximacion4 = errorAproximacion(1.09861, integracion(1,2,f4))
val errorAproximacion5 = errorAproximacion(1.71828, integracion(0,1,f5))
val errorAproximacion6 = errorAproximacion(0.828427, integracion(2,3,f6))
val errorAproximacion7 = errorAproximacion(0.785398, integracion(0,1,f7))
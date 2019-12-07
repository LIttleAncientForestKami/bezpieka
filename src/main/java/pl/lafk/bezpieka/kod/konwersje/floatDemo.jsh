var o = System.out;

void sep(int howMuch) throws InterruptedException {
    var sep = "-".repeat(20);
    o.println(sep);
    java.util.concurrent.TimeUnit.SECONDS.sleep(5);
}

o.println("0.1 + 0.1 + 0.1 == 0.3")
o.println(0.1 + 0.1 + 0.1 == 0.3)
o.println(".1 + .1 + .1")
o.println(.1 + .1 + .1)

sep(5)

o.println(".1 jako binarka?")
o.println(Long.toBinaryString(Double.doubleToLongBits(0.1)))
o.println(".5 jako binarka?")
o.println(Long.toBinaryString(Double.doubleToLongBits(0.5)))

sep(5)

long l = 123456789L;
float f = l;
o.println(f)

sep(5)

o.println("naukowa notacja: e|E jest od exponent czyli wykładnik")
o.println(1.23456792*Math.pow(10,8))
o.println(1.23456792*10)
o.println(1.23456792*10*10 )
o.println(1.23456792*10*10*10)
o.println(1.23456792*10*10*10*10 )
o.println(1.23456792*10*10*10*10*10 )
o.println(1.23456792*10*10*10*10*10*10 )
o.println(1.23456792*10*10*10*10*10*10*10)
o.println(1.23456792*10*10*10*10*10*10*10*10)
o.println(1.23456792*10*10*10*10*10*10*10*10*10)
/exit

package pl.lafk.bezpieka.kod.konwersje;

strictfp class WideSampleThrows {
  private static int subFloatFromInt(int op1, float op2)
                    throws ArithmeticException {
 
    // Cecha ma max 23 bity | Significand is max 23 bits
    if ((op2 > 0x007fffff) || (op2 < -0x800000)) {
      throw new ArithmeticException("Insufficient precision");
    }
 
    return op1 - (int)op2;
  }
 
  public static void main(String[] args) {
    int result = subFloatFromInt(1234567890, 1234567890);
    System.out.println(result); 
  }
}

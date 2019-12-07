package pl.lafk.bezpieka.kod.konwersje;

/**
 * @JLS Despite the fact that loss of precision may occur, a widening primitive conversion
 * never results in a run-time exception (§11.1.1).
 **/
strictfp class WideSampleBad {
  private static int subFloatFromInt(int op1, float op2) {
    return op1 - (int)op2;
  }
 
  public static void main(String[] args) {
    int result = subFloatFromInt(1234567890, 1234567890);
    // This prints -46, not 0, as may be expected
    System.out.println(result); 
  }
}

package pl.lafk.bezpieka.kod.konwersje;

strictfp class WideSample {
  private static int subDoubleFromInt(int op1, double op2) {
    return op1 - (int)op2;
  }
 
  public static void main(String[] args) {
    int result = subDoubleFromInt(1234567890, 1234567890);
    // Działa! | Works as expected
    System.out.println(result); 
  }
 
}

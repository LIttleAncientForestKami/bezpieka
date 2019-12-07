package pl.lafk.bezpieka.kod;

/**
 * Static initializer, initializer, ctor... what if it depends?
 **/
class CycleRearranged {
    private final int value;
    private static final int fate = (int) (Math.random()*100);
    private static final CycleRearranged c = new CycleRearranged();

    private CycleRearranged() {
        value = fate - 10;
    }
 
  public static void main(String[] args) {
    System.out.println(c.value); 
  }
}

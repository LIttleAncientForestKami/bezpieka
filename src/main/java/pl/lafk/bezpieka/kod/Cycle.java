package pl.lafk.bezpieka.kod;

/**
 * Static initializer, initializer, ctor... what if it depends?
 **/
class Cycle {
    private final int value;
    private static final Cycle c = new Cycle();
    private static final int fate = (int) (Math.random()*100);

    private Cycle() {
        value = fate - 10;
    }
 
  public static void main(String[] args) {
    System.out.println(c.value); 
  }
}

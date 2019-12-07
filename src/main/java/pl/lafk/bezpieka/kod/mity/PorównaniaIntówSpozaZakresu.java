package pl.lafk.bezpieka.kod.mity;

/**
 * Suflerem dla klasy Integer będzie oczywiście IntegerCache, zakulisowy machinator i przyspieszacz oraz sprawca wielu konfuzji
 *
 * TODO: sprawdźmy jego zakresy! Co kiedy będzie to liczba za mała lub zbyt duża?
 *
 * @author Tomasz @LAFK_pl Borek
 */
class PorównaniaIntówSpozaZakresu {

    public static void main(String[] args) {
        Integer jeden_i1 = 1;
        Integer jeden_i2 = jeden_i1;

        porównajmy(jeden_i1,
                jeden_i2,
                Integer.valueOf(jeden_i1),
                Integer.valueOf(1),
                new Integer(jeden_i1),
                new Integer(1));

    }

    private static void porównajmy(Integer a, Integer b_a,
                                   Integer c_valOf, Integer d_valOfNr,
                                   Integer e_ctorNr, Integer f_ctor) {

        System.out.println("jedynki, ==");
        System.out.format("a == b_a : %s%n", a==b_a);
        System.out.format("a == c_valOf : %s%n", a==c_valOf);
        System.out.format("a == e_ctorNr : %s%n", a==e_ctorNr);
        System.out.println("=".repeat(20));

        System.out.println("jedynki, equals");
        System.out.format("a.equals(b_a) : %s%n", a.equals(b_a));
        System.out.format("a.equals(c_valOf) : %s%n", a.equals(c_valOf));
        System.out.format("a.equals(e_ctorNr) : %s%n", a.equals(e_ctorNr));
        System.out.println("=".repeat(20));

    }
}

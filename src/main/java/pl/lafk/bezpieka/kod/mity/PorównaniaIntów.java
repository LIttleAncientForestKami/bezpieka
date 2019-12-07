package pl.lafk.bezpieka.kod.mity;

/**
 * Suflerem dla klasy Integer będzie oczywiście IntegerCache, zakulisowy machinator i przyspieszacz oraz sprawca wielu konfuzji
 *
 * TODO:
 * <li>używając własnej pamięci - spróbuj przewidzieć co tu będzie wynikiem, bez odpalania czy podglądania kodu klasy Integer</li>
 * <li>odpal i zweryfikuj swe przewidywania</li>
 * <li>zerknij w konstruktor i metodę {@code Integer.valueOf}</li>
 * @author Tomasz @LAFK_pl Borek
 */
class PorównaniaIntów {

    public static void main(String[] args) {
        Integer jeden_i1 = 1;
        Integer jeden_i2 = jeden_i1;
        Integer jeden_i3 = Integer.valueOf(jeden_i1);
        Integer jeden_i4 = new Integer(1);

        System.out.println("jedynki, ==");
        System.out.format("jeden_i1 == jeden_i2 : %s%n", jeden_i1==jeden_i2);
        System.out.format("jeden_i1 == jeden_i3 : %s%n", jeden_i1==jeden_i3);
        System.out.format("jeden_i1 == jeden_i4 : %s%n", jeden_i1==jeden_i4);
        System.out.println("=".repeat(20));

        System.out.println("jedynki, equals");
        System.out.format("jeden_i1.equals(jeden_i2) : %s%n", jeden_i1.equals(jeden_i2));
        System.out.format("jeden_i1.equals(jeden_i3) : %s%n", jeden_i1.equals(jeden_i3));
        System.out.format("jeden_i1.equals(jeden_i4) : %s%n", jeden_i1.equals(jeden_i4));
        System.out.println("=".repeat(20));
    }
}

package pl.lafk.bezpieka.kod.mity;

/**
 * Operator reszty z dzielenia zwraca > 0 dla stałoliczbowych typów.
 *
 * Prawda?
 *
 * @author Tomasz @LAFK_pl Borek
 */
class ResztaZDzielenia {

    public static void main(String[] args) {
        System.out.println(  5  %   3);
        System.out.println(  5  %  -3);
        System.out.println(  5  % (-3));
        System.out.println(  -5 %  -3);
        System.out.println((-5) %   3);

        int ujemna = -5;
        int limit = 16;
        int tab[] = new int[ujemna % limit];
    }
}
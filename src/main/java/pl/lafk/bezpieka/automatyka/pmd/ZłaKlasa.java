package pl.lafk.bezpieka.automatyka.pmd;

/**
 * Klasa nieprzestrzega dobryk praktyk - zła klasa!
 * Przeczytaj jej kod.
 *
 * TODO:
 * 1. użyj <pre>mvn compile</pre>
 * 2. użyj <pre>mvn pmd:help</pre>
 * 3. użyj <pre>mvn pmd:help -Ddetail=true -Dgoal=<tu cel jaki Cię interesuje></pre>
 * 4. poczytaj przez chwilę
 * 5. użyj <pre>mvn pmd:pmd</pre>
 * 6. zerknij w katalog <pre>target</pre>, na oba pliki XML
 *
 * @author Tomasz @LAFK_pl Borek
 */
public class ZłaKlasa {

        private int nieużywane;

        private String ip = "127.0.0.1";

        public void kodzik() {
            String[] tablica = {"a", "b", "c", "s", "e"};

            try {
                String s = "";
                for (int i = 0; i < tablica.length; ++i) {
                    s = s + tablica[i];
                }
            } catch (Exception e) {
                // tak nie róbcie
            }
            finally {
                // tak też nie róbcie
            }

            System.out.println(ip);
        }
}
    package pl.lafk.bezpieka.kod.mity;

import java.util.Date;

/**
 * Final jest mocne, ale nie wszechmocne!
 * Czyli niezmienność referencji vs niezmienność pól obiektu wskazywanego
 *
 * TODO: odpalając to, pamiętaj, by przekazać flagę <code>-ea</code> maszynie wirtualnej
 * @author Tomasz @LAFK_pl Borek
 */
class FinalZrobiRobotę {

    private final String niezmiennyNapis = "niezmienny napis";
    private final Date niezmiennaData = new Date(2019, 12, 7,
            9, 0,0);

    public static void main(String[] args) {
        final FinalZrobiRobotę fzr = new FinalZrobiRobotę();

        try {
            fzr.niezmiennaData.setMinutes(42);
            assert fzr.niezmiennaData.getMinutes() == 42
                    : "jeśli to widzisz, niezmienna data NIE ma nowej ilości minut";
        } catch (AssertionError ae) {
            System.out.println("asercja na dacie krzyczy!");
            System.err.println(ae.getMessage());
        } finally {
            System.out.println("\n"+"=".repeat(20));

            final String dodatek = " też można zmienić";
            final String złożony = fzr.niezmiennyNapis + dodatek;
            fzr.niezmiennyNapis.concat(dodatek);
            assert fzr.niezmiennyNapis.equals(złożony)
                    : "jeśli to widzisz, niezmienny napis NIE został zmieniony";
        }

    }
}

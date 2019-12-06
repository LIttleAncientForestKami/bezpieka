package pl.lafk.bezpieka.kod;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Klasa czyta z pliku tekstowego posiadającego (załóżmy!) czułe dane...
 *
 * @author Tomasz @LAFK_pl Borek
 */
class CzytaniePliku {
    private final String plik = "teoria.adoc";

    //FIXME: jak użyć tego samego API ale mieć jeden problem mniej?
    String czytanieLiniiBuforemZJawy4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(plik)));
        return br.readLine();
    }

    String poprawioneCzytanieLiniiBuforemZJawy4() throws IOException {
        return "jak tę metodę poprawić?";
    }

    void czytanieZAlokacjąBezpośrednią() {
        ByteBuffer bufor = ByteBuffer.allocateDirect(16 * 1024);
        try (FileChannel czytacz =
                     (new FileInputStream(plik)).getChannel()) {
            while (czytacz.read(bufor) > 0) {
                // tu coś robimy i być może zmieniamy typ zwrotny metody wtedy
                bufor.clear(); // czy to jest potrzebne? śmieciarz nie obskoczy?
            }
        } catch (Throwable e) {
            // tu też powinniśmy coś robić jak źle pójdzie
        }
    }
}

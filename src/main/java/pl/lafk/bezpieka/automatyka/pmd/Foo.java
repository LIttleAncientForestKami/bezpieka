package pl.lafk.bezpieka.automatyka.pmd;

import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Properties;

/**
 * Za PMD
 *
 * @author Tomasz @LAFK_pl Borek
 */
public class Foo {

    void goodKey() {
        SecretKeySpec secretKeySpec = new SecretKeySpec(new Properties().getProperty("key").getBytes(), "AES");
    }

    void badKey() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES");
    }

    void good() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv);
    }

    void bad() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, };
    }

    void alsoBad() {
        byte[] iv = "secret iv in here".getBytes();
    }
}
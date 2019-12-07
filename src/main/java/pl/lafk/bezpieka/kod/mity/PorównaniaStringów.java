package pl.lafk.bezpieka.kod.mity;

/**
 * Jak mawiają mądrzy projektanci API, nie miej dwu API na to samo.
 *
 * Jak mawiają Perlowcy: miej 20 API robiących to samo i niech się dzieje.
 *
 * == (czy !=) vs equals vs equalsIgnoreCase
 *
 * @author Tomasz @LAFK_pl Borek
 */
class PorównaniaStringów {

    public static void main(String[] args) {

        String s1 = "s1";
        String s2 = s1;
        String s3 = new String(s1);
        String s4 = new String("s1");

        System.out.println("==");
        System.out.format("s1 == s2 : %s%n", s1==s2);
        System.out.format("s1 == s3 : %s%n", s1==s3);
        System.out.format("s1 == s4 : %s%n", s1==s4);
        System.out.println("=".repeat(20));

        //TODO: intern, czyli praktykant wrzuca do puli...
        s2 = s2.intern(); s3 = s3.intern(); s4 = s4.intern();
        System.out.println("intern i ==");
        System.out.format("s1 == s2 : %s%n", s1==s2);
        System.out.format("s1 == s3 : %s%n", s1==s3);
        System.out.format("s1 == s4 : %s%n", s1==s4);
        System.out.println("=".repeat(20));

        System.out.format("s1.equals(s2) : %s%n", s1.equals(s2));
        System.out.format("s1.equals(s3) : %s%n", s1.equals(s3));
        System.out.format("s1.equals(s4) : %s%n", s1.equals(s4));
        System.out.println("=".repeat(20));

        String s5 = "S1";
        System.out.format("s1.equals(s2) : %s%n", s1.equals(s5));
        System.out.format("s1==s5 : %s%n", s1==s5);
        System.out.format("s1.equalsIgnoreCase(s5) : %s%n", s1.equalsIgnoreCase(s5));
    }
}
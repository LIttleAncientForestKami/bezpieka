/**
 * <h2>Applety</h2>
 * <ol>
 * <li>applety zaczęły bezpieczeństwo w Jawie</li>
 * <li>applety były powodem wprowadzenia wszystkich narzędzi z {@link pl.lafk.bezpieka.kod.narzędzia}</li>
 * <li>czyli dla appletów powstała piaskownica</li>
 * <li>pierwsza piaskownica w językach programowania OIW - zatem skopana</li>
 * <li>poprawiana przez lata</li>
 * <li>mit "niebezpiecznej Jawy"</li>
 * </ol>
 * <h3>OBECNIE</h3>
 * <ol>
 *     <li>przeglądarki uprzejmie dziękują</li>
 *     <li>ataki tą drogą nadal się zdarzają</li>
 *     <li>forRemoval=false ponieważ wewnętrznie niektórzy jeszcze cisną na appletach</li>
 * </ol>
 * <h2>Sprostowania kilku wybranych mitów</h2>
 * <ol>
 * <li><code>volatile</code> nie gwarantuje że pola tak oznaczonej referencji są bezpieczne</li>
 * <li>{@code java.lang.Thread.sleep()}, {@code java.lang.Thread.yield()}, {@code java.lang.Thread.getState()} sa metodami wątku, ale to nie daje im automagicznie synchronizacji</li>
 * <li>== i equals nie zawsze dają te same rezultaty</li>
 * <li>operatory &amp; i | nie będą identyczne do &amp;&amp; i || (brak skracania obwodu)</li>
 * </ol>
 *
 * Takich mitów jest wiele. W tym pakiecie znajdziecie kilka przykładów.
 *
 * @see pl.lafk.bezpieka.kod.mity.ResztaZDzielenia Operator reszty z dzielenia zwraca &gt; 0 dla stałoliczbowych typów.
 * @see pl.lafk.bezpieka.kod.mity.PorównaniaStringów Porównywania referencji a wartości - i dlaczego wzorzec może skonfundować (napisy).
 * @see pl.lafk.bezpieka.kod.mity.PorównaniaIntów Porównywania referencji a wartości - i dlaczego wzorzec może skonfundować (całkowite).
 * @see pl.lafk.bezpieka.kod.mity.PorównaniaIntówSpozaZakresu ćwiczenie
 * @see pl.lafk.bezpieka.kod.mity.FinalZrobiRobotę Czyli niezmienność referencji vs niezmienność pól obiektu wskazywanego
 **/
package pl.lafk.bezpieka.kod.mity;
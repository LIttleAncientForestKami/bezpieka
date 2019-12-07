/**
 * <h2>Sprostowania kilku wybranych mitów</h2>
 * <ol>
 * <li><code>volatile</code> nie gwarantuje że pola tak oznaczonej referencji są bezpieczne</li>
 * <li>{@code java.lang.Thread.sleep()}, {@code java.lang.Thread.yield()}, {@code java.lang.Thread.getState()} sa metodami wątku, ale to nie daje im automagicznie synchronizacji</li>
 * <li>== i equals nie zawsze dają te same rezultaty</li>
 * <li>operatory & i | nie będą identyczne do && i || (brak skracania obwodu)</li>
 * </ol>
 *
 * Takich mitów jest wiele. W tym pakiecie znajdziecie kilka przykładów.
 *
 * @see ResztaZDzielenia Operator reszty z dzielenia zwraca > 0 dla stałoliczbowych typów.
 * @see Porównania Do not confuse abstract object equality with reference equality
 *  * 73. Never confuse the immutability of a reference with that
 *  * of the referenced object
 */
package pl.lafk.bezpieka.kod.mity;
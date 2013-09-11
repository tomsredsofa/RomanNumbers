package de.codeplumber.roman.transform;

/**
 * Transforms roman numbers into decimal numbers.
 *
 * @author  tom
 *
 */
public class Roman2Decimal {

    public int transform(String roman) {
        if (roman.equalsIgnoreCase("I")) {
            return 1;
        } else if (roman.equalsIgnoreCase("II")) {
            return 2;
        } else if (roman.equalsIgnoreCase("III")) {
            return 3;
        } else {
            throw new IllegalArgumentException("Die Zahl kenne ich (noch) nicht");
        }
    }
}

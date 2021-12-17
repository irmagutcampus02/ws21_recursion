package org.campus02.palindrom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromCheckerTest {

    @Test
    void palindromeCheck() {
        final PalindromChecker palindromChecker = new PalindromChecker();
        assertTrue(palindromChecker.check("sitonapanotis"));
        assertTrue(palindromChecker.check("amanaplanacanalpanama"));
        assertTrue(palindromChecker.check("O Genie, der Herr ehre Dein Ego!"));
        assertTrue(palindromChecker.check("Trug Tim eine so helle Hose nie mit Gurt?"));

        assertFalse(palindromChecker.check("nine"));
        assertFalse(palindromChecker.check("O du Genie, der Herr ehre Dein Ego!"));
    }
}

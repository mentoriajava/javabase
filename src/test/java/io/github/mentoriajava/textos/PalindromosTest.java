package io.github.mentoriajava.textos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Testes Unitarios | Textos | Palindromo")
class PalindromosTest {

    final Palindromos palindromos = null;

    @DisplayName("Com espaco")
    @Test
    void shouldValidateSpacedWords(){
        assertTrue(palindromos.isPalindromo("A nut for a jar of tuna"));
        assertTrue(palindromos.isPalindromo("Al lets Della call Ed Stella"));
        assertTrue(palindromos.isPalindromo("Borrow or rob"));
        assertTrue(palindromos.isPalindromo("Taco cat"));
    }

    @DisplayName("Sem Palindromos")
    @Test
    void shouldValidateNoPalindrome(){
        assertFalse(palindromos.isPalindromo("A net for a jar of tona"));
        assertFalse(palindromos.isPalindromo("Al leets Della call Ed Stella"));
        assertFalse(palindromos.isPalindromo("Borrow nor rob"));
        assertFalse(palindromos.isPalindromo("Take the cat"));
    }

}
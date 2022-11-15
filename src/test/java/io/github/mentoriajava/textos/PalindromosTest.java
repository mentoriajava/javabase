package io.github.mentoriajava.textos;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Testes Unitarios | Textos | Palindromo")
class PalindromosTest {

  final Palindromos palindromos = null;
  @ParameterizedTest
  @MethodSource("isAPalindrome")
  @DisplayName("Palindromo")
  void shouldReturnPalindrome(String value) {
    assertTrue(palindromos.isPalindromo(value));
  }

  @ParameterizedTest
  @MethodSource("isNotPalidrome")
  @DisplayName("Sem Palindromos")
  void shouldReturnNotPalidrome(String value) {
    assertFalse(palindromos.isPalindromo(value));
  }

  private static Stream<String> isNotPalidrome() {
    return
        Stream.of(
            "A net for a jar of tona",
            "Al leets Della call Ed Stella",
            "Borrow nor rob",
            "Take the cat",
            "Abe",
            "Eva"
        );
  }

  private static Stream<String> isAPalindrome() {
    return Stream.of(
        "A nut for a jar of tuna",
        "Al lets Della call Ed Stella",
        "Borrow or rob",
        "Taco cat",
        "AbbA");

  }

}

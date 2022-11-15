package io.github.mentoriajava.matematica;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes Unitarios | Matematica | Bhaskara")
class BhaskaraTest {

  final Bhaskara bhaskara = null;

  @ParameterizedTest
  @MethodSource("bhaskaraValues")
  @DisplayName("Formula de Bhaskara")
  void shouldCalculareBhaskara(int valorA, int valorB, int valorC, int[] resultado) {
    assertArrayEquals(resultado, bhaskara.calculaBhaskara(valorA, valorB, valorC));
  }

  private static Stream<Arguments> bhaskaraValues() {
    return
        Stream.of(
            Arguments.of(1,12,-13,new int[]{1,-13}),
            Arguments.of(2,-16,-18,new int[]{9,-1})
        );
  }

}

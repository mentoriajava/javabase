package io.github.mentoriajava.logica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes Unitarios | Lógica | Cadeados Fortes")
class CadeadosFortesTest {

  final CadeadosFortes cadeadosFortes = null;

  @ParameterizedTest
  @MethodSource("strongestPadlock")
  @DisplayName("Cadeados Fortes")
  void shouldCalculateStrongestPadlocks(Integer[][] cadeados, Integer[] chaves, Integer locais, Integer[] resultados) {
assertArrayEquals(resultados,cadeadosFortes.buscarCadeadosFortes(cadeados,chaves,locais));
  }

  private static Stream<Arguments> strongestPadlock() {
    return
        Stream.of(
            Arguments.of(
                new int[][]{{1,10},{2,9},{3,8},{4,7},{5,8},{6,4},{7,10}},
                new int[]{3,5,7},
                2,
                new int[]{7,3}
            ),
            Arguments.of(
                new int[][]{{1,10},{2,9},{3,8},{4,7},{5,8},{6,4},{7,10}},
                new int[]{1,5,2,4,6},
                4,
                new int[]{1,2,5,4}
            )
        );
  }

}
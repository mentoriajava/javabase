package io.github.mentoriajava.matematica;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes Unitarios | Matematica | Fibonatti")
class FibonacciTest {

    final Fibonacci fibonacci = null;

    @ParameterizedTest(name = "{0} retorna 0")
    @MethodSource("leOneIsZero")
    @DisplayName("Indices menores ou iguais a 1, valor 0")
    void shouldReturn0WhenIndexLE1(int index) {
        assertEquals(0,fibonacci.calculaFibonacci(index));
    }

    @ParameterizedTest(name = "{0} retorna 1")
    @MethodSource("twoAndThreeAreOne")
    @DisplayName("Indice 2 e 3, valor 1")
    void shouldReturn1WhenIndexIs2Or3(int index) {
        assertEquals(1,fibonacci.calculaFibonacci(index));
    }

    @ParameterizedTest(name = "{0} retorna {1}")
    @MethodSource("valuesAndIndexes")
    @DisplayName("Indice condiz com valor")
    void shouldReturnCorrectValueForIndex(int index, int result) {
        assertEquals(result,fibonacci.calculaFibonacci(index));
    }

    private static Stream<Arguments> valuesAndIndexes() {
        return
            Stream.of(
                Arguments.of(1,0),
                Arguments.of(2,1),
                Arguments.of(3,1),
                Arguments.of(4,2),
                Arguments.of(5,3),
                Arguments.of(6,5),
                Arguments.of(7,8),
                Arguments.of(8,13),
                Arguments.of(9,21),
                Arguments.of(10,34)
            );
    }

    private static Stream<Integer> twoAndThreeAreOne() {
        return Stream.of(2,3);
    }

    private static Stream<Integer> leOneIsZero() {
        return Stream.of(1,0,-1,-10,-100,-1000);
    }

}

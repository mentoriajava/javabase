package io.github.mentoriajava.matematica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes Unitarios | Matematica | Fibonatti")
class FibonacciTest {

    final Fibonacci fibonacci = null;

    @Test
    @DisplayName("Indices menores ou iguais a 1, valor 0")
    void shouldReturn0(){
        assertEquals(0,fibonacci.calculaFibonacci(1));
        assertEquals(0,fibonacci.calculaFibonacci(0));
        assertEquals(0,fibonacci.calculaFibonacci(-1));
    }

    @Test
    @DisplayName("Indice 2 e 3, valor 1")
    void shouldReturn1(){
        assertEquals(1,fibonacci.calculaFibonacci(2));
        assertEquals(1,fibonacci.calculaFibonacci(3));
    }

    @Test
    @DisplayName("Indice 4, valor 2")
    void shouldReturn2(){
        assertEquals(2,fibonacci.calculaFibonacci(4));
    }

}
package io.github.mentoriajava.exemplos;

import io.github.mentoriajava.matematica.Fibonacci;

public class TestFibonacci implements Fibonacci {
    @Override
    public int calculaFibonacci(int indice) {
        if (indice < 0)
            return 0;
        if (indice == 1)
            return 0;
        if (indice == 2)
            return 1;
        return calculaFibonacci(indice - 1) + calculaFibonacci(indice - 2);
    }
}

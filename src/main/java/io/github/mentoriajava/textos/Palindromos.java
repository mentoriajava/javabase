package io.github.mentoriajava.textos;

/**
 * Um palíndromo é uma palavra, frase ou qualquer outra sequência de unidades
 * (como uma cadeia de ADN; Enzima de restrição) que tenha a propriedade de poder ser lida
 * tanto da direita para a esquerda como da esquerda para a direita.
 *
 * Num palíndromo, normalmente são desconsiderados os sinais ortográficos
 * (diacríticos ou de pontuação), assim como o espaços entre palavras.
 *
 * A palavra "palíndromo" vem das palavras gregas
 * palin (πάλιν (πάλι, no grego moderno) "para trás, novamente") e
 * dromos (δρόμος, "caminho, rua") - que corre em sentido inverso.
 */
public interface Palindromos {
    boolean isPalindromo(String palavra);
}

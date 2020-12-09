package io.github.mentoriajava.logica;


public interface CadeadosFortes {

    /**
     * Encontre os 'n' cadeados mais fortes que possuem chaves para usar no estacionamento.
     * A ideia e a seguinte, imagine que voce tenha uma relacao de cadeados com a força de cada um
     * e um conjunto de chaves que abrem esses cadeados. Nem todos os cadeados contem chaves e
     * nem todas as chaves possuem cadeados. O desafio é encontrar as chaves que contenham cadeados
     * na ordem correta (do mais forte pro mais fraco)
     * @param cadeados Um array de cadeados. O primeiro valor é o ID, e o segundo é a força.
     * @param chaves Um array de chaves, seu valor representa o ID do cadeado que ela abre.
     * @param n O numero de locais de estacionamento disponiveis.
     * @return Um array com o ID dos cadeados mais fortes.
     */
    Integer[] buscarCadeadosFortes(Integer[][] cadeados, Integer[] chaves, Integer n);
}

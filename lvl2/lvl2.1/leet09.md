A Questão do Dia: 1480. Running Sum of 1d Array

Esta é a questão perfeita para treinar a leitura e escrita simultânea dentro de um array usando o índice i.

A Missão:
Você receberá um array de números inteiros chamado nums. 

Sua tarefa é criar e retornar um novo array de mesmo tamanho onde cada gaveta contém a soma acumulada de todos os números anteriores até aquele ponto.

Exemplo:
    Entrada: nums = [1, 2, 3, 4]
    Saída Esperada: [1, 3, 6, 10]
    Explicação (Passo a passo no índice):
        Índice 0: Mantém o 1.
        Índice 1: Soma $1 + 2 = 3$.
        Índice 2: Soma $3 + 3 = 6$.
        Índice 3: Soma $6 + 4 = 10$.
        
Como Estruturar o Pensamento:
    Crie um array de resposta que tenha exatamente o mesmo tamanho do array nums.
    O primeiro número do novo array será sempre idêntico ao primeiro número do nums.
    Abra um laço for começando do índice 1 (já que o 0 está pronto) e indo até o final.
    Para cada posição i, a nova gaveta recebe o valor da gaveta atual do nums somado ao valor que você acabou de guardar na gaveta anterior (i - 1) do seu novo array.
A Missão
Dado um número inteiro positivo n, retorne o menor número inteiro positivo que seja múltiplo tanto de 2 quanto de n.

A lógica por trás:

Se o número n já for par (múltiplo de 2), o menor múltiplo comum entre ele e 2 é ele mesmo.

Se o número n for ímpar, o menor múltiplo comum será ele multiplicado por 2.

Exemplos:

    Entrada: n = 5

    Saída: 10 (Como 5 é ímpar, a resposta é 5 * 2)

    Entrada: n = 6

    sSaída: 6 (Como 6 já é par, a resposta é ele mesmo)
Você receberá dois números inteiros: num e t.

Um número "alcançável" é um número que você consegue atingir aplicando a seguinte operação exatamente t vezes:
    Aumentar ou diminuir o num em 1.
    Aumentar ou diminuir o número alcançável em 1.

Calma, a charada matemática aqui é simples: Se você quer o maior número alcançável, a cada passo (t) você vai aumentar o num em 1 e também aumentar o seu número alvo hipotético em 1. 
O efeito prático disso é que o limite máximo cresce 2 vezes a cada turno.

A fórmula final é: Resultado = num + (2 * t).

Exemplo:
    Entrada: 
        num = 4, t = 1
        
    Saída Esperada: 
        6
        
Explicação: O número máximo é alcançado somando 2 vezes o valor de t ao num ($4 + 2 \times 1 = 6$).
A Missão:
Você receberá um número inteiro x. Sua tarefa é retornar true (verdadeiro) se o número for um palíndromo, 
e false (falso) caso não seja.

Um número é um palíndromo quando lido da esquerda para a direita e da direita para a esquerda é exatamente igual.

Exemplos:

    Entrada: x = 121

    Saída: true (De trás pra frente continua sendo 121).

    Entrada: x = -121

    Saída: false (De trás pra frente fica 121-, o que não é igual).

    Entrada: x = 10

    Saída: false (De trás pra frente vira 01).

O Mapa da Lógica (Como juntar tudo que aprendemos):

    Condicional rápida (if): Números negativos nunca são palíndromos. Se x for menor que 0, você já pode retornar false logo de cara.

    O Laço (while): Como não sabemos o tamanho do número, usamos o while para desmontar o x original pedaço por pedaço até ele chegar a zero, 
    enquanto construímos um novo número invertido.

A Matemática (Módulo e Divisão):

    Para pegar o último dígito de um número, use x % 10.

    Para "arrancar" o último dígito e atualizar o estado do loop, divida o número por 10 (x / 10 em Java, ou x // 10 no Python para divisão inteira).

Comparação Final (if): 

    O número invertido que você construiu no loop é igual ao número original que você recebeu lá no início?
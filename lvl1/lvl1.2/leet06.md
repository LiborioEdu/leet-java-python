Divisible and Non-divisible Sums Difference

Nesta questão, não usaremos listas ou arrays. Vamos apenas contar do número 1 até um determinado limite e usar o 
nosso velho amigo if/else junto com o % (resto da divisão) dentro do loop!

A Missão:
Você receberá dois inteiros positivos: n e m.
Sua tarefa é verificar todos os números de 1 até n (inclusive).

Se o número não for divisível por m, some ele em uma variável chamada num1.

Se o número for divisível por m, some ele em uma variável chamada num2.

Ao final, retorne o resultado da conta matemática: num1 - num2.

Exemplo:

    Entrada: n = 5, m = 6

    Lógica: Vamos olhar para os números 1, 2, 3, 4, 5.

    Nenhum deles é divisível por 6. Logo, num1 soma todos eles (1+2+3+4+5 = 15).

    Como nenhum é divisível, num2 fica com 0.

    Saída: 15 (Pois 15 - 0 = 15).

Dica de Ouro: Crie as variáveis num1 e num2 valendo zero logo no início da função, antes de abrir o laço for.
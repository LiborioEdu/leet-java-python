class leet02:
    def sum(self, num1, num2):
        if (-100 <= num1 <= 100) and (-100 <= num2 <= 100):
            total = num1 + num2
            return total
        else:
            return 0


solucao = leet02()
resultado = solucao.sum(12,5)
print(resultado)
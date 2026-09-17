class leet06:
    def math06(self, n, m):
        num1 = 0
        num2 = 0

        for i in range(1, n+1):
            if (i % m != 0):
                num1 = num1 + i
            else:
                num2 = num2 + i

        return num1 - num2

answer = leet06().math06(5, 6)
print(answer)
    
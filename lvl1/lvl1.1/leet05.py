class leet05:
    def math05(self, n):
        if (n % 2 == 0):
            return n
        else:
            return n * 2

answer = leet05().math05(5)
print(answer)
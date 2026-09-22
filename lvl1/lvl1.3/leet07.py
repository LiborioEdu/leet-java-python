class leet07:
    def math07(self, num):
        count = 0
        while(num != 0):
            if(num % 2 == 0):
                num = num / 2
            else:
                num -= 1
            count += 1
        return count

answer = leet07().math07(14)
print(answer)
    
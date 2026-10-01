class leet08:
    def palindrome(self, num):
        if num < 0:
            return False
        
        original = num
        invertido = 0
        
        while num > 0:
            digito = num % 10
            invertido = (invertido * 10) + digito
            num = num // 10 
            
        return original == invertido
solucao = leet08()

print("121 é palíndromo?", solucao.palindrome(121))
print("-121 é palíndromo?", solucao.palindrome(-121))
print("10 é palíndromo?", solucao.palindrome(10))
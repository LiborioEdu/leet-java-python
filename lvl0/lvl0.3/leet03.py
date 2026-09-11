class leet03:
    def temp_change(self, celcius):

        kelvin = celcius + 273.15
        fahrenheit = celcius * 1.8 + 32
        
        return [kelvin, fahrenheit]


answer = leet03().temp_change(37)
print(answer) 
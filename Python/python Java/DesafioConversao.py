stringSalario_mes1 = input("digite o seu salario dos ultimos 3 meses: ").replace(',', '.')
stringSalario_mes2 = input().replace(',', '.')
stringSalario_mes3 = input().replace(',', '.')

floatSalario_mes1 = float(stringSalario_mes1)
floatSalario_mes2 = float(stringSalario_mes2)
floatSalario_mes3 = float(stringSalario_mes3)

media = (floatSalario_mes1 + floatSalario_mes2 + floatSalario_mes3)/3

print(f"a média do seu salário é: {round(media, 2)}" )
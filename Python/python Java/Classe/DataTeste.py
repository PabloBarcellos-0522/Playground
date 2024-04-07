from Data import Data1
calendario1 = Data1()
calendario2 = Data1()

print("\nCalendario 1: \nDigite o dia:")
dia = int(input())
calendario1.dia = dia
print("Digite o mês:")
mes = int(input())
calendario1.mes = mes
print("Digite o ano:")
ano = int(input())
calendario1.ano = ano

print("\nCalendario 2: \nDigite o dia:")
dia = int(input())
calendario2.dia = dia
print("Digite o mês:")
mes = int(input())
calendario2.mes = mes
print("Digite o ano:")
ano = int(input())
calendario2.ano = ano

print(f"\n\nCalendario 1: \nDia: {calendario1.dia} \nMês: {calendario1.mes} \nAno: {calendario1.ano}")
print(f"\n\nCalendario 2: \nDia: {calendario2.dia} \nMês: {calendario2.mes} \nAno: {calendario2.ano}")

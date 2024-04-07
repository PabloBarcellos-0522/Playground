import time
import os

print('\n\n=======================================\n')
print('bem vindo a calculadora.py!')
print('escolha a operação que voçê irá querer:')
execucao = True
while execucao:
    print('\n=======================================\n')
    print(' 0: SOMA \n 1: SUBTRAÇÃO \n 2: MULTIPLICAÇÃO \n 3: DIVISÃO \n 4: POTENCIAÇÃO \n')
    print('=======================================\n')
    time.sleep(2)

    print('qual operação voçê irá fazer?')
    numero = int(input())
    print('digite o primeiro numero:')
    primeiro_numero = float(input())
    print('digite o segundo numero:')
    segundo_numero = float(input())
    if numero == 0:

        print(f'\n\n  você escolheu: SOMA entre {primeiro_numero} e {segundo_numero}')
        time.sleep(1)
        resultado = primeiro_numero + segundo_numero
        print(f'\nresultado: {resultado}\n')
        print('=======================================\n')

        time.sleep(1)
        print('\nquer continuar com mais calculos (S/N)?')
        s = input()

        if s == 'S' or s == 's':
            os.system('cls')
        else:
            execucao = False
    elif numero == 1:

        print(f'\n\n  você escolheu: SUBTRAÇÃO entre {primeiro_numero} e {segundo_numero}')
        time.sleep(1)
        resultado = primeiro_numero - segundo_numero
        print(f'\nresultado: {round(resultado, 2)}\n')
        print('=======================================\n')

        time.sleep(1)
        print('\nquer continuar com mais calculos (S/N)?')
        s = input()

        if s == 'S' or s == 's':
            os.system('cls')
        else:
            execucao = False
    elif numero == 2:

        print(f'\n\n  você escolheu: MULTIPLICAÇÃO entre {primeiro_numero} e {segundo_numero}')
        time.sleep(1)
        resultado = primeiro_numero * segundo_numero
        print(f'\nresultado: {round(resultado, 2)}\n')
        print('=======================================\n')

        time.sleep(1)
        print('\nquer continuar com mais calculos (S/N)?')
        s = input()

        if s == 'S' or s == 's':
            os.system('cls')
        else:
            execucao = False
    elif numero == 3:

        print(f'\n\n  você escolheu: DIVISÃO entre {primeiro_numero} e {segundo_numero}')
        time.sleep(1)
        resultado = primeiro_numero / segundo_numero
        print(f'\nresultado: {round(resultado, 2)}\n')
        print('=======================================\n')

        time.sleep(1)
        print('\nquer continuar com mais calculos (S/N)?')
        s = input()

        if s == 'S' or s == 's':
            os.system('cls')
        else:
            execucao = False
    elif numero == 4:

        print(f'\n\n  você escolheu: POTENCIAÇÃO de base: {primeiro_numero}, e expoente: {segundo_numero}')
        time.sleep(1)
        resultado = primeiro_numero ** segundo_numero
        print(f'\nresultado: {round(resultado, 2)}\n')
        print('=======================================\n')
        time.sleep(1)
        print('\nquer continuar com mais calculos (S/N)?')
        s = input()

        if s == 'S' or s == 's':
            os.system('cls')
        else:
            execucao = False

print('\n\nOBRIGADO POR USAR NOSSO PROGRAMA!')
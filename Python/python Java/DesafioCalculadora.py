import os


condicao = True
while condicao:
    os.system("cls")
    digitOne = float(input("\n\nBem vindo a calculadora!\n--->  Informe o 1° numero: "))

    digitTwo = float(input("--->  Informe o 2° numero: "))

    print("qual operação você deseja fazer? ( + , - , x , / , % )")
    opcao = input().lower()

    if opcao == '+':
        result = digitOne + digitTwo
    elif opcao == '-':
        result = digitOne - digitTwo
    elif opcao == 'x' or opcao == '*':
        result = digitOne * digitTwo
    elif opcao == '/':
        result = digitOne / digitTwo
    elif opcao == '%':
        result = digitOne % digitTwo

    print(f"\no resultado é: {result}")
    print("\n\ndeseja continuar? (S/N)")

    if input().lower() != 's':
        condicao = False
        
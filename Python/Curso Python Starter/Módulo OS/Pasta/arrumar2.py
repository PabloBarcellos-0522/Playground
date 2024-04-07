import os
import pdb

full_list = os.listdir(os.getcwd())

os.system('cls')

arquivos = []

# modulo_exemplo.py

def funcao1():
    print("Função 1 executada.")

def funcao2():
    print("Função 2 executada.")



for i in full_list:
    if os.path.isfile(i) == True and i.split('.')[-1] != 'py':
        arquivos.append(i)
        a = 0
        
        full_list = os.listdir(os.getcwd())
        for x in full_list:
            if os.path.isdir(x) == True and i.split('.')[-1] == x:
                path = os.path.join(os.getcwd(), x, i)
                os.replace(i, path)
                a = 1

        if os.path.isfile(x) == True and a == 0:
            os.mkdir(i.split('.')[-1])
            path = os.path.join(os.getcwd(), i.split('.')[-1], i)
            os.replace(i, path)

os.system('cls')
print('\n\nEstes arquivos abaixo foram organizados com sucesso!:\n\n')
for i in arquivos:
    print(i)
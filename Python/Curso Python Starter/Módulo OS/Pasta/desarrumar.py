import os
os.system('cls')

full_list = os.listdir(os.getcwd())
pasta_raiz = os.getcwd()

print('\n\narquivos extraidos:\n')
for i in full_list:
    if os.path.isdir(i):

        os.chdir(os.path.join(os.getcwd(), i))
        inter_list = os.listdir(os.getcwd())
        for x in inter_list:
            replace = os.path.join(pasta_raiz, x)
            os.replace(x, replace)
            print(x)
        os.chdir(os.path.join(pasta_raiz))
        os.rmdir(i)
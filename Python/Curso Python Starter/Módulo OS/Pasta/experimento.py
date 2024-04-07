import os
import time

os.getcwd()
os.chdir('c:\\Users\\pablo\\OneDrive\\Desktop\\Programação\\cursos\\Python Starter\\Python Starter\\Módulo OS\\Pasta\\experimento')

time.sleep(5)
print('a cobra vai fumar KKKKKKK')
time.sleep(5)


i=0
while i<101:
    if i == 0:
        os.mkdir('pasta')
    else:
        os.mkdir(f'pasta({i})')
    i+=1


time.sleep(5)


i=0
while i<101:
    if i == 0:
        os.rmdir('pasta')
    else:
        os.rmdir(f'pasta({i})')
    i+=1
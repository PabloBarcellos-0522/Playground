import time
alfabeto = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
             'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']


for i in alfabeto:
    print(i)
    time.sleep(0.02)
    if i == 'z':
        print('h')
        break

for i in alfabeto:
    print(f' h{i}')
    time.sleep(0.02)
    if i == 'z':
        print(' he')
        break

for i in alfabeto:
    print(f'  he{i}')
    time.sleep(0.02)
    if i == 'z':
        print('   hel')
        break

for i in alfabeto:
    print(f'   hel{i}')
    time.sleep(0.02)
    if i == 'z':
        print('    hell')
        break

for i in alfabeto:
    print(f'    hell{i}')
    time.sleep(0.02)
    if i == 'z':
        print('     hello')
        break

for i in alfabeto:
    print(f'     hello{i}')
    time.sleep(0.02)
    if i == 'z':
        print('      hello ')
        break

for i in alfabeto:
    print(f'      hello {i}')
    time.sleep(0.02)
    if i == 'z':
        print(f'       hello w')
        break

for i in alfabeto:
    print(f'       hello w{i}')
    time.sleep(0.02)
    if i == 'z':
        print(f'        hello wo')
        break

for i in alfabeto:
    print(f'        hello wo{i}')
    time.sleep(0.02)
    if i == 'z':
        print(f'         hello wor')
        break

for i in alfabeto:
    print(f'         hello wor{i}')
    time.sleep(0.02)
    if i == 'z':
        print(f'          hello worl')
        break

for i in alfabeto:
    print(f'          hello worl{i}')
    time.sleep(0.02)
    if i == 'z':

        for x in alfabeto:
            print(f'         * hello world *')
            print(f'         * hello world *')
            print(f'         * hello world *')
        break

time.sleep(3)
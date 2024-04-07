import os
os.system('cls')
import time


#teste = {'Chevrolet Tracker': 120, 'Chevrolet Onix': 90, 'Chevrolet Spin': 150, 'Hyundai HB20': 85, 'Hyundai Tucson': 120, 'Fiat Uno': 60, 'Fiat Mobi': 70, 'Fiat Pulse': 130}

teste = {'[0]': (120, 'Chevrolet Tracker'), '[1]': (90, 'Chevrolet Onix'), '[2]': (150, 'Chevrolet Spin'), '[3]': (85, 'Hyundai HB20'), '[4]': (120, 'Hyundai Tucson'), '[5]': (60, 'Fiat Uno'), '[6]': (70, 'Fiat Mobi'), '[7]': (130, 'Fiat Pulse')}

carros_alugados = {}

while True:
  os.system('cls')
  print('\n\n=================================')
  print('Bem vindo a locadora de carros!')
  print('=================================\n')

  print('o que fazer?\n')
  print('0: VER PORTIFÓLIO | 1: ALUGAR UM CARRO | 2: DEVOLVER UM CARRO | 3: SAIR\n')
  acao = int(input())

  #sair
  if acao == 3:
      break

  #portifólio
  if acao == 0:

    os.system('cls')
    print('\n\n=================================')

    numero = 0
    for i in teste:
      print(f"{i} {teste[i][1]} - R$ {teste[i][0]} /dia")
      numero += 1
  
    print('=================================\n\n')
    print('  0: VOLTAR  |  1: SAIR\n')
    acao = int(input())

    #voltar ou quit
    if acao == 1:
      break


  #alugar
  if acao == 1:
    os.system('cls')
    print('\n\n=================================')

    numero = 0
    for i in teste:
      print(f"{i} {teste[i][1]} - R$ {teste[i][0]} /dia")
      numero += 1

    print('=================================\n\n')
    print('\nescolha o código do carro:\n')
    modelo = int(input())
    print('\nquantos dias você quer alugar?:\n')
    dias = int(input())

    preco_dia = (teste[f'[{modelo}]'][0]) * dias
    
    print(f"\nvocê escolheu o {teste[f'[{modelo}]'][1]} por {dias} dias!.\ntotal: {preco_dia} Reais, deseja alugar?  (S/N)?\n")
    alugar = input()

    if alugar == 's' or alugar == 'S':
      #alugou
      os.system('clear')

      carros_alugados[f'[{modelo}]'] = teste[f'[{modelo}]'][0] and [1]
      carros_alugados.update()

      teste.pop(f'[{modelo}]')

      print(teste)
      print(carros_alugados)

      print('\n\n=======================================================')
      print(f'\nparabéns voce alugou {carros_alugados[-1]} por {dias} dias!\n')
      print('=======================================================')
      print('\n  0: VOLTAR  |  1: SAIR\n')
      acao = int(input())
      if acao == 1:
        break

  #devolver um carro
  os.system('cls')
  if acao == 2:
    print('\n\nsegue a lista de carros alugados, qual voce deseja devolver?\n')

    print('=================================')
    for i in range(len(carros_alugados)):
      print(f'[{i}] {carros_alugados[i]}')
    print('=================================')

    print('\n\nescolha o código do carro que voce deseja devolver:\n')
    devolver = int(input())

    os.system('cls')
    print('\n\n=======================================================')
    print(f'\nobrigado por devolver o carro {carros_alugados[devolver]}\n')
    print('=======================================================')
    print('\n  0: VOLTAR  |  1: SAIR\n')
    acao = int(input())
    if acao == 1:
      break

    c = carros_alugados.pop(devolver)
    d = valores_alugados.pop(devolver)
    f = carros_valores_dia_alugados.pop(devolver)
    carros.append(c)
    carros_valores.append(d)
    carros_valores_dia.append(f)
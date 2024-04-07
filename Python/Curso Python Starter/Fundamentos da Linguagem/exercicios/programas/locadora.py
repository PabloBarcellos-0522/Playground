import os
os.system('cls')
import time

carros = ['Chevrolet Tracker', 'Chevrolet Onix', 'Chevrolet Spin', 'Hyundai HB20', 'Hyundai Tucson', 'Fiat Uno', 'Fiat Mobi', 'Fiat Pulse']

carros_valores_dia = [' - R$ 120 /dia', ' - R$ 90 /dia', ' - R$ 150 /dia', ' - R$ 85 /dia', ' - R$ 120 /dia', ' - R$ 60/dia', ' - R$ 70 /dia', ' - R$ 130/dia']

carros_valores = [120, 90, 150, 85, 120, 60, 70, 130]

carros_alugados = []
valores_alugados = []
carros_valores_dia_alugados = []
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

    for i in range(len(carros)):
      print(f'[{i}] {carros[i]}{carros_valores_dia[i]}')
  
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

    for i in range(len(carros)):
      print(f'[{i}] {carros[i]}{carros_valores_dia[i]}')

    print('=================================\n\n')
    print('\nescolha o código do carro:\n')
    modelo = int(input())
    print('\nquantos dias você quer alugar?:\n')
    dias = int(input())

    preco_dia = (carros_valores[modelo]) * dias

    print(f'\nvocê escolheu o {carros[modelo]} por {dias} dias!.\ntotal: {preco_dia} Reais, deseja alugar?  (S/N)?\n')
    alugar = input()

    if alugar == 's' or alugar == 'S':
      #alugou
      os.system('clear')
      a = carros.pop(modelo)
      b = carros_valores.pop(modelo)
      e = carros_valores_dia.pop(modelo)
      carros_alugados.append(a)
      valores_alugados.append(b)
      carros_valores_dia_alugados.append(e)

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
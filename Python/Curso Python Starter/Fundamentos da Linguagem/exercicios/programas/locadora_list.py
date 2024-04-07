import os
os.system('cls')
import time

carros = [
          ('Chevrolet Tracker', 120), 
          ('Chevrolet Onix', 90), 
          ('Chevrolet Spin', 150), 
          ('Hyundai HB20', 85), 
          ('Hyundai Tucson', 120), 
          ('Fiat Uno', 60), 
          ('Fiat Mobi',70), 
          ('Fiat Pulse', 130)
         ]

carros_alugados = []

def mostrar_lista(lista_carros):
  print('=================================')
  for i in range(len(lista_carros)):
    print(f'[{i+1}] {lista_carros[i][0]} - R$ {lista_carros[i][1]} /dia')
  print('=================================')

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
  elif acao == 0:
    os.system('cls')
    mostrar_lista(carros)
    print('\n  0: VOLTAR  |  1: SAIR\n')
      #voltar ou quit
    if int(input()) == 1:
      break

    #alugar
  elif acao == 1:
    os.system('cls')
    mostrar_lista(carros)

    print('\nescolha o código do carro:\n')
    modelo = int(input()) -1
    print('\nquantos dias você quer alugar?:\n')
    dias = int(input())
    preco_dia = (carros[modelo][1]) * dias

    print(f'\nvocê escolheu o {carros[modelo][0]} por {dias} dias!.\ntotal: {preco_dia} Reais, deseja alugar?  (S/N)?\n')

    if input() == 's' or 'S':
      #alugou
      os.system('cls')
      a = carros.pop(modelo)

      carros_alugados.append(a)


      print('\n\n=======================================================')
      print(f'\nparabéns voce alugou {carros_alugados[-1][0]} por {dias} dias!\n')
      print('=======================================================')
      print('\n  0: VOLTAR  |  1: SAIR\n')
      acao = int(input())
      if acao == 1:
        break

  #devolver um carro
  os.system('cls')
  if acao == 2:
    print('\n\nsegue a lista de carros alugados, qual voce deseja devolver?\n')
    mostrar_lista(carros_alugados)

    print('\n\nescolha o código do carro que voce deseja devolver:\n')
    devolver = int(input()) -1

    os.system('cls')
    print('\n\n=======================================================')
    print(f'\nobrigado por devolver o carro {carros_alugados[devolver][0]}\n')
    print('=======================================================')
    print('\n  0: VOLTAR  |  1: SAIR\n')
    
    if int(input()) == 1:
      break

    carros.append(carros_alugados.pop(devolver))
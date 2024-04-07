import os
import random
import pdb

placar = {'Você': 0, 'Computador': 0, 'Empate':0}
lances = ['Pedra', 'Papel', 'Tesoura']
vitorias = {(0, 0): 2, (0, 1): 1, (0, 2): 0, (1, 0): 0, (1, 1): 2, (1, 2): 1, (2, 0): 1, (2, 1): 0, (2, 2): 2}


def painel():
    print('=====================================================')
    print('====== Bem vindo ao jogo Pedra, Papel e Tesura!======')
    print('=====================================================')
    print('\n\n')
    print('Você:  ', placar['Você'])
    print('Computador:  ', placar['Computador'])
    print('Empate:  ', placar['Empate'])

    print('\nescolha sua jogada:')
    print('0--Pedra, 1--Papel, 2--Tesoura')

def winner(x, y):
    global placar
    winner = vitorias[(x, y)]
    if winner == 0:
        placar.update({'Você': (placar['Você']+1)})
        name = 'Você'
    elif winner == 1:
        placar.update({'Computador': (placar['Computador']+1)})
        name = 'Computador'
    elif winner == 2:
        placar.update({'Empate': (placar['Empate']+1)})

    print('você jogou: {}'.format(lances[player]))
    print('o computador jogou: {}'.format(lances[computer]))
    if winner < 2:
        print('{} Ganhou!'.format(name))
    else:
        print('Empate!')


while True:
    os.system('cls')
    painel()
    constant = 0
    while constant == 0:
        try:
            player = int(input())
            if player > 2:
                [] + 1
            constant = 1
        except Exception as e:
            if player > 2:
                print('Não pode ser maoir que 2')
            else:
                print(e)
    
    computer = random.randint(0, 2)
    
    winner(player, computer)

    print('\nQuer continuar o jogo?  (S/N)')
    constant = 0
    while constant == 0:
        try:
            continuar = input().lower()
            if continuar == 'n':
                constant = 1
                break
            elif continuar == 's':
                constant = 1
                pass
            else:
                [] + 1
        except:
            print('responda apenas S ou N')
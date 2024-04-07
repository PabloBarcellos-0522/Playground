import os
import random
import pdb

placar = {'Você:': 0, 'computador:': 0, 'empate:': 0}
jogadas = ['Pedra', 'Papel', 'Tesoura']
comb_vencedoras = {(0, 0): 2, (0, 1): 1, (0, 2): 0, (1, 0): 0, (1, 1): 2, (1, 2): 1, (2, 0): 1, (2, 1): 0, (2, 2): 2}
# 0 = você 1 = comp e 2 = empate

def vitoria(x, y):
    # global placar
    jogada_player = jogadas[x]
    jogada_maquina = jogadas[y]

    print('\n\n===================================')
    print('Sua jogada:  {}'.format(jogada_player))
    print('Jogada do computador:  {}'.format(jogada_maquina))

    if vencedor == 0:
        z = 'Você'
        placar.update({'Você:': (placar['Você:']+1)})
        print('{} venceu!'.format(z))
    elif vencedor == 1:
        z = 'O computador'
        placar.update({'computador:': (placar['computador:']+1)})
        print('{} venceu!'.format(z))
    else:
        z = 'empate'
        placar.update({'empate:': (placar['empate:']+1)})
        print('deu empate!')
    print('===================================\n\n')

while True:

    os.system('cls')
    print('\n============================================')
    print('  Bem vindo ao jogo Pedra papel e Tesoura!')
    print('============================================\n')

    print('PLACAR:')
    print('Você:  {}'.format(placar['Você:']))
    print('Computador:  {}'.format(placar['computador:']))
    print('empate:  {}'.format(placar['empate:']))

    print('\n\nEscolha seu lance:',   '\n0 -- Pedra  |  1 -- Papel  |  2 -- Tesoura')

    jogada_player = int(input())
    jogada_maquina = random.randint(0, 2)

    vencedor = comb_vencedoras[jogada_player, jogada_maquina]
    vitoria(jogada_player, jogada_maquina)

    print('quer continuar?  S/N')
    if input().lower() == 'n':
        break
# %%

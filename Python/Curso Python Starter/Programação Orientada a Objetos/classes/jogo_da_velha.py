import random
import time

class tabela():                                 # tabela do jogo
    def __init__(self):
        self.reset()
        print('Quer jogar contra um bot?  (S/N)')
        time.sleep(0.5)
        self.bot = input().lower()
        print('\nEscolha o player1, a coluna e a linha!')

                                        

    def player1(self, linha, coluna):               # jogadores
        name = 'player1'
        posição = self.colunas[coluna]
        tabela_escolhida = self.tabelas[linha]
        if tabela_escolhida[posição] == '#':
            self.tabelas[linha] = tabela_escolhida[:posição] + 'X' + tabela_escolhida[posição + 1:]
            print('jogo da velha:\n\n', self.tabelas['a'], self.tabelas['b'], self.tabelas['c'])
            self.victory(name)
            if self.vitoria == 0 and self.bot == 's':
                self.computador()

        else:
            print('esse local já foi escolhido')


    def player2(self, linha, coluna):
        name = 'player2'
        posição = self.colunas[coluna]
        tabela_escolhida = self.tabelas[linha]
        if tabela_escolhida[posição] == '#':
            self.tabelas[linha] = tabela_escolhida[:posição] + 'O' + tabela_escolhida[posição + 1:]
            print('jogo da velha:\n\n', self.tabelas['a'], self.tabelas['b'], self.tabelas['c'])
            self.victory(name)
        else:
            print('esse local já foi escolhido')

    
    def computador(self):
        name = 'computador'
        loop = True
        while loop:
            coluna = random.randint(1, 3)
            linha = random.choice(['a', 'b', 'c'])
            posição = self.colunas[coluna]
            tabela_escolhida = self.tabelas[linha]
            if tabela_escolhida[posição] == '#':
                self.tabelas[linha] = tabela_escolhida[:posição] + 'O' + tabela_escolhida[posição + 1:]
                print('jogo da velha:\n\n', self.tabelas['a'], self.tabelas['b'], self.tabelas['c'])
                self.victory(name)
                loop = False



    def victory(self, ganhador):                     # vencedor
        for i in ['a', 'b', 'c']:                   
            # linha
            if self.tabelas[i][0] == self.tabelas[i][3] and self.tabelas[i][3] == self.tabelas[i][6] and self.tabelas[i][0] != '#':
                print(f'{ganhador} venceu o jogo!')
                self.vitoria = 1
            
        # coluna
        for x in [0, 3, 6]:                    
            if self.tabelas['a'][x] == self.tabelas['b'][x] and self.tabelas['b'][x] == self.tabelas['c'][x] and self.tabelas['a'][x] != '#':
                print(f'{ganhador} venceu o jogo!')
                self.vitoria = 1
                                            
        # diagonal
        if self.tabelas['a'][0] == self.tabelas['b'][3] and self.tabelas['b'][3] == self.tabelas['c'][6] and self.tabelas['a'][0] != '#':
            print(f'{ganhador} venceu o jogo!')
            self.vitoria = 1
        elif self.tabelas['a'][6] == self.tabelas['b'][3] and self.tabelas['b'][3] == self.tabelas['c'][0] and self.tabelas['a'][6] != '#':
            print(f'{ganhador} venceu o jogo!')
            self.vitoria = 1


            
    def reset(self):                            # reset
        self.vitoria = 0
        self.tabelas = {'a': '#  #  #\n', 'b': '#  #  #\n', 'c': '#  #  #\n'}
        self.colunas = {1: 0, 2: 3, 3: 6}
        print('jogo da velha:\n\n', self.tabelas['a'], self.tabelas['b'], self.tabelas['c'])
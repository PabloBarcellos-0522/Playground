# Abre o arquivo para leitura
with open('app.log', 'r') as arquivo:
    # Lê as linhas do arquivo
    linhas = arquivo.readlines()
import pdb
# Cria um dicionário para armazenar as informações
informacoes = []

# Itera sobre as linhas e extrai as informações
for linha in linhas:
    valor = linha.strip().split("\\")[1].split("'")[1]
    informacoes.append(valor)

for i in informacoes:
    print(i)

    # lembrar que não pode ter espaços extras no arquivo .log
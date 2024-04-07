import os
import logging
import pdb


literal_format = "%(levelname)s || %(asctime)s --- %(message)s"
logging.basicConfig(filename="app.log", level= logging.DEBUG, format= literal_format, datefmt= " %Hh %Mm %p", filemode= "w")
log = logging.getLogger()


# log.info('\n\n                        nova execução:\n\n')

arquivos = []
arquivados = []
pastas = []


for i in range(len(os.listdir())):
    if len((os.listdir()[i].split('.'))) > 1:
        arquivos.append(os.listdir()[i].split('.'))
    else:
        pastas.append(os.listdir()[i].split('.'))

for i in arquivos:
    tem = 0

    if i[-1] != 'py' and i[-1] != 'log':
        hola2 = '.'.join(i)


    # if i[-1] != 'py' and i[-1] != 'log':
    #     pdb.set_trace()

    #     if len(i) == 4:
    #         hola2 = i[0] + '.' + i[1] + '.' + i[2] + '.' + i[3]
    #     elif len(i) == 3:
    #         hola2 = i[0] + '.' + i[1] + '.' + i[2]
    #     elif len(i) == 2:
    #         hola2 = i[0] + '.' + i[1]
    #     else:
    #         hola2 = i[0]
            


    # if i[-1] != 'py' and i[-1] != 'log':
    #     pdb.set_trace()
    #     try:
    #         hola2 = i[0] + '.' + i[1] + '.' + i[2] + '.' + i[3]
    #     except:
    #         try:
    #             hola2 = i[0] + '.' + i[1] + '.' + i[2]
    #         except:
    #             try:
    #                 hola2 = i[0] + '.' + i[1]
    #             except:
    #                 hola2 = i[0]

        for x in pastas:

            if i[-1] == x[-1]:
                os.replace(hola2, i[-1] + '\\' + hola2)
                tem = 1
                log.info("o arquivo \\'{}'\ tem uma pasta já existente, --transferindo...--".format(hola2))
                arquivados.append(hola2)

        if tem == 0:
            
            pasta = i[-1]
            log.debug("o arquivo \\'{}'\ ainda não tem uma pasta, --criando pasta...--".format(hola2))
            os.mkdir(pasta)
            os.rename(hola2, pasta + '\\' + hola2)
            pastas.append([pasta])
            arquivados.append(hola2)
        

os.system('cls')
print('\n\nEstes arquivos abaixo foram organizados com sucesso!:\n\n')

for i in arquivados:
    if i[-1] != 'py' and i[-1] != 'log':
        print(i)
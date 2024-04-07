import os

    #mostrao caminho até a pasta atual
os.getcwd()

    #mostra uma lista de todos os arquivos na pasta ou outro
os.listdir()
os.listdir('c:\\Users\\pablo\\OneDrive\\Desktop\\Programação')

    #cria uma pasta no local atual
os.mkdir('pasta')

    #muda o local onde o código (ou açoes) está sendo executado
os.chdir('c:\\Users\\pablo\\OneDrive\\Desktop\\Programação\\cursos\\Python Starter\\Python Starter\\Módulo OS\\Pasta')

    #renomear arquivos
os.rename('teste.txt', 'pasta\\teste.txt')

    #remover ARQUIVOS  
os.remove('teste.csv')

    #remover PASTAS
os.rmdir('pasta')

    #substitui um arquivo ou pasta por outro
os.replace()

    #varias coisas no console
os.system()





            #os.path


    #entrega o nome da ultima pasta do local falado
os.path.basename(os.getcwd())
 
    #caminho completo onde o arquivo está
os.path.dirname(os.getcwd())

    #é um arquivo? é uma pasta?
os.path.isfile(os.getcwd())
os.path.isdir(os.getcwd())

    #junta duas coisas
os.path.join(os.getcwd(), 'experimento', 'ou.js')
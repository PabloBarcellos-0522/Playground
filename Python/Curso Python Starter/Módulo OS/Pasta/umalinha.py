import os

cwd = os.getcwd()
arquivos = [i for i in os.listdir(cwd) if os.path.isdir(i)]


# arquivos = []
# for i in os.listdir(os.getcwd()):
#     if os.path.isdir(i) == True:
#         arquivos.append(i)
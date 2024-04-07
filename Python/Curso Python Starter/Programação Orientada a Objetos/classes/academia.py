import random

class academia():
    def __init__(self):
        global pesos_guardados
        global pesos_common_person
        global pesos_messy
        self.Peso = [i for i in range(10, 31) if i % 2 == 0]
        pesos_guardados = self.Peso
        pesos_common_person = {}
        pesos_messy = {}



    def common_person(self, devolver):
        global pesos_guardados
        global pesos_common_person
        local = random.randint(0, 10)
        if devolver == 1 and pesos_guardados[local] != '#':
            pesos_common_person.update({pesos_guardados[local]: local})
            pesos_guardados.pop(local)
            pesos_guardados.insert(local, '#')
            return local



class common_person():
    def __init__(self, devolver):
        global pesos_guardados
        global pesos_common_person
        loop = True
        while loop:
            local = random.randint(0, 10)
            if devolver == 'p' and pesos_guardados[local] != '#':
                pesos_common_person.update({pesos_guardados[local]: local})
                pesos_guardados.pop(local)
                pesos_guardados.insert(local, '#')
                loop = False
            
            if devolver == 'd' and len(pesos_common_person) > 0:
                peso = list(pesos_common_person.keys())[0]
                index = pesos_common_person.get(peso)
                if pesos_guardados[index] == '#':
                    pesos_guardados.pop(index)
                    pesos_guardados.insert(index, peso)
                    pesos_common_person.pop(peso)
                    loop = False
                elif pesos_guardados[local] == '#':
                    pesos_guardados.pop(local)
                    pesos_guardados.insert(local, peso)
                    pesos_common_person.pop(peso)
                    loop = False
            elif len(pesos_common_person) == 0:
                print('não ha mais pesos para guardar')
                loop = False




class messy():
    def __init__(self, devolver):
        global pesos_guardados
        global pesos_messy
        loop = True
        while loop:
            local = random.randint(0, 10)
            if devolver == 'p' and pesos_guardados[local] != '#':
                pesos_messy.update({pesos_guardados[local]: local})
                pesos_guardados.pop(local)
                pesos_guardados.insert(local, '#')
                loop = False
            
            if devolver == 'd' and len(pesos_messy) > 0:
                peso = list(pesos_messy.keys())[0]
                if pesos_guardados[local] == '#':
                    pesos_guardados.pop(local)
                    pesos_guardados.insert(local, peso)
                    pesos_messy.pop(peso)
                    loop = False
            elif len(pesos_messy) == 0:
                print('não ha mais pesos para guardar')
                loop = False




                # elif pesos_guardados[local] == '#':
                #     pesos_guardados.pop(local)
                #     pesos_guardados.insert(local, peso)
                #     pesos_messy.pop(peso)
                #     loop = False
        
        
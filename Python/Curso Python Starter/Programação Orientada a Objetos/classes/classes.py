class zombie:
    def __init__(self):
        self.life = 100
        self.vivo = True

    def damage(self, damage):
        self.life -= damage
        if self.life <= 0:
            self.vivo = False



class Circle:
    def __init__(self, r=1, p=3.14):
        self.pi = p
        self.raio = r

    def area(self):
        self.result = self.pi * self.raio ** 2
        return round(self.result, 3)

    
    def perimetro(self):
        self.result = self.pi * self.raio * 2
        return round(self.result, 3)
    
class Ball(Circle):
    def __init__(self, r=1, p=3.14):
        self.pi = p*4
        self.raio = r

    def volume(self):
        self.result = (self.pi * self.raio ** 3)/3
        return round(self.result, 3)
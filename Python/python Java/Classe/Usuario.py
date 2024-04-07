class Usuario:
    def __init__(self, name, email) -> None:
        self.nome = name
        self.email = email

        
    def __eq__(self, Objeto) -> bool:
        if isinstance(Objeto, Usuario):
            nome = self.nome == Objeto.nome
            email = self.email == Objeto.email
            return nome and email
        else:
            return False
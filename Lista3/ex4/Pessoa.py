class Pessoa:
    def __init__(self, nome: str):
        self.nome = nome

    def __repr__(self):
        return 'Nome: {}'.format(self.nome)
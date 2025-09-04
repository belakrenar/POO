from Pessoa import Pessoa

class Aluno(Pessoa):
    def __init__(self, nome: str, notas: list):
        super().__init__(nome)
        self.notas = notas

    def calcularmedia(self):
        if len(self.notas) == 0:
            return 0
        return sum(self.notas)/len(self.notas)

    def __repr__(self):
        media = self.calcularmedia()
        return super().__repr__() + '\nNotas: {}'.format(self.notas) + '\nMedia: {}'.format(media) + '\n'

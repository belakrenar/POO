from Pessoa import Pessoa

class Professor(Pessoa):
    def __init__(self, nome: str, salario: float):
        super().__init__(nome)
        self.salario = salario
    
    def __repr__(self):
        return super().__repr__() + '\nSalario: {}'.format(self.salario) + '\n'


class Persona:

    def __init__(self, name, edad):
        self.name = name
        self.edad = edad

    def mostrarMensaje(self):
        print("Yo soy una función")

class Estudiante(Persona):
    
    def __init__(self, name, edad):
        super().__init__(name, edad)


estudiante = Estudiante("Juan", 27)
print(estudiante)
print(estudiante.name)
print(estudiante.edad)
estudiante.mostrarMensaje()
def app():
    #print("Codigo mentor") Comentario de una linea

    """
    Comentarios 
    Multilinea
    """

    nombre = "Juan"

    print("Hola " + nombre)
    print("-------------------------")

    color = "red"
    color2 = "yellow"
    color3 = "blue"
    color, color2, color3 = "red", "yellow", "blue"
    #Equivalentes

    print(color)
    print(color2)
    print(color3)

    number = 2.4
    edad = 20

    #print(nombre + " tiene " + str(edad) + " años")
    #print("{} tiene {} años".format(nombre, edad))
    print("{0} tiene {1} años".format(nombre, edad))

    print(type(nombre))
    print(type(edad))
    print(type(number))
    print("-------------------------")
    print("----{} a float-------------------".format(edad))
    print(type(float(edad)))
    print(float(edad))
    print("----{} a int-------------------".format(number))
    print(type(int(number)))
    print(int(number))

def cadenas():
    texto = "Hola, Mundo"
    texto2 = "              Hola, Mundo h"
    # print(len(texto))
    #print(texto[0])
    print(texto[0:4 ])
    print(texto2.strip())#elimina lo espacios del principio
    print(texto.upper()); #texto a mayúsculas
    print(texto.lower()); #texto a minúsculas
    print(texto2.strip().replace("H", "X")) #reemplaza caracteres
    #for dato in texto:
    #    print(dato)

    print("-------------------------")
    print(type(texto.split(",")))
    print(texto.split(",")) #convierte la cadena en lista
    
    print("-------------------------")
    ispresent = "Mun" in texto # in -> esta, not in -> no esta
    print(ispresent)
    print(type(ispresent))

    print("-------------------------")
    print("tu eres el \"mejor\"")

def condicionales():
    numero = 20
    numero2 = 5

    if(numero > numero2): print("{} es mayor a {}".format(numero, numero2));
    elif(numero2 > numero): print("{} es mayor a {}".format(numero2, numero));
    else: print("{} y {} son iguales".format(numero, numero2));


def ciclos():

    number = 0
    while number < 10:
        number += 1
        if(number==5):
            continue
        print(number)

    print("----------------------------");
    colores = ["red", "yellow", "blue"]
    for color in colores:
        print(color)

    print("----------------------------");
    texto = "computadora"
    for caracter in texto:
        print(caracter)

    print("----------------------------");
    for numero in range(len(texto)):
        print(numero)    
    
def funciones():
    print(suma(4,8))
    print("----------------------------");
    colores("red", "blue", "green")
    print("----------------------------");
    diminombre()
    

def suma(num1, num2):
    return num1 + num2

def colores(*colores):
    print(colores)
    print("Tu color es: " + colores[1])

def diminombre(nombre = "Luis"):
    print("Hola {}".format(nombre))


def listas():
    colores = ["red", "blue", "green", "yellow"]
    print(type(colores))
    print(len(colores))
    print(colores[0:5])
    for color in colores:
        print(color)
    for i in range(len(colores)):
        print(colores[i])

    colores.pop()
    print(colores)
    colores.append("brown")
    print(colores)
    colores.insert(1, "White")
    print(colores)
    colores.remove("red")
    print(colores)
    colores[1] = "Black"
    print(colores)
    
def tuples():
    animales = ("perro", "gato", "conejo")
    print(type(animales))
    print(len(animales))
    print(animales)
    print(animales[1])
    for animal in animales:
        print(animal)

    if "perro" in animales:
        print("El perro se encuentra en la tuple")

    print("-------------------------------------")
    # numeros = ("uno") string
    numeros = ("uno", ) #tupla
    print(type(numeros))

def diccionary():
    persona = {
        "nombre": "Luis",
        "edad": 20,
        "hobby": "cantar"
    }

    print(persona)
    print(persona["nombre"])
    print(persona.get("edad"))
    print(persona.values())

    print("-------------------------------------")
    for a, p in persona.items():
        print("{}: {}".format(a, p))

diccionary()
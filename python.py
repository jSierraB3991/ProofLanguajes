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
    

cadenas()
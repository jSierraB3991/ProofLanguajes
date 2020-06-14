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


app()
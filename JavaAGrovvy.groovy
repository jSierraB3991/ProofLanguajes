// Todos los codigos de Java sirven en Groovy

// Puntos y comas Opcionales

// Metodos y clases son publicas por defecto

// No es necesario los getters y los setters
// para mejorar la verbosidad del código
// Se construyen en bytecode excepto los que tu modificastes
// los atributos, se usan sin el private se toman private en bytecode

// Se pueden "acceder directamente a los atributos"
// en bytecode se usa el getters y los setters

// Cualquier metodo que no devuelva void devuelve la ultima linea
// la palabra return no es obligatorio
/* Es mejor colocarla a menos que sea una linea */

// Las clases de Java, Groovy la amplia con nuevas funcionalidades

// La Interpolacion

// El tipado es opcional se usa un def (Es recomendado)

// name constructor por defecto

//Parentesis Opcionales

// El main puede ser obviado

// Big Decimal por defecto

// Disminucion de los NullPointerException al comparar el valor y no la posición de memoria por defecto

// Power assert para pruebas


// Clase de Java Funcional en Groovy
public class Saludador 
{
	private String saludo;

	public void diHola(String... names) {
		String message = PrepararMensaje(names);
		System.out.println(message);
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	private String PrepararMensaje(String... names) 
	{
		String delimitador = "";
		StringBuilder sb = new StringBuilder();
		for (String name : names) {
			sb.append(delimitador).append(name);
			delimitador = ", ";
		}
		return this.saludo + " " + sb.toString() + "!";
	}
	
	public static void main(String[] args) 
	{
		final Saludador saludo = new Saludador();
		saludo.setSaludo("Hola");
		saludo.diHola("Sheldon", "Leonard", "Raj", "Howad");
	}
}


// Misma Clase pero en la forma de Groovy
class Saludador
{
	String saludo;

	void diHola(String... names) {
		println  "${this.saludo} ${names.join(",")}!"; ;
	}
}
def saludador = new Saludador(saludo: "Hola");
saludador.diHola("Sheldon", "Leonard", "Raj", "Howad");



///Ejemplo de Transformaciones AppBuilders

import groovy.transform.builder.Builder

@Builder
class Persona{
    String name
    int edad
}

Persona.Builder()
       .name("Ivan")
       .edad(36)
       .build()

// Ejemplo de multiline String
def name = "Iván"
def edad = 36
def query = """
    insert into people(fisrtname, age)
    values(${name}, ${edad})
"""


def list = ['a', 'b', 'c'] // ArrayList
list << 'd'                // list.add('d')
assert list.contains('d')
assert list.collect { it.toUpperCase() } == [ 'A', 'B', 'C', 'D' ]


def map = [name: "Iván", age: 36] // HAshMap
// get
assert map.name == "Iván"
assert map.get("name") == "Iván"
assert map["name"] == "Iván"
// Add
map.hijas = ["Judith", "Adriana"]
assert map['hijas'].contains("Adriana")


//Rangos
def range = 'a'..'z'
// El 10 no esta en el rango
def exclusivo = 1.<10 
def inverso = 10..1

// el Primero
inverso[0]
// el último
inverso[-1]

// Esto dara true en groovy
assert !(null)
assert !("")
assert !('')
assert !([])
assert !([:])
assert !(0)
assert new Object()
assert "String"
assert 'String'
assert [1,2]
assert [a: 1]
assert 1


// Diferencias   Con Java #2
/* en Java     */ List result = (names !=null && names.size() > 0) ? names : Collections.emptyList();
/* en groovy   */ def result = names ? names : []
/* en groovy 2 */ def result = names ?: []


// Diferencias   Con Java #3
//En Java
if(order != null)
{
    if(order.getCustomer() != null)
    {
        if(order.getCustomer().getAddress() != null)
        {
            System.out.println(order.getCustomer().getAddress());
        }
    }
}
// En Groovy
println order?.customer?.address



// Closures
def multiplicador = { a,b -> a * b }
assert multiplicador(2,3) == 6
assert multiplicador.call(2,3) == 6
assert multiplicador(8,'-') == '--------'

def sumador = { ...numbers -> numbers.sum() }
assert sumador(1,2,3) == 6
assert sumador('a', 'b', 'c') == 'abc'


// Lambdas y Closures
//En Java
asList(1,2,3).stream()
            .map(i -> i * 2)
            .filter( i -> i > 3)
            .findFirst()
            .orElseThrow(IllegalArgumentException::new)

// En Groovy
[1,2,3].strea()
       .map { i -> i * 2 }
       .filter { i -> i > 3  }
       .findFirst()
       .orElseThrow(IllegalArgumentException.&newInstance)



// Construir un json con groovy
import groovy.json.JsonBuilder
def builder = new Builer()
builder.
    speaker{
        firstName: 'Iván',
        lastName: 'López',
        address{
            city: 'Madrid',
            contry: 'España',
            zip: 12345
        }
        conferences{
            'Codemotion',
            'Greach'
        }
    }
println builder.toPrettyString();
// Resultado
{
    "speaker": {
        "firstName": "Iván",
        "lastName": "López",
        "address": {
            "city": "Madrid",
            "contry": "España",
            "zip": 12345
        }
        "conferences": {
            "Codemotion",
            "Greach"
        }
    }
}

// Leer un Json
// JSOn
{
    "weather":[
        { "description": "few clouds" }
    ],
    "main": {
        temp: 9.38
    },
    "sys": {
        "country": "ES"
    },
    "name": "Madrid"
}

// Groovy
import groovy.json.JsonSlurper
def url = "http://api.openweathermap.org/data/2.5/....".toUrl()
def response = new JsonSlurper().parse(url)
String weather = response.weather.collect { it.description }.join(',')
String country = response.sys.country
String temp = response.main.temp
String city = response.name
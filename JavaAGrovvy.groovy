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
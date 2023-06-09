package Models;

public class Persona {

    //Clase es como definimos el prototipo de un objeto, indicando los atributos y funcionalidades
    //Para entenderlo, podemos pensar en él como una especie de plano (att: Francisco Troncoso)
    //Esta clase cuando la instanciamos ocupamos un espacio en memoria

    //Atributos:
    //Para implementar encapsulación siempre dejar los atributos como privados
    private String nombre;
    private Integer edad;
    private Double altura;
    private Double peso;


    //Para crear la instancia de un objeto usamos constructores
    //Constructores:
    //Vacío: Nos permite crear una instancia vacía del objeto, sin asignar valores a sus atributos
    public Persona() {
    }

    //Lleno: Permite crear una instancia del objeto con todos sus campos llenos
    public Persona(String nombre, Integer edad, Double altura, Double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    // Accesadores y mutadores
    // Getter & Setter
    //Permiten acceder al valor en un atributo(Get) y mutar el valor que hay en un atributo(Set)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }


    //Métodos o funciones propias del objeto
    private void caminar(int energia) {
        System.out.println("Se necesita " + energia + "para caminar");
    }

    //Los argumentos hacen
    public void socializar(Persona persona1, Persona persona2) {
        System.out.println(persona1.getNombre() + " Se comunica con la persona " + persona2.getNombre());
    }


    //Método ToString, para poder imprimir el contenido en vez del espacio de memoria
    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}

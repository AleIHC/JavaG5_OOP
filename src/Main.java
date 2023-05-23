import Models.Estudiante;
import Models.Persona;
import Models.Trabajador;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creamos nueva instancia "Instanciar"
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Francis", 25, 1.80, 90.00);
        Persona persona3 = new Persona("Alejandro", 30, 1.70, 75.00);
        Persona persona4 = new Persona("Diego", 27, 1.80, 80.00);
        Persona persona5 = new Persona("Damaris", 25, 1.70, 70.00);

        //Para acceder a los métodos de la clase, con el nombre de la instancia que creamos
        //Usamos el . y nos aparece la lista de métodos
        persona1.socializar(persona1,persona2);
        persona2.socializar(persona2,persona1);
        persona2.socializar(persona2,persona3);

        //Uso de Get y set
        /**
        System.out.println(persona2.getPeso());
        String nombrePersona = persona2.getNombre();
        System.out.println(nombrePersona);

        persona1.setNombre("Fallon");//Acá le seteamos el nombre a la persona1 que no tiene nada asignado
        System.out.println(persona1.getNombre());//Acá obtenemos el nombre de la persona1 y lo imprimimos
        */

        /*****COLECCIONES DE OBJETOS****/
        //Crear colecciones con nuestros objetos
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona1);
        //System.out.println(listaPersonas);
        //For para iterar sobre arraylist de personas
        //Este ciclo For se leería "Para persona estudiante, dentro de la lista personas" att Damaris
        for (Persona estudiante: listaPersonas) {
            System.out.println("El estudiante es: " + estudiante);
        }
        System.out.println(listaPersonas.get(2));
        /******************************/

        /***********TRY/CATCH**********/
        //Probar un bloque de código y poder lanzar un error que en este caso son las excepciones
        /*
        try {
            //Usar bloques de código que puedan tener un error lógico
            System.out.println(listaPersonas.get(5));
        } catch (ArrayIndexOutOfBoundsException mensajeError) {
            throw mensajeError;
        } finally {
            System.out.println("Hoy no joven, vuelva mañana");
        }
         */
        /*****************************/

        /************** 4 PRINCIPIOS DE LA PROGRAMACIÓN ORIENTADA A OBJETOS ***************/
        //Encapsulación
        //Herencia
        //Abstracción
        //Polimorfismo

        //Ejemplo de encapsulación
        //Sólo vamos a poder acceder a los atributos con el get y set
        System.out.println(persona2.getAltura());


        //Ejemplo de herencia

        ArrayList<Integer> notas = new ArrayList<>();
        /**
        Estudiante estudiante1 = new Estudiante("Jean", 24, 1.80, 80.00, notas, "Programacion");
        estudiante1.setCurso("Programación");
        System.out.println(estudiante1);
        estudiante1.socializar(estudiante1, persona3);
        System.out.println(estudiante1.getCurso());
         */

        //Ejemplo de polimorfismo
        Estudiante estudiante2 = new Estudiante("Jessica", 20, 1.70, 70.00, notas, "Programación");
        estudiante2.socializar(estudiante2, persona3);

        Trabajador trabajador = new Trabajador("Laura", 29, 1.75, 70.00, 8, 1000000.00);
        trabajador.socializar(trabajador, estudiante2);






        /*
        System.out.println(nuevaPersona);
        System.out.println(otraPersona);


        System.out.println(nuevaPersona.getAltura());
        System.out.println(otraPersona.getAltura());

        nuevaPersona.setNombre("Jean");
        System.out.println(nuevaPersona.getNombre());
        System.out.println(nuevaPersona);

        nuevaPersona.setNombre("Lucas");*/
    }
}
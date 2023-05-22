public class Main {
    public static void main(String[] args) {

        //Creamos nueva instancia
        Persona nuevaPersona = new Persona();
        Persona otraPersona = new Persona("Francis", 25, 1.80, 90.00);

        //
        System.out.println(nuevaPersona);
        System.out.println(otraPersona);

        System.out.println(nuevaPersona.getAltura());
        System.out.println(otraPersona.getAltura());

        nuevaPersona.setNombre("Jean");
        System.out.println(nuevaPersona.getNombre());
        System.out.println(nuevaPersona);

        nuevaPersona.setNombre("Lucas");
    }
}
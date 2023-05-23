package Models;

public class Trabajador extends Persona {

    Integer horasDeTrabajo;
    Double sueldo;

    public Trabajador(Integer horasDeTrabajo, Double sueldo) {
        this.horasDeTrabajo = horasDeTrabajo;
        this.sueldo = sueldo;
    }

    public Trabajador(String nombre, Integer edad, Double altura, Double peso, Integer horasDeTrabajo, Double sueldo) {
        super(nombre, edad, altura, peso);
        this.horasDeTrabajo = horasDeTrabajo;
        this.sueldo = sueldo;
    }

    public Integer getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(Integer horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void socializar(Persona persona1, Persona persona2) {
        System.out.println(persona1.getNombre() + " Le hace señales de humo a " + persona2.getNombre());
    }


}

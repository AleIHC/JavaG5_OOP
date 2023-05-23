package Models;

import java.util.ArrayList;

public class Estudiante extends Persona {

    private ArrayList<Integer> notas = new ArrayList<>();
    private String curso;

    public Estudiante() {

    }

    public Estudiante(String nombre, Integer edad, Double altura, Double peso, ArrayList<Integer> notas, String curso) {
        super(nombre, edad, altura, peso);
        this.notas = notas;
        this.curso = curso;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void estudia() {
        System.out.println("El estudiante estudia");
    }


    @Override
    public void socializar(Persona persona1, Persona persona2) {
        System.out.println(persona1.getNombre() + " está molestando a " + persona2.getNombre());
    }

    @Override//Sobreescribir
    public String toString() {
        return "{" +
                "notas=" + notas +
                ", curso='" + curso + '\'' +
                '}';
    }
}

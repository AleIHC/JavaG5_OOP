public class Cama {

    //Atributos
    Double altura;
    Double ancho;
    Integer escalaFirmeza;
    String material;
    String color;
    String marca;
    Boolean baseDividida;
    Double plazas;
    Double precio;



    //Constructor vacío
    public Cama() {
    }

    //Constructor lleno
    public Cama(Double altura, Double ancho, Integer escalaFirmeza, String material, String color, String marca, Boolean baseDividida, Double plazas, Double precio) {
        this.altura = altura;
        this.ancho = ancho;
        this.escalaFirmeza = escalaFirmeza;
        this.material = material;
        this.color = color;
        this.marca = marca;
        this.baseDividida = baseDividida;
        this.plazas = plazas;
        this.precio = precio;
    }

    //


    //Funciones
    public static void darSoporte(String persona) {
        System.out.println("Te doy soporte para que te recuestes");
    }
    public static void resistirPeso(String material, Double altura) {
        System.out.println("La cama es suficientemente resistente");
    }


}

package holamundo;

/**
 *
 * Danna Paola 17-02-22
 *
 */
public class Persona {

// Atributos
    private String nombre;
    private int edad;

// Método constructor / ctrl space, enter
    public Persona() {
    }

//Método constructor sobrecargado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

// Métodos de uso general Click derecho, insert code, getter and setter 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer(String platillo) {
        System.out.println(this.nombre + " Esta comiendo " + platillo);

    }

}

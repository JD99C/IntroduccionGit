package alumnos;


/**
 * Clase alumno.
 *
 * @author JD
 * @version 21.06.14
 *
 *
 */
public class Alumno {

    //Atributos
    private String nombre;
    private int anioNacimiento;

    //Contructor
    public Alumno(String nombre, int anioNacimiento) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    /**
     *  Metodo que calcula la edad del alumno
     *
     * @param anioActual año actual
     * @return  edad del alumno
     */

    public int calcularEdad(int anioActual){
        return anioActual-anioNacimiento;
    }

}

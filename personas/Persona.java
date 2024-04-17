package personas;

public class Persona {
    private int idPersona;
    private String nombre; 
    private int altura;
    public Persona(int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;
    }
    public int getAltura() {
        return altura;
    }
    //omitir otros métodos para simplificar

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", altura=" + altura + '}';
    }


}

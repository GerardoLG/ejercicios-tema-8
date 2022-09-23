public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(31);
        persona.setNumeroTelefono("246 135 0897");
        persona.setNombre("Fulano");

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getNumeroTelefono());

    }
}

class Persona{
    private String nombre;
    private String numeroTelefono;
    private int edad;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
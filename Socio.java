public class Socio {
    private String nombre;
    private int numeroSocio;
    private int contrasena = 0000;
    private int librosPrestados = 0;
    private final int MAX_PRESTADOS = 2;

    public Socio (String nombre, int numeroSocio, int contrasena){
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.contrasena = contrasena;
    }

    public boolean comprobarContraseña (int pin){
        return pin == this.contrasena;
    }

    public boolean puedePedir(){
        return librosPrestados < MAX_PRESTADOS;
    }

    public void pedirLibro(Libro libro){
        if (puedePedir()){
            if(Biblioteca.prestar(libro)){
               librosPrestados++;
               System.out.println("Libro Prestado");
            }else{
                System.out.println("Libro ya prestado");
            }
        }else{
                System.out.println("Ya no puedes pedir más préstamos");
            }
    }

    public void devolver(Libro libro){
        Biblioteca.devolver(libro);
        librosPrestados--;
        if(librosPrestados < 0){
            librosPrestados = 0;
        }
    }

    public void mostrarDatos(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n# Socio: " + this.numeroSocio + "\n Libros Prestados: " + this.librosPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public int getContrasena() {
        return contrasena;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public int getMAX_PRESTADOS() {
        return MAX_PRESTADOS;
    }
}

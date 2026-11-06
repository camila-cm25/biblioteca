public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible = false;
    private int vecesPrestado = 0;

    public Libro (String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInfo(){
        System.out.println("Título del libro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Libro publicado en " + this.anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isDisponible() {
        return this.estaPrestado();
    }

    public int getVecesPrestado() {
        return vecesPrestado;
    }

}
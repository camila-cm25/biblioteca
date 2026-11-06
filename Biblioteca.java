
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Libro l1 = new Libro("La Historia Interminable","Michael Ende", 1979);
        Libro l2 = new Libro("1984","George Orwell", 1949);
        Libro l3 = new Libro("El Señor de los Anillos","J.R.R. Tolkien", 1954);

        Socio s1 = new Socio("Camila", 001, 1234);
        Socio s2 = new Socio("Lourdes", 002, 4321);

        System.out.println("------ SOCIOS ------");
        System.out.println("001 -> Camila");
        System.out.println("002 -> Lourdes");

        int numSocioPrueba;

        System.out.print("Introduzca el número de socio: ");
        numSocioPrueba = sc.nextInt();
        do { 
            System.out.println("El número de socio no existe, inténtalo de nuevo: ");
            numSocioPrueba = sc.nextInt();
        } while (numSocioPrueba != s1.getNumeroSocio() || numSocioPrueba != s2.getNumeroSocio());

        int i = 0;
        int numContrasenaIntento;

        do{
        System.out.print("Contraseña: ");
        numContrasenaIntento = sc.nextInt();
        i++;
        
        if (numContrasenaIntento == s1.getContrasena() || numContrasenaIntento == s2.getContrasena()) {
            System.out.println("La contraseña es correcta");
        }else{
            System.out.printf("Contraseña incorrecta. Te quedan %d intentos", 3 - i);
        }

    }while (i < 4);

    if (i == 4) {
        System.out.println("Has agotado los intentos");
    }
    }

    public static boolean prestar(Libro libro){
        
        return true;
    }

    public static void devolver(Libro libro){


    }
}

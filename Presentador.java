
public class Presentador {
    public static void main(String[] args) {

        Concursante concursante = new Concursante("Camila");
        Cesta cesta = new Cesta(10, 1, 1);
        int opcion;
        boolean plantarse = false;
        boolean bancarrota = false;
        
        do { 
            imprimirMenu();
            opcion = leerSeguro();
            switch (opcion){
                case 1 -> {
                    char bola = cesta.sacarBola();
                    switch (bola){
                        case 'B' -> {
                            System.out.println("100 eurazos, bola blanca");
                            concursante.sumarPremio(concursante.VALOR_BLANCA);
                            System.out.println("Llevas acumulado: " + concursante.getPremioAcumulado());
                        }
                        case 'A' -> {
                            System.out.println("200 eurazos, bola blanca");                            
                            concursante.sumarPremio(concursante.VALOR_AZUL);
                            System.out.println("Llevas acumulado: " + concursante.getPremioAcumulado());
                        }
                        case 'N' -> {
                            concursante.bancarrota();
                        }
                    }
                }
                case 2 -> {
                   plantarse = true;
                   System.out.printf("Enhorabuena %s!\n", concursante.getNombre());
                   System.out.printf("Has ganado %d!\n", concursante.getPremioAcumulado());
                }
                default -> {
                    System.out.println("Opción no válida: 1 o 2");
                }
            }
        } while (opcion!=2 && !plantarse && !bancarrota);
    }

    private static void imprimirMenu(){

    }

    private static int leerSeguro(){
        return = 0;
    }
 
}
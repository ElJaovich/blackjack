import java.io.Console;

public class Blackjack {

    public static Carta[] Mazo() {
        Carta[] mazo = {
        Carta.AS_CORAZON,
        Carta.DOS_CORAZON,
        Carta.TRES_CORAZON,
        Carta.CUATRO_CORAZON,
        Carta.CINCO_CORAZON,
        Carta.SEIS_CORAZON,
        Carta.SIETE_CORAZON,
        Carta.OCHO_CORAZON,
        Carta.NUEVE_CORAZON,
        Carta.DIEZ_CORAZON,
        Carta.JOTA_CORAZON,
        Carta.REINA_CORAZON,
        Carta.REY_CORAZON,
        Carta.COMODIN_CORAZON,
        
        Carta.AS_DIAMANTE,
        Carta.DOS_DIAMANTE,
        Carta.TRES_DIAMANTE,
        Carta.CUATRO_DIAMANTE,
        Carta.CINCO_DIAMANTE,
        Carta.SEIS_DIAMANTE,
        Carta.SIETE_DIAMANTE,
        Carta.OCHO_DIAMANTE,
        Carta.NUEVE_DIAMANTE,
        Carta.DIEZ_DIAMANTE,
        Carta.JOTA_DIAMANTE,
        Carta.REINA_DIAMANTE,
        Carta.REY_DIAMANTE,
        Carta.COMODIN_DIAMANTE,
    
        Carta.AS_TREBOL,
        Carta.DOS_TREBOL,
        Carta.TRES_TREBOL,
        Carta.CUATRO_TREBOL,
        Carta.CINCO_TREBOL,
        Carta.SEIS_TREBOL,
        Carta.SIETE_TREBOL,
        Carta.OCHO_TREBOL,
        Carta.NUEVE_TREBOL,
        Carta.DIEZ_TREBOL,
        Carta.JOTA_TREBOL,
        Carta.REINA_TREBOL,
        Carta.REY_TREBOL,
        Carta.COMODIN_TREBOL,
    
        Carta.AS_PICA,
        Carta.DOS_PICA,
        Carta.TRES_PICA,
        Carta.CUATRO_PICA,
        Carta.CINCO_PICA,
        Carta.SEIS_PICA,
        Carta.SIETE_PICA,
        Carta.OCHO_PICA,
        Carta.NUEVE_PICA,
        Carta.DIEZ_PICA,
        Carta.JOTA_PICA,
        Carta.REINA_PICA,
        Carta.REY_PICA,
        Carta.COMODIN_PICA, };
        return mazo;
    }

    public static Carta darCarta(Carta[] carta){
        int posicion = (int) (Math.random() *( carta.length ));
        return carta[posicion];
    }

    public static void main(String [] args){
        Console consola = System.console();
        int credito = 100;
        boolean salirDelJuego = false;
        boolean isBlackjack = false;

        while (!salirDelJuego && credito >= 10 ){
            

            String nombre = consola.readLine("Indique su nombre: ");
            System.out.println("Hola " + nombre + ", usted tiene un credito de " + credito + "$");
            int apuesta = Integer.parseInt(consola.readLine("Indique el monto a apostar no menor a 10$: "));
            while (apuesta < 10 || apuesta > 100) {
                System.out.println("Error: monto incorrecto");
                apuesta = Integer.parseInt(consola.readLine("Indique el monto a apostar no menor a 10$: "));
            
            }

           RepartirCartasIniciales cartasInicialesJugador = RepartirCartasIniciales.repartirCartasInicialesJugador();
           RepartirCartasIniciales cartasInicialesCrupier = RepartirCartasIniciales.repartirCartasInicialesCrupier();
           if (cartasInicialesJugador.sumaCartasJugador == 21){
            isBlackjack = true;
            //you Win!
            System.out.println("Ganaste!, su apuesta sera pagada a razon de 3 a 2");

           }else if (cartasInicialesCrupier.sumaCartasCrupier == 21){
            
           }else {

           }

            //System.out.println(test);
            System.out.println("Monto: " + apuesta + "$" + "\n");
            System.out.println("Elije un numero del menu de opciones: " + "\n" + "1) Recibir una carta" + "\n" + "2) Plantarse" + "\n" + "3) Doblar el monto de la apuesta " + "\n" + "4) Salir del juego");
            int entrada = Integer.parseInt(consola.readLine("Opcion: "));
            while (entrada <= 0 || entrada > 4){
                System.out.println("Error: Opcion Incorrecta!");
                entrada = Integer.parseInt(consola.readLine("Opcion: "));
            }
            if (entrada == 1){

            }else if (entrada == 2){

            }else if (entrada == 3){

            }else if (entrada == 4){

            }else {

            }

        }

       System.out.println( darCarta(Mazo()));
        
    }
}
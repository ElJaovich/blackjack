
public class RepartirCartasIniciales {
    private Carta[] cartasJugador;
    private int sumaCartasJugador;

    public RepartirCartasIniciales(Carta[] cartas, int suma) {
        cartasJugador = cartas;
        sumaCartasJugador = suma;
    }
    
    public static RepartirCartasIniciales repartirCartasInicialesJugador() {
        Blackjack jack = new Blackjack();
        Carta[] cartasJugador = new Carta[2]; 
        int sumaCartasJugador = 0;
        int i = 0;
    
        while (i < 2) {
            cartasJugador[i] = jack.darCarta(jack.Mazo());
            sumaCartasJugador += cartasJugador[i].getValor();
            i++;
        }
    
        return new RepartirCartasIniciales(cartasJugador, sumaCartasJugador);
    }

    public static RepartirCartasIniciales repartirCartasInicialesCrupier() {
        Blackjack jack = new Blackjack();
        Carta[] cartasCrupier = new Carta[2]; 
        int sumaCartasCrupier = 0;
        int i = 0;
    
        while (i < 2) {
            cartasCrupier[i] = jack.darCarta(jack.Mazo());
            sumaCartasCrupier += cartasCrupier[i].getValor();
            i++;
        }
    
        return new RepartirCartasIniciales(cartasCrupier, sumaCartasCrupier);
    }
}


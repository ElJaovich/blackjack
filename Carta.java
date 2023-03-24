public enum Carta {

    AS_CORAZON(1),
    DOS_CORAZON(2),
    TRES_CORAZON(3),
    CUATRO_CORAZON(4),
    CINCO_CORAZON(5),
    SEIS_CORAZON(6),
    SIETE_CORAZON(7),
    OCHO_CORAZON(8),
    NUEVE_CORAZON(9),
    DIEZ_CORAZON(10),
    JOTA_CORAZON(10),
    REINA_CORAZON(10),
    REY_CORAZON(10),
    COMODIN_CORAZON(11),
    
    AS_DIAMANTE(1),
    DOS_DIAMANTE(2),
    TRES_DIAMANTE(3),
    CUATRO_DIAMANTE(4),
    CINCO_DIAMANTE(5),
    SEIS_DIAMANTE(6),
    SIETE_DIAMANTE(7),
    OCHO_DIAMANTE(8),
    NUEVE_DIAMANTE(9),
    DIEZ_DIAMANTE(10),
    JOTA_DIAMANTE(10),
    REINA_DIAMANTE(10),
    REY_DIAMANTE(10),
    COMODIN_DIAMANTE(11),

    AS_TREBOL(1),
    DOS_TREBOL(2),
    TRES_TREBOL(3),
    CUATRO_TREBOL(4),
    CINCO_TREBOL(5),
    SEIS_TREBOL(6),
    SIETE_TREBOL(7),
    OCHO_TREBOL(8),
    NUEVE_TREBOL(9),
    DIEZ_TREBOL(10),
    JOTA_TREBOL(10),
    REINA_TREBOL(10),
    REY_TREBOL(10),
    COMODIN_TREBOL(11),

    AS_PICA(1),
    DOS_PICA(2),
    TRES_PICA(3),
    CUATRO_PICA(4),
    CINCO_PICA(5),
    SEIS_PICA(6),
    SIETE_PICA(7),
    OCHO_PICA(8),
    NUEVE_PICA(9),
    DIEZ_PICA(10),
    JOTA_PICA(10),
    REINA_PICA(10),
    REY_PICA(10),
    COMODIN_PICA(11);

    private final int valor;

    Carta(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
};

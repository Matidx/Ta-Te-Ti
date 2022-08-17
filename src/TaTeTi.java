import java.util.Scanner;

public class TaTeTi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero();

        System.out.print("Escriba el nombre del Jugador 1: ");
        Jugador jugador1 = new Jugador(sc.nextLine(), Valores.O, tablero);
        System.out.print("Escriba el nombre del Jugador 2: ");
        Jugador jugador2 = new Jugador(sc.nextLine(), Valores.X, tablero);
        Jugador ganador = new Jugador(null, Valores.X, tablero);

        System.out.println("Se enfrentan " + jugador1.getNombre() + " '" + jugador1.getFicha() + "' VS " + jugador2.getNombre() + " '" + jugador2.getFicha() + "'");

        for (int i = 0; !tablero.ganar() ; i++) {
            if (i % 2 == 0){
                jugador1.jugar();
                ganador = jugador1;
                tablero.imprimirTablero();
            } else  {
                jugador2.jugar();
                ganador = jugador2;
                tablero.imprimirTablero();
            }
        }
        System.out.println("Gano el jugador " + ganador.getNombre() + " '" + ganador.getFicha() + "'");
    }
}
import java.util.Scanner;

public class Jugador {
    public String nombre;
    public Valores ficha;
    Tablero t1;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Valores getFicha() {
        return ficha;
    }

    public void setFicha(Valores ficha) {
        this.ficha = ficha;
    }

    public Jugador(String nombre, Valores ficha, Tablero t1) {
        this.nombre = nombre;
        this.ficha = ficha;
        this.t1 = t1;
    }

    public void jugar() {
        Scanner entrada = new Scanner(System.in);

        int f = 0;
        int c = 0;
        System.out.printf("%nTurno del jugador %s '%s'",getNombre() ,getFicha());
        System.out.printf("%nDebe ingresar un numero que vaya del 1 al 9" + "%n#7 #8 #9%n#4 #5 #6%n#1 #2 #3%nJugada: ");
        int jugada = entrada.nextInt();


        switch (jugada) {
            case 1: f=2; c=0; break;
            case 2: f=2; c=1; break;
            case 3: f=2; c=2; break;

            case 4: f=1; c=0; break;
            case 5: f=1; c=1; break;
            case 6: f=1; c=2; break;

            case 7: f=0; c=0; break;
            case 8: f=0; c=1; break;
            case 9: f=0; c=2; break;

            default:
                System.out.println("El valor es incorrecto");
                break;
        }
        if (!t1.ponerFicha(f, c, ficha)){
            System.out.println("Pierde el turno");
        }
    }
}
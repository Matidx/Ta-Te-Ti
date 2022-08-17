public class Tablero {
    private final Valores[][] tablero;

    public Tablero (){
        this.tablero = new Valores[3][3];
        valorPorCelda();
    }

    public void imprimirTablero() {
        System.out.println("-------TABLERO DE JUEGO---------");
        for (int fila = 0; fila < this.tablero.length; fila++) {
            for (int columna = 0; columna < this.tablero[fila].length; columna++) {
                System.out.printf("     |%s|", this.tablero[fila][columna]);
            }
            System.out.println();
        }
    }

    public void valorPorCelda() {
        for (int fila = 0; fila < this.tablero.length; fila++) {
            for (int columna = 0; columna < this.tablero[fila].length; columna++) {
                this.tablero[fila][columna] = Valores.N;
            }
        }
    }
    public boolean ponerFicha(int posF, int posC, Valores valores) {
        if (tablero [posF][posC] !=null) {
            if (tablero [posF][posC] == Valores.N) {
                tablero [posF][posC] = valores;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean ganar (){
        if (compruebaFila() || compruebaColumna() || compruebaDiagonal()) {
            return true;
        }
        return false;
    }

    public boolean compruebaFila () {

        if ((this.tablero[0][0]!=Valores.N)&&(this.tablero[0][0] == this.tablero[0][1]) && (this.tablero[0][1] == this.tablero[0][2])) {
            return true;
        }
        if ((this.tablero[1][0]!=Valores.N)&&(this.tablero[1][0] == this.tablero[1][1]) && (this.tablero[1][1] == this.tablero[1][2])) {
            return true;
        }
        if ((this.tablero[2][0]!=Valores.N)&&(this.tablero[2][0] == this.tablero[2][1]) && (this.tablero[2][1] == this.tablero[2][2])) {
            return true;
        }
        return false;
    }

    public boolean compruebaColumna () {
        if ((this.tablero[0][0]!=Valores.N)&&(this.tablero[0][0] == this.tablero[1][0]) && (this.tablero[1][0] == this.tablero[2][0])) {
            return true;
        }
        if ((this.tablero[0][1]!=Valores.N)&&(this.tablero[0][1] == this.tablero[1][1]) && (this.tablero[1][1] == this.tablero[2][1])) {
            return true;
        }
        if ((this.tablero[0][2]!=Valores.N)&&(this.tablero[0][2] == this.tablero[1][2]) && (this.tablero[1][2] == this.tablero[2][2])) {
            return true;
        }
        return false;
    }

    public boolean compruebaDiagonal () {
        if ((this.tablero[0][0]!=Valores.N)&&(this.tablero[0][0] == this.tablero[1][1]) && (this.tablero[1][1] == this.tablero[2][2])) {
            return true;
        }
        if ((this.tablero[2][0]!=Valores.N)&&(this.tablero[2][0] == this.tablero[1][1]) && (this.tablero[1][1] == this.tablero[0][2])) {
            return true;
        }
        return false;
    }
}
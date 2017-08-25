package snake;

import java.util.Random;
import java.util.Scanner;

public class Snake {

    public static void main(String[] args) {
        int inicio;
        String nombre = "";
        int tamaño = 0;
        Scanner teclado = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);
        String fin = "";
        int puntaje = 0;
        int x = 10;
        int y = 10;
        String movimiento = "";
        Scanner mov = new Scanner(System.in);
        int m = 0;
        int n = 0;
        String comida = "";
       

        do {
            System.out.println("\033[31mMenu");
            System.out.println("\033[34m1.Inicio");
            System.out.println("\033[34m2.Datos del Estudiante");
            System.out.println("\033[34m3.Historial de Partidas");
            System.out.println("\033[34m4.Salir");

            inicio = menu.nextInt();
        } while (inicio > 5);
        switch (inicio) {
            case 1:
                System.out.println("\033[34mIngrese su nombre");
                nombre = teclado1.next();
                System.out.println("\033[34mIngrese el tamaño del tablero mayor a 10");
                tamaño = teclado.nextInt();
                break;
            case 2:
                Estudiante datos = new Estudiante();
                datos.ImprimirDatos();
                break;
            case 3:
                break;
            case 4:
                break;

        }

        String ta[][] = new String[tamaño][tamaño];

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == 0 || i == tamaño - 1) {
                    ta[i][j] = "$";
                } else if (j == 0 || j == tamaño - 1) {
                    ta[i][j] = "$";
                } else {
                    ta[i][j] = " ";
                }
            }
        }
        Random frutox = new Random();
        Random frutoy = new Random();
        m = frutox.nextInt(tamaño - 2);
        n = frutoy.nextInt(tamaño - 2);
        ta[m][n] = "*";

        while (!fin.equalsIgnoreCase("Game Over")) {
            ta[x][y] = "@";
            if (comida.equalsIgnoreCase("Generar Comida")) {
                m = frutox.nextInt(tamaño - 2);
                n = frutoy.nextInt(tamaño - 2);
                ta[m][n] = "*";
            }
            System.out.println(puntaje + "            " + nombre);

            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    System.out.print(ta[i][j] + " ");

                }
                System.out.println("");
            }
            
            System.out.println("");
            System.out.println("Fruto 1-");
            System.out.println("Fruto 2-");
            System.out.println("Fruto 3-");

            movimiento = mov.next();

            switch (movimiento) {
                case "a":
                    y = y - 1;
                    break;
                case "d":
                    y = y + 1;
                    break;
                case "w":
                    x = x - 1;
                    break;
                case "s":
                    x = x + 1;
                    break;
                default:
                    break;
            }
            if (ta[x][y].equals(ta[m][n])) {
                comida = "Generar Comida";
            }
            if (ta[x][y].equals("$")) {
                fin = "Game Over";
            }

        }
    }

}

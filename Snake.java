package snake;

import java.util.Random;
import java.util.Scanner;

public class Snake {

    public static void main(String[] args) {
        String actual = "";
        String anterior = "";
        String temporal = "";
        int inicio;
        int puntaje = 0;
        int m;
        int n;
        Scanner menu = new Scanner(System.in);
        Scanner te = new Scanner(System.in);
        Scanner coordenadas = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        int tamaño = 0;
        int x = 0;
        int y = 0;
        String nombre = "";

        do {
            System.out.println("Selecciona una Opción");
            System.out.println("1.Inicio");
            System.out.println("2.Salir");
            inicio = menu.nextInt();
        } while (inicio > 3);
        switch (inicio) {
            case 1:
                System.out.println("Ingrese su nombre");
                nombre = name.next();
                System.out.println("Ingrese el tamaño del tablero mayor a 10");
                tamaño = te.nextInt();
                System.out.println("Ingrese el valor en X donde desea iniciar menor a " + tamaño);
                x = coordenadas.nextInt();
                System.out.println("Ingrese el valor en Y donde desea iniciar menor a " + tamaño);
                y = coordenadas.nextInt();
                break;
            case 2:
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
        
        System.out.println(puntaje + "            " + nombre);
        m = frutox.nextInt(tamaño-1);
        n = frutoy.nextInt(tamaño-1);
        ta[m][n] = "*";
        
        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                ta[x][y] = "@";
                ta[x][y + 1] = "@";
                ta[x][y + 2] = "@";
                System.out.print(ta[i][j] + " ");

            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Fruto 1-");
        System.out.println("Fruto 2-");
        System.out.println("Fruto 3-");
    }

}

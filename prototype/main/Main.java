package git.prototype.main;

import java.util.ArrayList;
import java.util.Scanner;

import git.prototype.clases.Punto;
import git.prototype.clases.Triangulo;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource") // Eliminar advertencia de un posible leak con el Scanner.
    Scanner sc = new Scanner(System.in);

    ArrayList<Punto> puntos = new ArrayList<>();
    ArrayList<Triangulo> triangulos = new ArrayList<>();

    Punto punto = new Punto("negro");
    Triangulo triangulo = new Triangulo("negro");

    System.out.print("¿Cuántos puntos quiere ver? ");
    int numPuntos = sc.nextInt();

    System.out.print("¿Cuántos triángulos quiere ver? ");
    int numTriangulos = sc.nextInt();

    for (int i = 0; i < numPuntos; i++) {
      puntos.add((Punto) punto.clonar());
    }

    for (int i = 0; i < numTriangulos; i++) {
      triangulos.add((Triangulo) triangulo.clonar());
    }

    for (int i = 0; i < puntos.size(); i++) {
      puntos.get(i).imprimir();
    }

    System.out.println("");

    for (int i = 0; i < triangulos.size(); i++) {
      triangulos.get(i).imprimir();
    }
  }
}

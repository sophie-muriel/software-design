package git.prototype.clases;

import git.prototype.forma.Forma;

public class Punto implements Forma {
  String color;
  String forma;

  public Punto(String color) {
    this.color = color;
    forma = ".";
  }

  @Override
  public void imprimir() {
    System.out.print(forma);
  }

  @Override
  public Forma clonar() {
    return new Punto(this.color);
  }
}

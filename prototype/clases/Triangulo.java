package git.prototype.clases;

import git.prototype.forma.Forma;

public class Triangulo implements Forma {
  String color;
  String forma;

  public Triangulo(String color) {
    this.color = color;
    forma = "^";
  }

  @Override
  public void imprimir() {
    System.out.print(forma);
  }

  @Override
  public Forma clonar() {
    return new Triangulo(this.color);
  }
}

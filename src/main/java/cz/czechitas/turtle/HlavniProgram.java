package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
  private Turtle zofka = new Turtle();

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    //TODO Tady bude kód pro kreslení želví grafiky.
  }

  public void drawSquare(double sideLength) {
    for (int i = 0; i < 4; i++) {
      zofka.move(sideLength);
      zofka.turnLeft(90);
    }
  }

  public void drawRectangle(double sideALength, double sideBLength) {
    for (int i = 0; i < 2; i++) {
      zofka.move(sideALength);
      zofka.turnLeft(90);
      zofka.move(sideBLength);
      zofka.turnLeft(90);
    }
  }

  public void drawEquilateralTriangle(double sideLength) {
    for (int i = 0; i < 3; i++) {
      zofka.move(sideLength);
      zofka.turnLeft(120);
    }
  }

  public void drawRightAngledTriangle(double sideLength) {
    var baseSide = Math.sqrt(2 * Math.pow(sideLength, 2));
    zofka.move(baseSide);
    zofka.turnLeft(135);
    zofka.move(sideLength);
    zofka.turnLeft(90);
    zofka.move(sideLength);
  }

  public void drawCircleWithRadius(double radius) {
    double perimeter = 2 * Math.PI * radius;
    double step = perimeter / 120;
    for (int i = 0; i < 120; i++) {
      zofka.move(step);
      zofka.turnLeft(3); // 360/120
    }
  }

}

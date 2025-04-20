package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
  private Turtle zofka = new Turtle();

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka.setPenWidth(5);
    zofka.setPenColor(Color.BLACK);
    zofka.setX(120);

    drawIceCream();
    zofka.setY(300);
    drawSnowMan();
    zofka.setY(200);
    drawLocomotive();
  }

  // method not used
//  public void drawSquare(double sideLength) {
//    for (int i = 0; i < 4; i++) {
//      zofka.move(sideLength);
//      zofka.turnLeft(90);
//    }
//  }

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
    zofka.turnLeft(135);
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

  public void drawIceCream() {
    zofka.turnLeft(90);
    drawEquilateralTriangle(100);

    zofka.turnRight(90);
    zofka.penUp();
    zofka.move(20);
    zofka.penDown();

    drawCircleWithRadius(50);

    zofka.turnRight(180);
    zofka.penUp();
    zofka.move(20);
    zofka.turnLeft(90);
    zofka.move(200);
    zofka.turnLeft(90);
    zofka.penDown();
  }

  public void drawSnowMan() {
    var radius = 70; //radius of the actual circle, starting with the largest one, could be a parameter as well
    for (int i = 0; i < 3; i++) {
      drawCircleWithRadius(radius);
      zofka.penUp();
      zofka.move(radius + (radius - 20)); //decreasing the radius by 20 in each iteration
      zofka.turnLeft(90);
      zofka.move(radius - (radius - 20)); //ensures that the snowman is centered
      zofka.turnRight(90);
      zofka.penDown();
      radius = radius - 20;
    }

    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(radius);
    zofka.turnRight(90);
    zofka.move(radius);
    zofka.turnLeft(90);
    zofka.move((2 * (radius + 20)) + radius + 40);
    zofka.turnRight(90);
    zofka.move(radius + 40);
    zofka.turnRight(90);
    zofka.penDown();

    drawCircleWithRadius(radius);

    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(2 * (radius + 40));
    zofka.turnRight(90);
    zofka.penDown();

    drawCircleWithRadius(radius);

    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(3 * (radius + 40));
    zofka.turnLeft(90);
    zofka.penDown();
  }

  public void drawLocomotive() {
    drawRightAngledTriangle(100);

    zofka.turnRight(180);
    zofka.move(70);
    zofka.turnLeft(90);

    drawRectangle(200, 100);

    zofka.move(30);
    zofka.turnRight(90);
    zofka.penUp();
    zofka.move(30);
    zofka.penDown();

    drawCircleWithRadius(30);

    zofka.turnLeft(90);
    zofka.penUp();
    zofka.move(80);
    zofka.turnRight(90);
    zofka.penDown();

    drawCircleWithRadius(30);

    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(30);
    zofka.turnRight(90);
    zofka.move(210);
    zofka.turnLeft(90);
    zofka.penDown();

    drawRectangle(180, 120);
    drawCircleWithRadius(60);

    zofka.turnRight(90);
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(60);
    zofka.turnLeft(90);
    zofka.move(40);
    zofka.turnLeft(90);
    zofka.penDown();
  }

}

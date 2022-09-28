package ejer4guia10;

import clase.circulo;
import clase.rectangulo;
import java.util.Scanner;

public class Ejer4guia10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese radio de circulo");
        circulo circulo = new circulo(leer.nextDouble());
        System.out.println("Ingrese base y altura de rectangulo");
        rectangulo rectangulo = new rectangulo(leer.nextDouble(), leer.nextDouble());
        System.out.println("Area circulo " + circulo.calcularArea() + " Perimetro circulo " + circulo.calcularPerimetro());
        System.out.println("Area rectangulo " + rectangulo.calcularArea() + " Perimetro rectangulo " + rectangulo.calcularPerimetro());
    }

}

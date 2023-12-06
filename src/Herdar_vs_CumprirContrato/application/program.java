package Herdar_vs_CumprirContrato.application;

import Herdar_vs_CumprirContrato.model.entities.Circle;
import Herdar_vs_CumprirContrato.model.entities.Retangle;
import Herdar_vs_CumprirContrato.model.entities.Shape;
import Herdar_vs_CumprirContrato.model.enums.Color;

public class program {

    public static void main(String[] args) {

        Shape s1 = new Circle(Color.BLACK, 2.0);
        Shape s2 = new Retangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Triangle color: " + s2.getColor());
        System.out.println("Triangle area: " + String.format("%.3f", s2.area()));
    }
}

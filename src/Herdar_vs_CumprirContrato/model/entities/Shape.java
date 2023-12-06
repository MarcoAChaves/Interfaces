package Herdar_vs_CumprirContrato.model.entities;

import Herdar_vs_CumprirContrato.model.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}

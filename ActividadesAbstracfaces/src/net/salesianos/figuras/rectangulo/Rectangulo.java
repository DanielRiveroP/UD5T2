package net.salesianos.figuras.rectangulo;

import net.salesianos.calculoGeometrico.CalculoGeometrico;

public class Rectangulo implements CalculoGeometrico {
    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
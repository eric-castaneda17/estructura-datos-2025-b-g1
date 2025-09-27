package src;
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String color;

    public Triangulo(double lado1, double lado2, double lado3, String color) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.color = color;
    }

    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2; // semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public void mostrarInformacion() {
        System.out.println("Triángulo - Lados: " + lado1 + ", " + lado2 + ", " + lado3 + ", Color: " + color);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("-------------------------------------------");
    }
}

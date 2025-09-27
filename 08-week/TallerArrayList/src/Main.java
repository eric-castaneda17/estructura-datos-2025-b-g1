package src;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> figuras = new ArrayList<>();

        // Agregar círculos
        figuras.add(new Circulo(5, "Rojo"));
        figuras.add(new Circulo(3.2, "Verde"));

        // Agregar rectángulos
        figuras.add(new Rectangulo(4, 6, "Amarillo"));
        figuras.add(new Rectangulo(2.5, 8, "Azul"));

        // Agregar triángulos
        figuras.add(new Triangulo(3, 4, 5, "Negro"));
        figuras.add(new Triangulo(6, 7, 8, "Morado"));

        // Recorrer el ArrayList y mostrar la información
        for (Object figura : figuras) {
            if (figura instanceof Circulo) {
                ((Circulo) figura).mostrarInformacion();
            } else if (figura instanceof Rectangulo) {
                ((Rectangulo) figura).mostrarInformacion();
            } else if (figura instanceof Triangulo) {
                ((Triangulo) figura).mostrarInformacion();
            }
        }
    }
}

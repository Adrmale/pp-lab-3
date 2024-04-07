
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(6, 12);
        
        System.out.println("Wyniki_kola:");
        System.out.println("Dlugosc: " + rectangle.getLength());
        System.out.println("Szerokosc: " + rectangle.getWidth());
        System.out.println("Pole_prostokata: " + rectangle.calculateArea());
        System.out.println("Obwod_prostokata: " + rectangle.calculatePerimeter());
    }
}

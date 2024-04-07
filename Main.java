
public class Main {
    public static void main(String[] args) {

        Square square = new Square(8);


        System.out.println("Wyniki_kwadratu:");
        System.out.println("Dlugosc_boku: " + square.getLength());
        System.out.println("Pole_kwadratu: " + square.calculateArea());
        System.out.println("Obwod_kwadratu: " + square.calculatePerimeter());
    }
}
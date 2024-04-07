
public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Point
        Point center = new Point(0, 0);

        // Tworzenie obiektu klasy ColoredCircle i inicjowanie go wartościami
        ColoredCircle coloredCircle = new ColoredCircle(center, 5, "Red");

        // Wyświetlanie właściwości koła
        System.out.println("Wyniki_kola:");
        System.out.println("Srodek_kola: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promien: " + coloredCircle.getRadius());
        System.out.println("Obwod_kola: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole_powierzchni_kola: " + coloredCircle.getArea());
        System.out.println("Kolor_kola: " + coloredCircle.getColor());
    }
}

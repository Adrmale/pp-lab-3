
public class Main {
    public static void main(String[] args) {
       
        Point center = new Point(0, 0);

        
        Circle circle = new Circle(center, 5);

        
        System.out.println("wyniki_kola:");
        System.out.println("srodek_kola: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promien: " + circle.getRadius());
        System.out.println("Obwod kola: " + circle.calculatePerimeter());
        System.out.println("pole_powierzchni_kola: " + circle.getArea());
    }
}

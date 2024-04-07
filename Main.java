
public class Main {
    public static void main(String[] args) {
        
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(1, 1), 2);
        circles[1] = new Circle(new Point(2, 2), 6);
        circles[2] = new ColoredCircle(new Point(3, 3), 4, "yellow");

        
            for (Circle circle : circles) {
            
                double area = circle.getArea();
                System.out.println("Pole powierzchni koła: " + area);

                if (circle instanceof ColoredCircle) {
                    String color = ((ColoredCircle) circle).getColor();
                    System.out.println("Kolor koła: " + color);
                }
            }
    }
}


public class Point4 {

    double x, y;

    public Point4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point4(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void displayCoordinates() {
        System.out.println("Point Coordinates: " + x +"," +y);
    }

    public static void main(String[] args) {
        Point4 point1 = new Point4(3, 4);
        point1.displayCoordinates(); 


        Point4 point2 = new Point4(3.5, 4.5);
        point2.displayCoordinates(); 
    }
}


public class CircleAreaCalculator {
    public static void main(String[] args) {
        double radius = 5.0; // radius of the circle
        double area = Math.PI * radius * radius; // formula for area of a circle
        System.out.println("The area of the circle is " + area);

        double circumference=Math.PI*2*radius;

        System.out.println("The Circumference of the circle is "+ circumference);
    }
}
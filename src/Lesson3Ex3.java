public class Main {
    public static void main(String[] args) {
        double x1 = 1;
        double x2 = 3;
        double x3 = 6;
        double y1 = 2;
        double y2 = 5;
        double y3 = 7;

        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double p = (a + b + c)/2.0;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Площадь = " + s);
    }
}
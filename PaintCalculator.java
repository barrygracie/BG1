import java.util.*;
public class PaintCalculator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Paint Calculator\n");

        System.out.print("Enter the room length (m): ");
        double length = sc.nextDouble();
        System.out.print("Enter the room breadth (m): ");
        double breadth = sc.nextDouble();
        System.out.print("Enter the room height (m): ");
        double height = sc.nextDouble();
        System.out.print("Enter number of doors: ");
        int num_doors = sc.nextInt();
        System.out.print("Enter number of windows: ");
        int num_windows = sc.nextInt();

        System.out.print("Are you painting the ceiling? (y or n) ");
        char ceiling = sc.next().charAt(0);

        double area = (2*(length+breadth)*height) - (num_doors*0.6*1.8) - (num_windows*0.6*0.9);

        if (ceiling=='y'){
            area = area + (length*breadth);
        }
        double paint = (area * 0.1);
        double paint_rounded = (double) Math.round(paint*100)/100;
        System.out.println("You need " + paint_rounded + " litres of Paint for this room. ");

    }

}

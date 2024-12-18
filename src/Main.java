import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Кайсы фигуранын параметрлерин эсептегиңиз келет? (Parallelepiped же Cylinder):");
            String figure = scanner.nextLine().toLowerCase();

            switch (figure) {
                case "parallelepiped":
                    System.out.println("Параллелепипеддин узундугун киргизиңиз:");
                    double length = getPositiveDouble(scanner);

                    System.out.println("Параллелепипеддин туурасын киргизиңиз:");
                    double width = getPositiveDouble(scanner);

                    System.out.println("Параллелепипеддин бийиктигин киргизиңиз:");
                    double height = getPositiveDouble(scanner);

                    Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                    System.out.println("Параллелепипеддин аянты: " + parallelepiped.calculateArea());
                    System.out.println("Параллелепипеддин көлөмү: " + parallelepiped.calculateVolume());
                    break;

                case "cylinder":
                    System.out.println("Цилиндрдин радиусун киргизиңиз:");
                    double radius = getPositiveDouble(scanner);

                    System.out.println("Цилиндрдин бийиктигин киргизиңиз:");
                    double cylHeight = getPositiveDouble(scanner);

                    Cylinder cylinder = new Cylinder(radius, cylHeight);
                    System.out.println("Цилиндрдин аянты: " + cylinder.calculateArea());
                    System.out.println("Цилиндрдин көлөмү: " + cylinder.calculateVolume());
                    break;

                default:
                    throw new IllegalArgumentException("Мындай фигура жок: " + figure);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ката: Киргизилген маалымат сан эмес!");
        } catch (IllegalArgumentException e) {
            System.out.println("Ката: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Белгисиз ката: " + e.getMessage());
        }
    }

    private static double getPositiveDouble(Scanner scanner) {
        double value = scanner.nextDouble();
        if (value <= 0) {
            throw new IllegalArgumentException("Маалымат терс же нөл болбошу керек!");
        }
        return value;
    }

}
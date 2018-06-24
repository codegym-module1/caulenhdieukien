import java.util.Scanner;
public class GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac hai");
        System.out.println("Phuong trinh co dang: a*x2 + b*x + c = 0. Moi nhap cac hang so");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double delta = (b * b) - (4 * a * c);
            if (delta > 0) {
                double answer1 = (-b - Math.sqrt(delta)) / (2 * a);
                double answer2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.print("Phuong trinh co 2 nghiem x1 = " + answer1 + " va x2 = " + answer2);
            } else if (delta == 0) {
                double answer = -b / (2 * a);
                System.out.print("Phuong trinh co nghiem x = " + answer);
            } else {
                System.out.print("Phuong trinh vo nghiem");
            }
        } else {
            double ketqua = - c / b;
            System.out.print("\"Phuong trinh co nghiem x = " + ketqua);
        }

    }
}
